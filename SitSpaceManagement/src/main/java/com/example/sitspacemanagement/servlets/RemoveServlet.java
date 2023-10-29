package com.example.sitspacemanagement.servlets;

import com.example.sitspacemanagement.models.AllStudent;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RemoveServlet", value = "/RemoveServlet")
public class RemoveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        AllStudent students = (AllStudent) httpSession.getAttribute("students");

        int removeId = Integer.parseInt(request.getParameter("removeText"));
        students.removeStudent(removeId);
        httpSession.setAttribute("Message", "Removed Student ID" + removeId);
        response.sendRedirect("AddRemoveStudent.jsp");
    }
}
