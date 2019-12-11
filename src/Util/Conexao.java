/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author tylui
 */
public class Conexao {
    public Connection con;
    
    public Conexao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/projetoacademia?useTimezone=true&serverTimezone";
            String user = "rootS";
            String password = "rootS";
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com Susseso");
        }catch(ClassNotFoundException erro){
            System.out.println("Driver não encontrado!"+erro.getMessage());
        }catch(SQLException erro){
            System.out.println("Erro na conexão com BD!"+erro.getMessage());
        }
    }
    
    public void desconectar(){
        try{
          con.close();  
        }catch(SQLException erro){
            System.out.println("Erro ao desconectar!"+erro.getMessage());
        }
    }
}

