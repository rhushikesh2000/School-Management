package schoolmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/updatech")
public class updateteachinfo extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("z");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
	String id=req.getParameter("id");
String name=	req.getParameter("name");
String sub=	req.getParameter("sub");
String cno=	req.getParameter("cno");
String sal=	req.getParameter("sal");
int id1=Integer.parseInt(id);
double sal1=Double.parseDouble(sal);
long cno1=Long.parseLong(cno);

teacherinfo s=new teacherinfo();
s.setId(id1);
s.setCno(cno1);
s.setName(name);;
s.setSalary(sal1);;
s.setSubject(sub);;
et.begin();
em.merge(s);
et.commit();
HttpSession ht=req.getSession();
ht.setAttribute("updatedteacher1", s);
PrintWriter pw=resp.getWriter();
pw.write("updated successfully");
RequestDispatcher rd=req.getRequestDispatcher("updateteacherdisplay.jsp");
rd.include(req, resp);
resp.setContentType("text/html");
	}

}
