package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ser1")
public class ser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取一个输出流
		PrintWriter out=response.getWriter();
		//out是输出字符流，即servlet接受到request请求后，servlet使用out来返回结果，
		//不管客户端是什么（浏览器或者httpclient 或者别的serlvet等等），它都和客户端建立一个流输出管道，然后把字符流输出给请求端。
		out.println("il est midi");//直接把内容写在空白的新网页里，或者在指定位置有一段输出
	}
}
