package com.rageepa;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUp extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//Save the data to db
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String userName = req.getParameter("userName");
		String pass = req.getParameter("password");
		
		User user = new User(name,gender,userName,pass);
		DataBase.addUser(user);
		
		//redirect to login page
		RequestDispatcher rd = req.getRequestDispatcher("");
		rd.forward(req, res);
	}
}
