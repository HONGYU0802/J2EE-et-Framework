package com.luve2code.Servlet;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.luve2code.entity.Cv;

@WebServlet("/ServletUn")
public class ServletUn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cv cv =new Cv();
		cv.setName(request.getParameter("name"));
		cv.setFirstName(request.getParameter("firstName"));
		cv.setAge(request.getParameter("age"));
		cv.setNiveau(request.getParameter("niveau"));
		
		HttpSession session= request.getSession();
		ArrayList<Cv> cvs= (ArrayList<Cv>) session.getAttribute("lesCv");
		
		if(cvs==null) {
			cvs =new ArrayList<>();
		}
		cvs.add(cv);
		session.setAttribute("cvs", cvs);
		session.setAttribute("cv", cv);
		request.setAttribute("cv", cv);//????????
				
		request.getServletContext().getRequestDispatcher("/ok.jsp").forward(request, response);
 	
		System.out.println("Deja l'ajouter");
	}

}
