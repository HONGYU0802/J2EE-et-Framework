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
import ent.Personnage;
import utile.factory;


@WebServlet("/ajouterPassage")
public class ajouterPassage extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("nom");
		String race=request.getParameter("race");
		String desc=request.getParameter("desc");
		
		factory f = factory.getInstance();
		Personnage p = f.getClasse(race);
		
		p.setNom(nom);
		p.setRace(race);
		p.setDesc(desc);
				
		//System.out.println(p.getNom()+"  "+p.getRace()+"  "+p.getDesc());
				
		HttpSession session=request.getSession();	
		DaoElfImpl elfImpl=new DaoElfImpl();		
		session.setAttribute("elfImpl", elfImpl);
		
		DaoHobbitImpl hobbitImpl=new DaoHobbitImpl();		
		session.setAttribute("hobbitImpl", hobbitImpl);
		
		DaoNainImpl nainImpl=new DaoNainImpl();		
		session.setAttribute("nainImpl", nainImpl);
		
		if(p.getRace().equals("elfe")) {
			Elfe elfe=(Elfe) p;
			elfImpl.Insert(elfe);
		}
		else if(p.getRace().equals("hobbit")) {
			Hobbit hobbit=(Hobbit) p;
			hobbitImpl.Insert(hobbit);
		}
		else if(p.getRace().equals("nain")) {
			Nain nain=(Nain) p;
			nainImpl.Insert(nain);
		}
		else {
			System.out.println("manquer la race");
		}
		
		
		request.getServletContext().getRequestDispatcher("/formulaire.html").forward(request, response);
	}
}
