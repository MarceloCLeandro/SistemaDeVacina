/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Agendamento.Vacina;

/**
 *
 * @author Guilherme
 */
public class Paciente extends Pessoa {
    private String cartaoDeAgendamento;
    private int cartaoSus;

    public Paciente() {
    }

    public Paciente(String cartaoDeAgendamento, int cartaoSus) {
        this.cartaoDeAgendamento = cartaoDeAgendamento;
        this.cartaoSus = cartaoSus;
    }

    
    
    public String getCartaoDeAgendamento() {
        return cartaoDeAgendamento;
    }

    public void setCartaoDeAgendamento(String cartaoDeAgendamento) {
        this.cartaoDeAgendamento = cartaoDeAgendamento;
    }

    public int getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(int cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public void agendaConsulta(Vacina[] v){
        
    }

    @Override
    public String toString() {
        return nome + ", " + cartaoSus + ", " + idade;
    }
    
    
    
}
