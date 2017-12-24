package com.fyb.entity;

import java.util.Date;
import java.util.List;

/**
 * \Date: 2017/12/23
 * \
 * \Description:
 * \
 */
public class Users {
    //8+addresses
    private Integer id;                 // 用户编号
    private String username;            // 登录账号
    private String userpass;            // 登录密码
    private String nickname;            // 用户昵称
    private Date createTime;            // 创建时间
    private Date updateTime;            // 账号最后修改时间
    private Date lastLogin;             // 用户最后登录时间
    private Integer userStatus;         // 用户账号状态 0 正常 1 锁定 2 删除
    private List<Address> addresses;    // 用户地址信息--地址列表，有一个是默认地址

    public Users(){

    }

    public Users(String username, String userpass, String nickname, Date createTime, Date updateTime, Date lastLogin,Integer userStatus) {
        this.username = username;
        this.userpass = userpass;
        this.nickname = nickname;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.lastLogin = lastLogin;
        this.userStatus=userStatus;
    }

    public Users(Integer id, String nickname, Date updateTime) {
        this.id = id;
        this.nickname = nickname;
        this.updateTime = updateTime;
    }

    public Users(Integer id) {
        this.id = id;
    }

    public Users(String userpass, String nickname) {
        this.userpass = userpass;
        this.nickname = nickname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
