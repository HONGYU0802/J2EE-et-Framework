package contro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DaoElfImpl;
import dao.DaoHobbitImpl;
import dao.DaoNainImpl;
import ent.Elfe;
import ent.Hobbit;
import ent.Nain;

@WebServlet("/deletePassage")
public class deletePassage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str=request.getParameter("idd");	
		String str2=request.getParameter("race");	
		//System.out.println(str);			
		int id = Integer.parseInt(str);
		//System.out.println(id);		
		//System.out.println(str2);		
		HttpSession session=request.getSession();
		DaoElfImpl elfImpl=(DaoElfImpl) session.getAttribute("elfImpl");
		DaoHobbitImpl hobbitImpl=(DaoHobbitImpl) session.getAttribute("hobbitImpl");
		DaoNainImpl nainImpl=(DaoNainImpl) session.getAttribute("nainImpl");
		
		
		if(str2.equals("elfe")) {
			Elfe elfe=elfImpl.findById(id);
			elfImpl.delete(elfe);
		}
		else if(str2.equals("hobbit")) {
			Hobbit hobbit=hobbitImpl.findById(id);
			hobbitImpl.delete(hobbit);
		}
		else if(str2.equals("nain")) {
			Nain nain=nainImpl.findById(id);
			nainImpl.delete(nain);
		}
		else {
			System.out.println("delete faux");
		}

		request.getServletContext().getRequestDispatcher("/afficher.jsp").forward(request, response);
	
	}

}
