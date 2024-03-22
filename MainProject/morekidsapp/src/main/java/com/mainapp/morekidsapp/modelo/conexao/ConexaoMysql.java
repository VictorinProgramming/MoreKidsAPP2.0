package com.mainapp.morekidsapp.modelo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMysql implements Conexao{

    private final String USUARIO = "morekids";
    private final String SENHA = "";
    private final String URL = "jdbc:mysql://localhost:3306/db_morekids";
    private Connection conectar;

    @Override
    public Connection obterConexao() throws SQLException {
        if(conectar == null){
            conectar = DriverManager.getConnection(URL, USUARIO, SENHA);
        }
            return conectar;
    }
}
