package com.cg.hr;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Dispatch;


@WebServlet("/HomePage")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>HR APPLICATION</title>");
		out.print("</head>");
			out.print("<body>");
			out.print("<h1>capgemini pune</h1>");
			//out.print("<meta http-equiv='Refresh' content=5;url='Welcome.jsp'>");
			//response.sendRedirect("Welcome.jsp");
			RequestDispatcher dispatch=request.getRequestDispatcher("Welcome.jsp");
			dispatch.forward(request,response);
			out.print("</body>");
		
		out.print("</html>");
		System.out.println("someone is in my server");
		
		
	}

}
