package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.LivreForm;

public class ActionAjouter extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//本身struts1的控制器action就是单例模式，每个action只有一个实例
		LivreForm livreForm =(LivreForm)form;//这是一个地址，每次都会改变这个地址的内容，所以之前的都丢了
		System.out.println(livreForm.getArticle()+"  "+livreForm.getQuantite());
		String art=livreForm.getArticle();
		int quan=livreForm.getQuantite();
				
		HttpSession session=request.getSession();		
		ArrayList<LivreForm> liste= (ArrayList<LivreForm>) session.getAttribute("leslivres");
		
		if(livreForm!=null) {
			LivreForm livreForm2=new LivreForm();
			livreForm2.setArticle(art);
			livreForm2.setQuantite(quan);
			liste.add(livreForm2);
		}
		return mapping.findForward("ajouter");		
	}
	
}
