package com.fyb.servlet;

import com.fyb.dao.UsersDAO;
import com.fyb.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/12/24.
 */
@WebServlet(name = "UsersFindByIdServlet",urlPatterns = "/user_detail")
public class UsersFindByIdServlet extends HttpServlet {
    private UsersDAO usersDAO = new UsersDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id=request.getParameter("id");

        Users user=usersDAO.findById(Integer.parseInt(id));

        request.setAttribute("user",user);

        request.getRequestDispatcher("user_detail.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
