/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author leonardo.rodrigues
 */
public class Conexao {
    
    private static String caminho = "localhost";
    private static String porta = "3306";
    private static String nome = "db_senhas";
    private static String usuario = "escriba";
    private static String senha = "scrib130";
    
    private static  String URL = "jdbc:mysql://"+caminho+":"+porta+"/"+nome;
    
     public static Connection fazconexao(){
         try{
             
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         return DriverManager.getConnection(URL, usuario, senha);
             
        //DriverManager.getConnection(URL,usuario,senha);
          //System.out.println("conexao aceita");
        
         }catch(Exception ex ){
             System.out.println("Erro ao entrar no BD: \n "+ex);
              return null;
         }
       
     
        }
}
