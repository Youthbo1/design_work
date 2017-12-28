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
@WebServlet(name = "UsersDelServlet",urlPatterns ="/deluser" )
public class UsersDelServlet extends HttpServlet {

    private UsersDAO usersDAO = new UsersDAO();
//'用户状态 0 正常 1 锁定 2 删除'
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String type = request.getParameter("type");

        // 判断删除或锁定
        if ("lock".equals(type)) {
            // 锁定：update
            Users user = new Users();
            user.setId(Integer.parseInt(id));
            user.setUserStatus(1);

            usersDAO.updateUsers(user);

        } else if ("del".equals(type)) {
            usersDAO.delUsers(Integer.parseInt(id));
        } else if("unlock".equals(type)) {
            // 解锁
            Users user = new Users();
            user.setId(Integer.parseInt(id));
            user.setUserStatus(0);

            usersDAO.updateUsers(user);
        }
        // 跳转到首页
        response.sendRedirect(request.getContextPath()+"/index");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);
    }
}
