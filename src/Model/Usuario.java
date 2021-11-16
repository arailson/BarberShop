/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author arailson
 */
public class Usuario extends Pessoa{
    
    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
       
    }

    public Usuario(String senha, String nivelAcesso, int id, String nome, String dataDeNascimento, String telefone, String email, String rg) {
        super(id, nome, dataDeNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    

    
}
