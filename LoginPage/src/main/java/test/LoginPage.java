package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/log1")
public class LoginPage extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
//<<<<<<< HEAD
		System.out.println("hi this is aarabv");
//=======
		System.out.println(" hi this is paddy");
//>>>>>>> branch 'main' of https://github.com/Pradipgorde/FullStackDeveloper
		System.out.println("Login page");
		// some chanegs in code
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		
		if(id.equals("Pradip") && pass.equals("Gorde"))
				{
			         pw.println("Login Sucessfully...");
			          
			          RequestDispatcher rd = req.getRequestDispatcher("Choice.html");
			          
			          rd.include(req, res);
			          
			             
				}else
				{
					pw.println("user Id OR Pass-word incorrect...");
					
					RequestDispatcher rd = req.getRequestDispatcher("login.html");
					rd.include(req, res);
				}
		
		
		
	}

}
