/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoginDTO;
import DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author leonardo.rodrigues
 */
public class LoginDAO {
    
 
            
    
   public boolean logar(LoginDTO loginDTO) throws SQLException{
       
       boolean resultado = false;
       try {
        Connection con = Conexao.fazconexao();
         String  sql = "select * from dados_senhas where usuario=? and senha=?"; //seeciona os usuários 
        PreparedStatement stmt = con.prepareStatement(sql); //Prepara os dados para serem enviados ao banco de dados
        
        stmt.setString(1, loginDTO.getUsuario());
        stmt.setString(2, loginDTO.getSenha());
            
        ResultSet rs = stmt.executeQuery();
        
        resultado = rs.next();
        con.close();
       }catch(Exception e){
           e.printStackTrace();
	      JOptionPane.showMessageDialog(null, e);
       }
       return resultado;
       
   }
}
