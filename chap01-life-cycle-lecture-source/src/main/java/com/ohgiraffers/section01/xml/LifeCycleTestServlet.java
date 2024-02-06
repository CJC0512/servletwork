package com.ohgiraffers.section01.xml;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

public class LifeCycleTestServlet extends HttpServlet {

    public LifeCycleTestServlet() {
        System.out.println("xml 방식 기본 생성자 실행!");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("xml 매핑 init() 메소드 호출!!");
    }

    @Override
    public void destroy() {
        System.out.println("xml 매핑 destroy() 메소드 호출!!");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

    }
}



