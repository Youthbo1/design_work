package com.fyb.servlet;

import com.fyb.dao.UsersDAO;
import com.fyb.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/12/24.
 */
@WebServlet(name = "UsersFindServlet",urlPatterns = "/index" )
public class UsersFindServlet extends HttpServlet {

    private UsersDAO usersDAO=new UsersDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Users> list=usersDAO.findAll();

        request.setAttribute("usersList",list);

        request.getRequestDispatcher("1.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);
    }
}
