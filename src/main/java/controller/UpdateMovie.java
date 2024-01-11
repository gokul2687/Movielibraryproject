package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.Dao;
import dto.Movie;
@WebServlet("/edit")
@MultipartConfig(maxFileSize = 5*1024*1024)
public class UpdateMovie extends HttpServlet 
{
	@SuppressWarnings("resource")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id = Integer.parseInt(req.getParameter("movieid"));
		String name = req.getParameter("moviename");
		double price = Double.parseDouble(req.getParameter("movieprice"));
		double rating = Double.parseDouble(req.getParameter("movierating"));
		String genre = req.getParameter("moviegenre");
		String language = req.getParameter("movielanguage");
		Part imagepart = req.getPart("movieimage");
		
		Movie movie = new Movie();
		
		movie.setMovieid(id);
		movie.setMoviename(name);
		movie.setMovieprice(price);
		movie.setMovierating(rating);
		movie.setMoviegenre(genre);
		movie.setMovielanguage(language);
		movie.setMovieimage(imagepart.getInputStream().readAllBytes());
		
		Dao dao = new Dao();
		
		
//		if(imagepart.getInputStream().readAllBytes().length<1)
//		{
//			try {
//				movie = dao.getPriviousMovieImage(id);
//				movie.setMovieimage(imagepart.getInputStream().readAllBytes());
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		
//		if(imagepart.getInputStream().readAllBytes().length>0)
//		{
//			try
//			{
//				movie=dao.getPriviousMovieImage(id);
//				movie.setMovieimage(imagepart.getInputStream().readAllBytes());
//				
////				
//			} catch (ClassNotFoundException e) 
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//		}
//		
		//try 
//		{
//			dao.updateMovieDetails(movie);
//			req.setAttribute("movies", dao.getAllMovies());
//			
//			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
//			rd.include(req, resp);
//		} 
//		catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
			try 
			{
				if(imagepart.getSize()>0)
				{
					movie.setMovieimage(imagepart.getInputStream().readAllBytes());
					dao.updateMovieDetails(movie);

					req.setAttribute("movies", dao.getAllMovies());
					RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
					dispatcher.include(req, resp);
				}
				else		
				{
					Movie dbmovie = dao.findMovieById(id);
					movie.setMovieimage(dbmovie.getMovieimage());
					dao.updateMovieDetails(movie);

					req.setAttribute("movies", dao.getAllMovies());
					RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
					dispatcher.include(req, resp);

				}
			} 
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

