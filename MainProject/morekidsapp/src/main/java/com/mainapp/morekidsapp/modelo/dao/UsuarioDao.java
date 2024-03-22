package com.mainapp.morekidsapp.modelo.dao;

import com.mainapp.morekidsapp.modelo.conexao.Conexao;
import com.mainapp.morekidsapp.modelo.conexao.ConexaoMysql;
import com.mainapp.morekidsapp.modelo.entity.Perfil;
import com.mainapp.morekidsapp.modelo.entity.Usuario;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    private final Conexao conexao;

    public UsuarioDao() {
        this.conexao = new ConexaoMysql();
    }

    public String salvar(Usuario usuario){
        return usuario.getId() == 0L ? adicionar(usuario) : editar(usuario);
    }

    private String adicionar(Usuario usuario) {
        String sql = "insert into tb_usuario (nome, email, login, senha, perfil) values (?, ?, ?, ?, ?)";

        Usuario usuarioTemp = buscarUsuarioPeloUsuario(usuario.getLogin());

        if (usuarioTemp != null){
            return String.format("ERROR USERNAME %s JÁ EXISTE NO BANCO DE DADOS", usuario.getLogin());
        }

        try {
            PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);

            preencherValoresPreparedStatement(preparedStatement, usuario);

            int resultado = preparedStatement.executeUpdate();
            return resultado == 1 ? "USUÁRIO ADICIONADO COM SUCESSO!" : "NÃO FOI POSSÍVEL ADICIONAR USUÁRIO!";
        } catch (SQLException e){
            return String.format("ERROR: %s", e.getMessage());
        }
    }

    private String editar (Usuario usuario){
        String sql = "update tb_usuario set nome = ?, email =  ?, login = ?, senha = ?, perfil = ? where id = ?";

        try {
            PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);

            preencherValoresPreparedStatement(preparedStatement, usuario);

            int resultado = preparedStatement.executeUpdate();
            return resultado == 1 ? "USUÁRIO EDITADO COM SUCESSO!" : "NÃO FOI POSSÍVEL EDITAR USUÁRIO!";
        } catch (SQLException e){
            return String.format("ERROR: %s", e.getMessage());
        }
    }

    private void preencherValoresPreparedStatement(PreparedStatement preparedStatement, Usuario usuario) throws SQLException {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String senhaCrypto = passwordEncoder.encode(usuario.getSenha());

        preparedStatement.setString(1, usuario.getNome());
        preparedStatement.setString(2, usuario.getEmail());
        preparedStatement.setString(3, usuario.getLogin());
        preparedStatement.setString(4, senhaCrypto);
        preparedStatement.setString(5, usuario.getPerfil().name());

        if(usuario.getId() != 0L) {
            preparedStatement.setLong(6, usuario.getId());
        }
    }

    public List<Usuario> buscarTodosUsuarios() {
        String sql = "select * from tb_usuarios";
        List<Usuario> usuarios = new ArrayList<>();
        try {
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
            while (result.next()){
                usuarios.add(getUsuario(result));
            }
        } catch (SQLException e){
            System.out.println(String.format("ERROR: ", e.getMessage()));
        }
        return usuarios;
    }

    private Usuario getUsuario(ResultSet result) throws SQLException {
        Usuario usuario = new Usuario();

        usuario.setId(result.getLong("id"));
        usuario.setNome(result.getString("nome"));
        usuario.setEmail(result.getString("email"));
        usuario.setLogin(result.getString("login"));
        usuario.setSenha(result.getString("senha"));
        usuario.setPerfil(result.getObject("perfil", Perfil.class));
        usuario.setDataHoraCriacao(result.getObject("data_hora_criacao", LocalDateTime.class));
        usuario.setUltimoLogin(result.getObject("ultimo_login", LocalDateTime.class));

        return usuario;
    }

    public Usuario buscarUsuarioPeloId(Long id) {
        String sql = String.format("select * from usuario where id = %s" , id);
        try {
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
            if (result.next()){
                return getUsuario(result);
            }
        } catch (SQLException e){
            System.out.println(String.format("ERROR: ", e.getMessage()));
        }
        return null;
    }

    public Usuario buscarUsuarioPeloUsuario(String login) {
        String sql = String.format("select * from usuario where id = %s" , login);
        try {
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
            if (result.next()){
                return getUsuario(result);
            }
        } catch (SQLException e){
            System.out.println(String.format("ERROR: ", e.getMessage()));
        }
        return null;
    }

}
