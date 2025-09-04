package org.Bo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class UserVo {
    @ApiModelProperty(value = "用户id", name = "id", example = "123456", required = false)
    private  String id;
    @ApiModelProperty(value = "用户名", name = "name", example = "yyds", required = true)
    private  String name;
    @ApiModelProperty(value = "昵称", name = "nicknema", example = "yyds", required = false)
    private  String nicknema;
    @ApiModelProperty(value = "密码", name = "password", example = "123456", required = true)
    private  String password;
    @ApiModelProperty(value = "性别", name = "gender", example = "保密", required = false)
    private  String gender;
    @ApiModelProperty(value = "年龄", name = "age", example = "18", required = false)
    private  Integer age;
    @ApiModelProperty(value = "邮箱", name = "email", example = "123456@qq.com", required = false)
    private  String email;
    @ApiModelProperty(value = "个性签名", name = "personalizedSignature", example = "今天天气真好", required = false)
    private  String personalizedSignature;
    @ApiModelProperty(value = "头像", name = "ChatHeads", example = "图片", required = false)
    private  String ChatHeads;
    @ApiModelProperty(value = "家庭地址", name = "site", example = "浙江省杭州市", required = false)
    private  String site;
    @ApiModelProperty(value = "手机号", name = "Phone", example = "13688888888", required = false)
    private  Integer Phone;
    @ApiModelProperty(value = "创建时间", name = "creationtime", example = "创建时间", required = false)
    private Date creation_time;
    @ApiModelProperty(value = "更新时间", name = "updatetime", example = "更新时间", required = false)
    private  Date update_time;


    public String getNicknema() {
        return nicknema;
    }

    public void setNicknema(String nicknema) {
        this.nicknema = nicknema;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getpersonalizedSignature() {
        return personalizedSignature;
    }

    public void setpersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public String getChatheads() {
        return ChatHeads;
    }

    public void setChatheads(String ChatHeads) {
        this.ChatHeads = ChatHeads;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer Phone) {
        this.Phone = Phone;
    }

    public Date getCreationTime() {
        return creation_time;
    }

    public void setCreationTime(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Date getUpdateTime() {
        return update_time;
    }

    public void setUpdateTime(Date update_time) {
        this.update_time = update_time;
    }
}
