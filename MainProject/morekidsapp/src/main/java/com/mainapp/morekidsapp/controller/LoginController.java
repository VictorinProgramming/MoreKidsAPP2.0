package com.mainapp.morekidsapp.controller;

import com.mainapp.morekidsapp.modelo.dao.AutenticationDao;
import com.mainapp.morekidsapp.modelo.entity.Usuario;
import com.mainapp.morekidsapp.view.DTO.LoginDTO;
import com.mainapp.morekidsapp.view.form.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {
    private final Login login;
    private AutenticationDao autenticationDao;

    public LoginController(Login login) {
        this.login = login;
        this.autenticationDao = new AutenticationDao();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand().toLowerCase();

        switch (action){
            case "login" : login(); break;
            case "cancelar" : cancelar(); break;
        }

    }

    private void login(){
        String usuario = this.login.getTxtLoginUsuario().getText();
        String senha = this.login.getTxtLoginSenha().getText();


        if(usuario.equals("") || senha.equals("")){
            this.login.getLabelLoginMessage().setText("Usuário e senha devem ser preenchidos!");
            return;
        }

        LoginDTO loginDTO = new LoginDTO(usuario, senha);

        Usuario usuarioTemp = this.autenticationDao.login(loginDTO);

        if(usuarioTemp != null){
            JOptionPane.showMessageDialog(null, usuarioTemp.getNome());
        }else {
            this.login.getLabelLoginMessage().setText("Usuário e senha não indentificados!");
        }
    }

    private void cancelar() {

    }
}
