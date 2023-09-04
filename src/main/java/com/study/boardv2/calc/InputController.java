package com.study.boardv2.calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "inputController", urlPatterns = "/calc/input")
public class InputController extends HttpServlet {

    // doGet() 메서드니까 GET 방식 호출한 경우에만 호출이 가능
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("InputController...doGet...");

        // RequestDispatcher ? 서블릿에 전달된 요청을 다른 쪽으로 전달 혹은 배포하는 객체
        // InputController는 .../input.jsp라는 목적지로 가는 중간 경유지가 된다.
        // WEB-INF 경로 ? 브라우저에서 직접 접근이 불가능한 경로 => 브라우저에서 input.jsp로 직접 호출 불가 => /calc/input으로 호출 가능
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/input.jsp");

        dispatcher.forward(req, resp);
    }
}
