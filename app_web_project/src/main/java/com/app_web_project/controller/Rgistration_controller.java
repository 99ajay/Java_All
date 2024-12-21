package com.app_web_project.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.app_web_project.modal.DaoService;

@WebServlet("/add_Registration")
public class Rgistration_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Rgistration_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/addRegistration.jsp");
		 rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			 HttpSession session = request.getSession(false);
			 session.setMaxInactiveInterval(5);

		 if(session.getAttribute("email")!=null) {
		 String name = request.getParameter("name");
		 String email = request.getParameter("email");
		 String password = request.getParameter("mobile");
		 
		 DaoService service = new DaoService();
		 service.connectdb();
		 service.addStudent(name, email, password);
		 request.setAttribute("message","Student record is added......");
		 RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/addRegistration.jsp");
		 rd.forward(request, response);
		 }
		 else {
			 RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			 rd.forward(request, response);
		 }
		}catch(Exception e) {
			 RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			 rd.forward(request, response);		}
		 
	} 

}
