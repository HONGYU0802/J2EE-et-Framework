package controleur;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletAjoute")
public class ServletAjoute extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//把刚刚输入的tache名传递到t上
		String t = request.getParameter("latache");	
		//当已有一个session与前request相关, 就返回对这个session的引用(我们在ServletLogin里创建的会话)
		HttpSession session = request.getSession();
		//该方法返回在该 session 会话中具有指定名称的对象，如果没有指定名称的对象，则返回 null。
		//Session会话的优点是数据可以跨‘类’传递，也跨到jsp中的后台代码中。（跨到任何java代码里去）
		ArrayList<String> liste = (ArrayList<String>) session.getAttribute("listeTache");
		liste.add(t);
		//ArrayList 是一个数组队列，相当于动态数组。与Java中的数组相比，它的容量能动态增长。它继承于AbstractList
		//list.add("a");
		//在第1个元素后面添加 e  ：list.add(1, "e");
		//将list1中的全部数据添加到list中：list.addAll(list1);
		//将list1中的全部数据添加到list中的第2个元素之后：list1.addAll(2,list); 
		//将list中第2个数据删除：list.remove(2);
		//将list中的数据"b"删除：list.remove("b");
		//按照list1中的数据来删除list：list.removeAll(list1);
		//清空list：list.clear();
		//将list中第2个元素，修改为M：list.set(2, "M");
		//获取list中第1个元素：String ele = list.get(0);
		request.getServletContext().getRequestDispatcher("/ajouterTaches.jsp").forward(request, response);
	}
}