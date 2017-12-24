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
@WebServlet(name = "UsersUpdateServlet", urlPatterns = "/updateusers")
public class UsersUpdateServlet extends HttpServlet {

    private UsersDAO usersDAO = new UsersDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取用户要更新的数据
        String id = request.getParameter("id");
        String nickname = request.getParameter("nickname");


        // 创建用户对象
        Users user = new Users(Integer.parseInt(id), nickname, new Date());

        // 提交更新
        usersDAO.updateUsers(user);

        // 查看更新后数据
        response.sendRedirect("/user_detail?id=" + user.getId());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
}
