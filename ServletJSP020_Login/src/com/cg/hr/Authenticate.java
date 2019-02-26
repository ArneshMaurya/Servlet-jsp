package com.cg.hr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Picks up Query string data(Get)
		//picks up form data(Post)
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
//		for multiple data
//		request.getParameterValues(arg0);
		RequestDispatcher dispatch=null;
		if(userName.equals("Manish")&&password.equals("Kumar"))
		{
			String fullName="Manish Kumar";
			System.out.println(fullName);
			
			//request scope
			request.setAttribute("fullName", fullName);
			
			dispatch=request.getRequestDispatcher("/WEB-INF/pages/MainMenu.jsp");
		}
		else
		{
			request.setAttribute("message", "wrong authentication plz provide correct login or password");
			dispatch=request.getRequestDispatcher("/WEB-INF/pages/Login.jsp");
		}
		dispatch.forward(request, response);
		System.out.println("User Name:"+userName);
		System.out.println("Password :"+password);
		
	}

}
