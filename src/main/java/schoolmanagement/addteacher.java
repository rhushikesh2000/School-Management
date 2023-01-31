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

@WebServlet("/addteacher")
public class addteacher  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("z");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String subject=req.getParameter("subject");
		String cno=req.getParameter("cno");
		String salary=req.getParameter("salary");
		int id1=Integer.parseInt(id);
		long cno1=Long.parseLong(cno);
		double sal1=Double.parseDouble(salary);
		teacherinfo v = em.find(teacherinfo.class, id1);
		PrintWriter pw=resp.getWriter();
		if(v==null) {
		Query q=em.createQuery("select q from teacherinfo q where q.cno=?1 ");
		q.setParameter(1, cno1);

		List<teacherinfo>l=q.getResultList();
		if (l.size()==0) {
			
		
		teacherinfo s=new teacherinfo();
		
		
		s.setId(id1);
		s.setSalary(sal1);;
		s.setCno(cno1);;
		s.setSubject(subject);;
		s.setName(name);
		et.begin();
		em.persist(s);
		et.commit();
	
	
		HttpSession htp=req.getSession();
		htp.setAttribute("teacherinfo", s);
		RequestDispatcher rd=req.getRequestDispatcher("addteacherdisplay.jsp");
		rd.forward(req, resp);
		return;
		}
		RequestDispatcher rd=req.getRequestDispatcher("addteacher.html");
		pw.write("change the number");
		rd.include(req, resp);
		resp.setContentType("text/html");
		return;
		
		}
		
		RequestDispatcher rd=req.getRequestDispatcher("addteacher.html");
		pw.write("change the id");
		rd.include(req, resp);
		resp.setContentType("text/html");
		
		
		
		
		
}}
