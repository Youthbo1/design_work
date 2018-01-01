package com.game;

import com.game.box.BoxNameConstant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Administrator on 2018/1/1.
 */
@WebServlet(name = "game" ,urlPatterns = "/game")
public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Function function = new Function();
        String str;
        ArrayList<String> arrayList=new ArrayList<String>();
        try {
            function.put(BoxNameConstant.COMMON_BOX_NAME,new Point(0,0));
            str=function.s;
            arrayList.add(str);
            function.put(BoxNameConstant.WELL_LID_BOX,new Point(1,1));
            str=function.s;
            arrayList.add(str);
            function.put(BoxNameConstant.MUSIC_BOX,new Point(2,2));
            str=function.s;
            arrayList.add(str);
            function.put(BoxNameConstant.MAGIC_BOX,new Point(3,3));
            str=function.s;
            arrayList.add(str);
            function.put(BoxNameConstant.CONVENIENCE_STORE,new Point(4,4));
            str=function.s;
            arrayList.add(str);
            request.setAttribute("arr",arrayList);
            request.setAttribute("s",str);
            request.getRequestDispatcher("game.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
