package com.rain.forum.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Security extends HttpServlet implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		HttpSession session = request.getSession();
		Integer userId = (Integer) session.getAttribute("userId");
		Integer isManager = (Integer) session.getAttribute("isManager");
		StringBuffer url = request.getRequestURL();
		System.out.println(userId + " " + url);
		if (userId == null || isManager == null) {
			if (url != null && !"".equals(url) && url.indexOf("login") < 0 && url.indexOf("register") < 0
					&& url.indexOf("main") < 0) {
				response.sendRedirect(request.getContextPath() + "/login.jsp");
				return;
			}
		}
		chain.doFilter(arg0, arg1);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
