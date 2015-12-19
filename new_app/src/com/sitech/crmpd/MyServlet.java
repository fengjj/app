package com.sitech.crmpd;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Enumeration<String> e = req.getAttributeNames();
		System.out.println(e.hasMoreElements()+"  "+e.nextElement());
		/*for(int i = 0 ;i <e.){
			
		}*/
		resp.reset();
	}
}
