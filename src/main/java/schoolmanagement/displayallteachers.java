package schoolmanagement;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/displayallteachers")
public class displayallteachers extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("z");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
	
		
		PrintWriter pw = resp.getWriter();
		Query q=em.createQuery("select p from teacherinfo p");
		List <teacherinfo> s= q.getResultList();
			HttpSession htp = req.getSession();
			htp.setAttribute("displayallteacher", s);

			RequestDispatcher rd = req.getRequestDispatcher("displayallteacher.jsp");
			rd.forward(req, resp);

		}

}
