package org.eurokids.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.eurokids.doa.DataAccess;
import org.eurokids.model.Admin;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		DataAccess doa=new DataAccess();
		Admin ad =doa.getAdminForLogin(username, password);
		if (ad.getUsername()!=null&&ad.getPassword()!=null) {
			
			request.getSession().setAttribute("userInformation", ad);
			response.sendRedirect("view/adminmanager.jsp");
			
		}
		else{
			response.sendRedirect("view/login.jsp");
			return;
		}
	}

}
