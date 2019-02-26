package controleur;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Login;

//Servlet 处理表单数据，这些数据会根据不同的情况使用不同的方法自动解析
@WebServlet("/ServletUn")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getParameter()：您可以调用 request.getParameter() 方法来获取表单参数的值。		
		Login log = new Login(request.getParameter("lelogin"), request.getParameter("lepass"));
		/*是一个输出流 response.getWriter();这个是获取了一个输出流 输出的对象是页面 这就像System.out.print（）一样，新写了一个文件*/
//此功能没完成。。。。不懂
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("bonjour:"+log);
		out.println("<body></html>");
		
		/*HTTP 是一种"无状态"协议，这意味着每次客户端检索网页时，客户端打开一个单独的连接到 Web 服务器，服务器会自动不保留之前客户端请求的任何记录。
		但是仍然有以下三种方式来维持 Web 客户端和 Web 服务器之间的 session 会话：Cookies, URL 重写, HttpSession 对象
		Servlet 还提供了 HttpSession 接口，该接口提供了一种跨多个页面请求或访问网站时识别用户以及存储有关用户信息的方式。
		Servlet 容器使用这个接口来创建一个 HTTP 客户端和 HTTP 服务器之间的 session 会话。会话持续一个指定的时间段，跨多个连接或页面请求	*/
		/*只要你的browers不关我们就称这一系列的request与response为一个会话。一断你close就称这个会话已结束。
		虽然会话结束但并不代表你的session就被destroy.因为session是存活在server上的。它的生命完全由server来主宰 （web.xml中的设定）.*/
		/*先request.getsession()，当已有一个session与前request相关时就返回对这个session的引用，当没有时就生成一 个
		一个session在server通过一个sessionid来标识的。也就是说在一个server是不会有两个相同sessionid的 session.*/
		HttpSession session = request.getSession();
		/*public void setAttribute(String name, Object value), 该方法使用指定的名称绑定一个对象到该 session 会话。*/
		/*session.setAttribute("xyyyy",xyyy);保存. session.getAttribute("xyyyy");取得. 把自己要的数据放在session里面传来传去*/
		session.setAttribute("titi",log);
		
		//判断输入的用户是否有许可
		if( log.isValide()) {
			ArrayList<String> listeTache = new ArrayList<String>();
			session.setAttribute("listeTache", listeTache);
			request.getServletContext().getRequestDispatcher("/ajouterTaches.jsp").forward(request, response);//绝对地址
			//request.getServletContext().getRequestDispatcher("/test.html").forward(request, response);//绝对地址
		}
		else{
			request.getServletContext().getRequestDispatcher("/erreur.jsp").forward(request, response);
		}
	}
}
