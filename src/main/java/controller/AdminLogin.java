package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Admin;
@WebServlet("/alogin")
public class AdminLogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		
		Dao dao = new Dao();
		
		try {
			
			
			Admin admin = dao.findEmail(email);

			
			if(admin != null)
			{

				if(admin.getAdminemail().equals(email))
				{					
					if(admin.getAdminpassword().equals(password))
					{
						req.setAttribute("movies", dao.getAllMovies());
						
						RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
						rd.include(req, resp);
					}
					else
					{
						req.setAttribute("message", "Incorrect Password");
						RequestDispatcher rd = req.getRequestDispatcher("alogin.jsp");
						rd.include(req, resp);
					}
				}	
			}
			
		} catch (ClassNotFoundException | SQLException e) 
		{
			req.setAttribute("message", "incorrect email");
			RequestDispatcher rd = req.getRequestDispatcher("alogin.jsp");
			rd.include(req, resp);
		}
	}

	
}
