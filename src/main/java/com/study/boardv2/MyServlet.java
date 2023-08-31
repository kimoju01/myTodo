package com.study.boardv2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// @WebServlet ? 브라우저의 경로와 해당 서블릿을 연결하는 설정 위해 사용
@WebServlet(name = "myServlet", urlPatterns = "/my")
public class MyServlet extends HttpServlet {

    // doGet() ? 브라우저의 주소를 직접 변경해서 접근하는 경우에 호출되는 메서드
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        // PrintWriter ? 서블릿에서의 sout. PW 객체를 이용해 브라우저쪽으로 출력을 처리
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>MyServlet</h1>");
        out.println("</body></html>");
    }

}
