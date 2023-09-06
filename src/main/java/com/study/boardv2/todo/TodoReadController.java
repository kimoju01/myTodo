package com.study.boardv2.todo;

import com.study.boardv2.todo.dto.TodoDTO;
import com.study.boardv2.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoReadController", urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/read");

        // 브라우저의 주소창을 통해 전달되는 tno 파라미터 처리. ex) /read?tno=123
        // getParameter()는 항상 문자열로 결과가 나온다 -> Long 변환 필요
        Long tno = Long.parseLong(req.getParameter("tno"));

        TodoDTO dto = TodoService.INSTANCE.get(tno);

        // dto라는 이름으로 JSP에 전달
        req.setAttribute("dto", dto);

        req.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(req, resp);

    }
}
