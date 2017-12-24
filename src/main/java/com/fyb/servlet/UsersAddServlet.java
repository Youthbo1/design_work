package com.fyb.servlet;

import com.fyb.dao.UsersDAO;
import com.fyb.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Administrator on 2017/12/24.
 */
@WebServlet(name = "UsersAddServlet",urlPatterns = "/addusers")
public class UsersAddServlet extends HttpServlet {

    private UsersDAO usersDAO = new UsersDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取要添加的用户数据
        String username = request.getParameter("username");
        String userpass = request.getParameter("userpass");
        String nickname = request.getParameter("nickname");

        Users user = new Users(username, userpass, nickname, new Date(), new Date(), new Date(),0);

        // 将用户对象添加
        user = usersDAO.addUser(user);

        // 查看刚新增的用户数据
        response.sendRedirect("/user_detail?id=" + user.getId());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
