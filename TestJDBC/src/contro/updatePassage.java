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

@WebServlet("/updatePassage")
public class updatePassage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str=request.getParameter("id");
		int id = Integer.parseInt(str);
		String nom=request.getParameter("nom");
		String race=request.getParameter("race");
		String desc=request.getParameter("desc");
		//System.out.println(id+nom+race+desc);
		
		HttpSession session=request.getSession();
		DaoElfImpl elfImpl=(DaoElfImpl) session.getAttribute("elfImpl");
		DaoHobbitImpl hobbitImpl=(DaoHobbitImpl) session.getAttribute("hobbitImpl");
		DaoNainImpl nainImpl=(DaoNainImpl) session.getAttribute("nainImpl");
		
		if(race.equals("elfe")) {
			Elfe elfe=elfImpl.findById(id);
			elfImpl.update(elfe,id,nom,race,desc);
		}
		else if(race.equals("hobbit")) {
			Hobbit hobbit=hobbitImpl.findById(id);
			hobbitImpl.update(hobbit,id,nom,race,desc);
		}
		else if(race.equals("nain")) {
			//System.out.println("==="+id+nom+race+desc);
			Nain nain=nainImpl.findById(id);
			nainImpl.update(nain,id,nom,race,desc);
		}
		else {
			System.out.println("update faux");
		}

		
		request.getServletContext().getRequestDispatcher("/afficher.jsp").forward(request, response);
	}

}
