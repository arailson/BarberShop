/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
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
        
        
        Servico servico = new Servico(1, "Cabelo Loiro", 400);
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "Rosangela", "Rua Brazilino", "08565-420");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "Cabelereiro", "senha");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 450, "23/12/2021 09:00");
        System.out.println(agendamento.getCliente().getNome());
    }
}
