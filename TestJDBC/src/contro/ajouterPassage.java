package contro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoElfImpl;
import ent.Elfe;
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
				
		System.out.println(p.getNom()+"  "+p.getRace()+"  "+p.getDesc());
		
		Elfe elfe=(Elfe) p;
		DaoElfImpl impl=new DaoElfImpl();
		impl.Insert(elfe);
		
	}
	

}
