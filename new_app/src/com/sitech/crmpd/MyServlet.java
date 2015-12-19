package com.sitech.crmpd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.lf5.util.StreamUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sitech.market.service.trading.inter.IHDMAct;

public class MyServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletInputStream sis = req.getInputStream();
		byte[] b = StreamUtils.getBytes(sis);
		String par = new String(b);
		System.out.println(par);
		System.out.println(getServletName());
		System.out.println(req.getAttribute("aaa"));
		System.out.println(req.getParameter("aaa"));
		System.out.println(req.getParameterMap());
		System.out.println(req.getLocalName());
		System.out.println(req.getAuthType());
		System.out.println(req.getContextPath());
		
		ApplicationContext ac1 = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		ApplicationContext ac2 = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		IHDMAct h = (IHDMAct)ac1.getBean("hDMActSvc");  
		if(h==null){
			System.out.println(111);
			h = (IHDMAct)ac2.getBean("hDMActSvc");  
		}
		
		String ret = h.createSmpLotteryInfo(req.getPathInfo());
		PrintWriter pw = resp.getWriter();
		pw.append(ret);
		pw.flush();
		pw.close();
		resp.flushBuffer();
	}
}
