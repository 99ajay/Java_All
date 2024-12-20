package com.app_web_project.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

import com.app_web_project.modal.DaoService;

@WebServlet("/updateStudent")
public class UpdateControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateControler() {
        super();
     }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		request.setAttribute("email",email);
		request.setAttribute("mobile", mobile);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/update_Registration.jsp");
		rd.forward(request,response);
		
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		DaoService service = new DaoService();
		service.connectdb();
		service.updateStudent(email,mobile);
		ResultSet result = service.getAllStudent();
		request.setAttribute("result", result);
    	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/viewStudent.jsp");
	rd.forward(request,response);
	}

}
