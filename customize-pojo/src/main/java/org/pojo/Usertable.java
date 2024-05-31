package org.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Usertable {
    /**
     * 用户id
     */
    @Id
    private Integer id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户昵称
     */
    private String nicknema;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 个性签名
     */
    @Column(name = "personalizedSignature")
    private String personalizedsignature;

    /**
     * 性别
     */
    private String gender;

    /**
     * 聊天头像
     */
    @Column(name = "ChatHeads")
    private String chatheads;

    /**
     * 手机号
     */
    @Column(name = "Phone")
    private Integer phone;

    /**
     * 地址
     */
    private String site;

    /**
     * 创建时间
     */
    @Column(name = "creation_time")
    private Date creationTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取用户id
     *
     * @return id - 用户id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户id
     *
     * @param id 用户id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名称
     *
     * @return name - 用户名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名称
     *
     * @param name 用户名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户昵称
     *
     * @return nicknema - 用户昵称
     */
    public String getNicknema() {
        return nicknema;
    }

    /**
     * 设置用户昵称
     *
     * @param nicknema 用户昵称
     */
    public void setNicknema(String nicknema) {
        this.nicknema = nicknema;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取个性签名
     *
     * @return personalizedSignature - 个性签名
     */
    public String getPersonalizedsignature() {
        return personalizedsignature;
    }

    /**
     * 设置个性签名
     *
     * @param personalizedsignature 个性签名
     */
    public void setPersonalizedsignature(String personalizedsignature) {
        this.personalizedsignature = personalizedsignature;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取聊天头像
     *
     * @return ChatHeads - 聊天头像
     */
    public String getChatheads() {
        return chatheads;
    }

    /**
     * 设置聊天头像
     *
     * @param chatheads 聊天头像
     */
    public void setChatheads(String chatheads) {
        this.chatheads = chatheads;
    }

    /**
     * 获取手机号
     *
     * @return Phone - 手机号
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * 获取地址
     *
     * @return site - 地址
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置地址
     *
     * @param site 地址
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * 获取创建时间
     *
     * @return creation_time - 创建时间
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置创建时间
     *
     * @param creationTime 创建时间
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}