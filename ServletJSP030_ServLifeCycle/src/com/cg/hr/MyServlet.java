package com.cg.hr;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//init(): its for initialization and use while overriding. Initialization, Resource Allocation are done here.
//init(ServletConfig): its for initialization . Initialization, Resource Allocation are done here.
//service():This method is called on every request.Controlling, Transformation.
//destroy():This method is called while un-deploying the servlet.Resource Deallocation.
//Eager: Created at the time of starting the server. Consumes memory resources right from beginning. Normally used for the servlets which are always used by all users. Load on startup is +ve.Home, login, main menu
//Lazy: Created only when first request comes in. Normally used for servlets which may be instantiated optionally. ListAllEmps,AddnewEmps.
//Servlet API: 

@WebServlet( urlPatterns = "/myServlet",loadOnStartup = 1)
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("In Init(ServletConfig)");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("In Destroy()");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In doGet()");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
