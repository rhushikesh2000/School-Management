package schoolmanagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addstudent")
public class addstudentserv extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("z");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
	String id=req.getParameter("id");
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String cno=req.getParameter("cno");
	String age=req.getParameter("age");
	int age1=Integer.parseInt(age);
	int id1=Integer.parseInt(id);
	long cno1=Long.parseLong(cno);
	studentinfo v = em.find(studentinfo.class, id1);
	PrintWriter pw=resp.getWriter();
	if(v==null) {
	Query q=em.createQuery("select q from studentinfo q where q.conno=?1 or q.email=?2");
	q.setParameter(1, cno1);
	q.setParameter(2, email);
	List<studentinfo>l=q.getResultList();
	if (l.size()==0) {
		
	
	studentinfo s=new studentinfo();
	
	
	s.setId(id1);
	s.setAge(age1);
	s.setConno(cno1);
	s.setEmail(email);
	s.setName(name);
	et.begin();
	em.persist(s);
	et.commit();
	ArrayList  <studentinfo> a = new ArrayList();
	a.add(s);
	HttpSession htp=req.getSession();
	htp.setAttribute("studentinfo", a);
	RequestDispatcher rd=req.getRequestDispatcher("addedstuddisplay.jsp");
	rd.forward(req, resp);
	return;
	}
	RequestDispatcher rd=req.getRequestDispatcher("addstudent.html");
	pw.write("change the number or email");
	rd.include(req, resp);
	resp.setContentType("text/html");
	return;
	
	}
	
	RequestDispatcher rd=req.getRequestDispatcher("addstudent.html");
	pw.write("change the id");
	rd.include(req, resp);
	resp.setContentType("text/html");
	
	
	
	
	
	
	}

}
