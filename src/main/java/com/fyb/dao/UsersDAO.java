package com.fyb.dao;

import com.fyb.entity.Users;
import com.fyb.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * \Date: 2017/12/24
 * \
 * \Description:
 * \
 */
public class UsersDAO {
    SqlSession sqlSession ;
    private List<Users> list;
    private Users user;

    private SqlSession getSession() {
        sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        return sqlSession;
    }

    //查询全部 显示在首页
    public List<Users> findAll() {
        try {
            list = getSession().selectList("findUsers");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return list;
    }

    //查询单个用户详情
    public Users findById(int id){
        try {
            user = getSession().selectOne("findUsers", new Users(id));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return user;
    }

    // 增加用户数据到DB

    public Users addUser(Users user) {
        try {
            getSession().insert("addUser", user);//返回影响行数
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return user;
    }

    //用于修改用户资料的方法

    public Users updateUsers(Users user) {
        try {
            getSession().update("updateUser", user);
            sqlSession.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return user;
    }

    //删除
    public void delUsers(Integer id) {
        try {
            getSession().delete("delUser", id);
            sqlSession.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

}
