package com.mainapp.morekidsapp;

import com.mainapp.morekidsapp.modelo.conexao.Conexao;
import com.mainapp.morekidsapp.modelo.conexao.ConexaoMysql;

import java.sql.SQLException;
import java.sql.*;

public class Morekidsapp {

    public static void main(String[] args) throws SQLException {
        String sql = "select * from tb_tipo_produto";
        Conexao conexao = new ConexaoMysql();

        System.out.println(conexao.obterConexao());

        ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();

        while(result.next()){
            System.out.println(result.getString("nome"));
        }
    }
}
