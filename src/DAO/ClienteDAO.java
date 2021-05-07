/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BO.ClienteBO;
import DTO.ClienteDTO;
import DTO.LoginDTO;
import View.ClienteFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;

/**
 *
 * @author leonardo.rodrigues
 */
public class ClienteDAO {
    
    public void cadastrar(ClienteDTO clienteDTO) throws SQLException{
        
        ClienteBO clienteBO = new ClienteBO();
       
      
       try {
        Connection con = Conexao.fazconexao();
         String  sql = "insert into usuario (nome, cpf, dataNascimento, logradouro, bairro, cidade, numeroCasa, sexo) values (?, ?, ?,?,?,?,?, ?) "; //seeciona os usuários 
        PreparedStatement stmt = con.prepareStatement(sql); //Prepara os dados para serem enviados ao banco de dados
        
        stmt.setString(1, clienteDTO.getNome());
        stmt.setString(2, clienteDTO.getCpf());
        stmt.setString(3, clienteDTO.getDataNascimento());
        stmt.setString(4, clienteDTO.getLogradouro());
        stmt.setString(5, clienteDTO.getBairro());
        stmt.setString(6, clienteDTO.getCidade());
        stmt.setString(7, clienteDTO.getNumeroCasa());
       
        
       if(clienteDTO.isSexoMasc()== true){
            String valorSexo = "m";
             stmt.setString(8, valorSexo);
            
        }else{
             String valorSexo = "f";
             stmt.setString(8, valorSexo);
            
        }
             
     
      /*  if(clienteDTO.getSexoMasc().isSelected()){
            stmt.setString(8, "m");
        }else{
             stmt.setString(8, "F");
        }
       */
        
        stmt.execute();
        stmt.close();
        JOptionPane.showMessageDialog(null, "Usuario Cadastrado");
        
        
        
        con.close();
       }catch(Exception e){
           e.printStackTrace();
	      JOptionPane.showMessageDialog(null, e);
              JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
       }

       
   }
    
    
 /*   public ClienteDTO clienteDTO (int id) throws Exception{
          Connection con = Conexao.fazconexao();
        ClienteDTO clienteDTO= null;
        String sql = "select * from usuario where nome like ?";
        
      PreparedStatement stmt = con.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();
      
      while(rs.next()){
          clienteDTO = new ClienteDTO();
          clienteDTO.setNomeListagem("nome");
          
          
      }
      
      return clienteDTO;
               
        
        
    }
    */
    public void excluir() throws SQLException{
         ClienteDTO clienteDTO = new ClienteDTO();
         ClienteFrame cf = new ClienteFrame(0);
         
         

         
         if(cf.getLinhaSelecionada()== -1){
             JOptionPane.showMessageDialog(null, "Selecione uma linha");
         }else{

             java.sql.Connection con = Conexao.fazconexao();
             
             String  sql = "delete from usuario where id = ?";
             
             
             PreparedStatement stmt = con.prepareStatement(sql);
             
             stmt.setString(1, String.valueOf(clienteDTO.getId()));
             
             stmt.execute();
             stmt.close();
             con.close();
             
             JOptionPane.showMessageDialog(null, "excluido com sucesso!");
         }
    }
    
    public static ResultSet  carregaCombo() throws SQLException{
        ClienteDTO clienteDTO = new ClienteDTO();

            java.sql.Connection con = Conexao.fazconexao();
            String  sql = "select * from uf ";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
          
            
    
            return rs ;
      
          
        
        
    }
        
    
    
    
}
