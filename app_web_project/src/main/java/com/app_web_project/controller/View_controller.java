package com.app_web_project.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.ResultSet;

import com.app_web_project.modal.DaoService;


@WebServlet("/list_Student")
public class View_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public View_controller() {
        super();
     }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("email")!=null) {
		DaoService service = new DaoService();
		service.connectdb();
		ResultSet result = service.getAllStudent();
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/viewStudent.jsp");
		rd.forward(request,response);
		}
		else {
			 RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			 rd.forward(request, response);
		}
		}
		catch(Exception e) {
			 RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			 rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
