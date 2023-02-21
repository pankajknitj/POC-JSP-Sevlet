package com.rageepa;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		Map<String,User> db = DataBase.getUsers();
		String userName = req.getParameter("userName");
		String pass = req.getParameter("password");
		
		User user;
		RequestDispatcher rd;
		if(db.containsKey(userName) && db.get(userName).getPassword().equals(pass)) {
			//redirect to welcome page
			//sending responce
			user = db.get(userName);
			req.setAttribute("name", user.getName());
			rd = req.getRequestDispatcher("welcome.jsp");
			rd.forward(req, res);
		}else {
			//redirect to login with a message
			req.setAttribute("errorMessage", "please enter the correct user-name and password");
			rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, res);
		}
		
		
		
	}
}
