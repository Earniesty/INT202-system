package com.example.sitspacemanagement.servlets;

import com.example.sitspacemanagement.models.AllStudent;
import com.example.sitspacemanagement.models.Student;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddServlet", value = "/AddServlet")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //สร้าง session
        HttpSession httpSession = request.getSession();
        AllStudent students = (AllStudent) httpSession.getAttribute("students");

        if(students == null) {
            students = new AllStudent();
            httpSession.setAttribute("students", students);
        }

        int addId = Integer.parseInt(request.getParameter("idText"));
        String addName = request.getParameter("nameText");
        int addScore = Integer.parseInt(request.getParameter("scoreText"));
        System.out.println("TEST");
        String grade;
        if(addScore >= 80) {
            grade = "A";
        } else if(addScore >= 70) {
            grade = "B";
        } else if (addScore >= 60) {
            grade = "C";
        } else if (addScore >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        Student student = new Student(addId, addName, addScore, grade);
        students.addStudent(student);
        System.out.println("Added: " + student);
        httpSession.setAttribute("students", students);
        request.setAttribute("Message", "Add Successful" );
        request.getRequestDispatcher("/AddRemoveStudent.jsp").forward(request, response);
    }
}
