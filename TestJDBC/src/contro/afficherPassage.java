package contro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DaoElfImpl;

@WebServlet("/afficherPassage")
public class afficherPassage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*PrintWriter out=response.getWriter();
		out.println("<p>laaaaa<p>");*/
		
		/*HttpSession session=request.getSession();		
		DaoElfImpl impl=(DaoElfImpl) session.getAttribute("liste");
		System.out.println(impl.findAll());*/
		
		request.getServletContext().getRequestDispatcher("/afficher.jsp").forward(request, response);
	}

}
