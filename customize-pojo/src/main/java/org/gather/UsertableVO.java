package org.gather;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class UsertableVO {
    private String id;
    private String name;
    private String nicknema;
    private String password;
    private Integer age;
    private String email;
    private String personalizedsignature;
    private String gender;
    private String chatheads;
    private String site;
    private Integer phone;
    private Date creationTime;
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNicknema() {
        return nicknema;
    }

    public void setNicknema(String nicknema) {
        this.nicknema = nicknema;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPersonalizedsignature() {
        return personalizedsignature;
    }

    public void setPersonalizedsignature(String personalizedsignature) {
        this.personalizedsignature = personalizedsignature;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getChatheads() {
        return chatheads;
    }

    public void setChatheads(String chatheads) {
        this.chatheads = chatheads;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}