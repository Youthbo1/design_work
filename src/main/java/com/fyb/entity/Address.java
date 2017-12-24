package com.fyb.entity;

/**
 * \Date: 2017/12/23
 * \
 * \Description:
 * \
 */
public class Address {
    //7
    private Integer id;         // 编号
    private Users user;         // 所属用户
    private Boolean defaultAddr;  // 是否默认地址
    private String nation;      // 国家
    private String province;    // 省
    private String city;        // 市
    private String country;     // 县

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Boolean getDefaultAddr() {
        return defaultAddr;
    }

    public void setDefaultAddr(Boolean defaultAddr) {
        this.defaultAddr = defaultAddr;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
