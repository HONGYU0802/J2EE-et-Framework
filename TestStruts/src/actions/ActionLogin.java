package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionLogin implements Action{
	@Override
	public String perform(HttpServletRequest req, HttpServletResponse res) {
		
		String log=req.getParameter("nom");		
		String suite = null;
		
		if(log.equals("Titi")) {
			suite="/page1.jsp";
		}
		else suite="/erreur.jsp";
		
		return suite;
	}
}
