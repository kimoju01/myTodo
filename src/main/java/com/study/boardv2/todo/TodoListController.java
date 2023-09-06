package com.study.boardv2.todo;

import com.study.boardv2.todo.dto.TodoDTO;
import com.study.boardv2.todo.service.TodoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/list");

        // TodoService에서 제공하는 List<TodoDTO>를 가져와서 JSP로 전달
        List<TodoDTO> dtoList = TodoService.INSTANCE.getList();
        req.setAttribute("list", dtoList);  // list라는 이름으로 List<TodoDTO> 객체를 보관 -> 보관된 데이터는 JSP에서 EL로 확인

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/list.jsp");

        dispatcher.forward(req, resp);
    }
}
