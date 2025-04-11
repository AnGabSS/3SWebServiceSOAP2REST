package com.tech.padawan.ServiceSoapToRest.Model;

import java.util.Objects;

public class UserLogin {
    private String login;
    private String senha;

    public UserLogin() {
    }

    public UserLogin(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserLogin userLogin = (UserLogin) o;
        return Objects.equals(login, userLogin.login) && Objects.equals(senha, userLogin.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, senha);
    }
}
