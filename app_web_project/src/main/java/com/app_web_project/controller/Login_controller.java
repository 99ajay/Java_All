package com.app_web_project.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.app_web_project.modal.DaoService;

@WebServlet("/verifyLogin")
public class Login_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login_controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		DaoService service = new DaoService();
		service.connectdb();
		boolean status = service.verifyLogin(email,password);
		if(status) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/addRegistration.jsp");
			rd.forward(request, response);
 		}
		else {
			request.setAttribute("error", "invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
		
		
		
	}

}
