package com.anand;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/HelloGenericServlets")
public class HelloGenericServlets extends GenericServlet{
	private static final long serialVersionUID = 1L;
       
    public HelloGenericServlets() {
        super();
         }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("Hello World!!");
		out.close();
	}

}
