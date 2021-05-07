/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import javax.swing.JRadioButton;

/**
 *
 * @author leonardo.rodrigues
 */
public class ClienteDTO {
    
    private String nome, cpf, dataNascimento, logradouro, bairro, cidade,numeroCasa, estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    private JRadioButton sexoFem,sexoMascListagem,sexoFemListagem;
    private boolean sexoMasc;
    
    private int  id;
    
    private String nomeListagem, cpfListagem, dataNascimentoListagem, logradouroListagem, bairroListagem, cidadeListagem, 
            nueroCasaListagem;

    public boolean isSexoMasc() {
        return sexoMasc;
    }

    public void setSexoMasc(boolean sexoMasc) {
        this.sexoMasc = sexoMasc;
    }


    public JRadioButton getSexoFem() {
        return sexoFem;
    }

    public void setSexoFem(JRadioButton sexoFem) {
        this.sexoFem = sexoFem;
    }

    public JRadioButton getSexoMascListagem() {
        return sexoMascListagem;
    }

    public void setSexoMascListagem(JRadioButton sexoMascListagem) {
        this.sexoMascListagem = sexoMascListagem;
    }

    public JRadioButton getSexoFemListagem() {
        return sexoFemListagem;
    }

    public void setSexoFemListagem(JRadioButton sexoFemListagem) {
        this.sexoFemListagem = sexoFemListagem;
    }


 

   
    public String getNomeListagem() {
        return nomeListagem;
    }

    public void setNomeListagem(String nomeListagem) {
        this.nomeListagem = nomeListagem;
    }

    public String getCpfListagem() {
        return cpfListagem;
    }

    public void setCpfListagem(String cpfListagem) {
        this.cpfListagem = cpfListagem;
    }

    public String getDataNascimentoListagem() {
        return dataNascimentoListagem;
    }

    public void setDataNascimentoListagem(String dataNascimentoListagem) {
        this.dataNascimentoListagem = dataNascimentoListagem;
    }

    public String getLogradouroListagem() {
        return logradouroListagem;
    }

    public void setLogradouroListagem(String logradouroListagem) {
        this.logradouroListagem = logradouroListagem;
    }

    public String getBairroListagem() {
        return bairroListagem;
    }

    public void setBairroListagem(String bairroListagem) {
        this.bairroListagem = bairroListagem;
    }

    public String getCidadeListagem() {
        return cidadeListagem;
    }

    public void setCidadeListagem(String cidadeListagem) {
        this.cidadeListagem = cidadeListagem;
    }

    public String getNueroCasaListagem() {
        return nueroCasaListagem;
    }

    public void setNueroCasaListagem(String nueroCasaListagem) {
        this.nueroCasaListagem = nueroCasaListagem;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascumento) {
        this.dataNascimento = dataNascumento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    
    
    
}
