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
import form.LoginForm;
//struts1优点：杜绝Jsp中的Java代码；
//编写Action程序
public class ActionLogin extends Action {
	/*继承了struts1中一个叫Action的类，做处理的方法名字必须是execute，四个参数中
	一个是mapping，主要是处理完后跳转用的，ActionForm是struts1中帮助我们封装的实体bean，
	剩下的request和response和servlet中的一样。*/
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		//使用form免去了反复获取值的麻烦，直接填充到form里
		//先把form转换成Formulaire的实体bean
		LoginForm formulaire=(LoginForm)form;		
		//System.out.println(formulaire.getLogin()+"  "+ formulaire.getPassword());
		
		HttpSession session=request.getSession();
		session.setAttribute("lelog",formulaire.getLogin());//把字符绑定到此字符？？
		
		if(formulaire.getLogin().equals("Titi")) {			
			ArrayList<LivreForm> liste=new ArrayList<LivreForm>();
			session.setAttribute("leslivres", liste);			
			return mapping.findForward("ajouter");
		}
		return mapping.findForward("erreur");		
	}		
}
