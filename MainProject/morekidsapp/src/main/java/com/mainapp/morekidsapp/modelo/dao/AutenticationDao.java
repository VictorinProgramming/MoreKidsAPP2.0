package com.mainapp.morekidsapp.modelo.dao;

import com.mainapp.morekidsapp.modelo.entity.Perfil;
import com.mainapp.morekidsapp.modelo.entity.Usuario;
import com.mainapp.morekidsapp.modelo.exception.NegocioException;
import com.mainapp.morekidsapp.view.DTO.LoginDTO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.swing.*;

public class AutenticationDao {
    private final UsuarioDao usuarioDao;
    public AutenticationDao() {
        this.usuarioDao = new UsuarioDao();
    }

    public boolean temPermissao(Usuario usuario){
        try {
            permissao(usuario);
            return true;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Usuario sem permissão", 0);
            return false;
        }
    }

    private void permissao(Usuario usuario){
        if (!Perfil.ADMIN.equals(usuario.getPerfil())){
            throw new NegocioException("Sem permissão para realizar essa ação");
        }
    }
    public Usuario login (LoginDTO login){
        Usuario usuario = usuarioDao.buscarUsuarioPeloUsuario(login.getUsuario());

        if(usuario == null){
            return null;
        }

        if(usuario.isEmpty() && validarSenha(usuario.getSenha(), login.getSenha())){
            return usuario;
        }
        return null;
    }

    private boolean validarSenha(String senhaUsuario, String senhaLogin) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return  passwordEncoder.matches(senhaLogin, senhaUsuario);
    }
}



// possa ter complicações no futuro, qualquer coisa voltar para resolver a questao onde o 'Estado' da tabela Sql não foi criado
// Atualizar a Tabela e reajustar o codigo com is.Estado();
// Código que será utilizado caso tenha futuras complicações


// public Usuario login (LoginDTO login){
//    Usuario usuario = usuarioDao.buscarUsuarioPeloUsuario(login.getUsuario());
//    if(usuario == null || usuario.isEstado()){
//        return null;
//    }
//    if(usuario.isEstado() && validarSenha(usuario.getSenha(), login.getSenha())){
//        return usuario;
//    }
//    return null;
// }
