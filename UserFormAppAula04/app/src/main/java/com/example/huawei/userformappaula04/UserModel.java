package com.example.huawei.userformappaula04;

import java.io.Serializable;

/**
 * Created by huawei on 20/09/16.
 */
public class UserModel implements Serializable {
    private String nome;
    private String login;
    private String email;
    private String dataNascimento;
    private String senha;

    public UserModel(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public UserModel(String nome, String email, String login, String senha, String dataNascimento ){
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha=senha;
        this.dataNascimento=dataNascimento;

    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", dataDeNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
