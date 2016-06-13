package com.anand;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormBasedHello")
public class FormBasedHello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FormBasedHello() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String temp = request.getParameter("myTextBox");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Generate HTML response
		out.println("<html>");
		out.println("<head><title>Hello User</title></head>");
		out.println("<body> Hello " +temp +"</br>"); 
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
