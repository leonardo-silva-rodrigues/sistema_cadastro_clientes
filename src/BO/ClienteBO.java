/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.ClienteDAO;
import DAO.LoginDAO;
import DTO.ClienteDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author leonardo.rodrigues
 */
public class ClienteBO {
    
    ClienteDTO clienteDTO = new ClienteDTO();
    
    public void validarCamposCadastro(String nome) throws SQLException{
        boolean ehValido=false;
        if(nome.equals("")){
              JOptionPane.showMessageDialog(null, "Nome em branco, favor insira");
              ehValido = false;
              
        }else{
           
            ehValido =true;
        }


    }
    
    
    public void cadastrar(ClienteDTO clienteDTO)throws SQLException{
        
		try {
			ClienteDAO clienteDAO = new ClienteDAO();
			
                        
		} catch(Exception exception) {
			exception.printStackTrace();
                         JOptionPane.showMessageDialog(null, "erroooooo");
			
		}
	}
    
}

