package com.springboot.entity;


import java.util.Date;

public class UsersEntity {

    @Override
    public String toString() {
        return "UsersEntity{" +
                "name='" + name + '\'' +
                ", emai='" + emai + '\'' +
                ", emailVerifiedAt='" + emailVerifiedAt + '\'' +
                ", password='" + password + '\'' +
                ", rememberToken='" + rememberToken + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    private String name;
    private String emai;
    private String emailVerifiedAt;
    private String password;
    private String rememberToken;
    private Date createdAt;
    private Date updatedAt;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public String getEmailVerifiedAt() {
        return emailVerifiedAt;
    }

    public void setEmailVerifiedAt(String emailVerifiedAt) {
        this.emailVerifiedAt = emailVerifiedAt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }





}

