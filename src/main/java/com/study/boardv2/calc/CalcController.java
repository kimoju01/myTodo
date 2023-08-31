package com.study.boardv2.calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name= "calcController", urlPatterns = "/calc/makeResult")
public class CalcController extends HttpServlet {

    // doPost() 메서드니까 POST 방식 호출한 경우에만 호출이 가능
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        System.out.printf(" num1: %s", num1);
        System.out.printf(" num2: %s", num2);

        resp.sendRedirect("/index");
    }
}
