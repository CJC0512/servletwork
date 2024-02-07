package com.ohgiraffers.section01.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/print")
public class PrintLoginSuccesServlet extends HttpServlet {
    public PrintLoginSuccesServlet() {
    }

    /* 설명. 이전 서블릿이 doPost로 처리하다가 포워딩 되면 doPost로 받아야 한다. (doGet은 doGet으로 처리) */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("==== 포워딩 된 서블릿에서 넘겨받은 request 객체에 담긴 값 확인 ====");
        System.out.println("이름: " + req.getAttribute("userName"));
        System.out.println("아이디: " + req.getParameter("userId"));
        System.out.println("패스워드: " + req.getParameter("password"));
    }
}
