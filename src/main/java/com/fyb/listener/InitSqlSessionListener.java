package com.fyb.listener;
/**
 * Created by Administrator on 2017/12/24.
 */

import com.fyb.utils.SqlSessionFactoryUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener()
public class InitSqlSessionListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("加载容器");
        SqlSessionFactoryUtils.initSqlSessionFactry();

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("销毁容器");
        SqlSessionFactoryUtils.close();
    }
}
