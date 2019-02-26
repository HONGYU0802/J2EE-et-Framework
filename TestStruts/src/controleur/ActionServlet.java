package controleur;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import actions.Action;
import utils.UsineANew;
//自己定义框架总控制器, Struts1中的核心控制器是ActionServlet，是一个Servlet
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	
	UsineANew fact= new UsineANew() ;//生成一个控制工厂，具体命令具体调用

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String provenance = request.getServletPath();//获取标签form中的action属性值
		Action act = fact.getAction(provenance);//根据这个属性值，具体生成一个匹配的action对象
		String suite=act.perform(request, response);//此对象调用其具体的方法，此处是接口类型，具体调用其子类方法。返回想要去的路径
		//为什么不是request调用这个方法呢？
		this.getServletContext().getRequestDispatcher(suite).forward(request, response);//this指的是此ActionServlet自己
				
	}
}
