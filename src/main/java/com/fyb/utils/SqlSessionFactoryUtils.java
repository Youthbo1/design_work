package com.fyb.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * \Date: 2017/12/23
 * \
 * \Description:
 * \封装：使用Mybatis框架的一些步骤
 */
public class SqlSessionFactoryUtils {
    private static String RESOURCE = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory;
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
    //创建一个初始化SqlSessionFactory的方法
    public static void initSqlSessionFactry() {
        try {
            InputStream is = Resources.getResourceAsStream(RESOURCE);

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取工厂对象的方法
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
    // 关闭SqlSession的方法
    public static void close() {
        SqlSession session = threadLocal.get();
        if (session != null) {
            session.close();
            threadLocal.set(null);
        }
    }
}
