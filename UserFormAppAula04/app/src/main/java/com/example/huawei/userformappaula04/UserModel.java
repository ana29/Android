package com.example.huawei.userformappaula04;

import java.io.Serializable;

/**
 * Created by huawei on 20/09/16.
 */
public class UserModel implements Serializable {
    private String name;
    private String login;
    private String email;
    private String birthdate;
    private String password;

    public UserModel(String name, String email){
        this.name = name;
        this.email = email;
    }
    public UserModel(String name, String email, String login, String password, String birthdate ){
        this.name = name;
        this.email = email;
        this.login = login;
        this.password=password;
        this.birthdate =birthdate;

    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
