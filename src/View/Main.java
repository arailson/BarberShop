/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author arailson
 */
public class Main {
    
    public static void main(String[] args) {
        
        String nome = "Arailson";
        System.out.println(nome);
        
        
        Servico servico = new Servico(1, "Cabelo", 20);
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "Renatinha", 'M', "949536709", "Rua das Acuaminas");
        System.out.println(cliente);
        
        Usuario usuario = new Usuario(1, "Barbeiro", "senha");
        System.out.println(usuario);
        
    }
}
