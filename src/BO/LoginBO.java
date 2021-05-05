/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.LoginDAO;
import DTO.LoginDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author leonardo.rodrigues
 */
public class LoginBO {
    
    
    public boolean logar(LoginDTO loginDTO){
        boolean resultado = false;
  
        
        try {
            if(loginDTO.getUsuario().equals("")|| loginDTO.getSenha().equals("")){
               JOptionPane.showMessageDialog(null, "Favor preencher usuario e senha!");
            }else{
                LoginDAO loginDAO = new LoginDAO();
                resultado = loginDAO.logar(loginDTO);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return resultado;
    }
    
}
