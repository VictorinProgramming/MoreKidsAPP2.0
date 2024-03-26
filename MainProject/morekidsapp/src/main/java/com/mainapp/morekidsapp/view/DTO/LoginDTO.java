package com.mainapp.morekidsapp.view.DTO;

public class LoginDTO {


    private String usuario;
    private String senha;

    public LoginDTO (String usuario, String senha){
            this.usuario = usuario;
            this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
