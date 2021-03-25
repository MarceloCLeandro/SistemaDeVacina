/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agendamento;
/**
 *
 * @author Guilherme
 */
public class Vacina {
    private String nome;
    private double dose;
    private String indicacao;
    ////////////////// Chamar a classe data //////////////////

    public Vacina() {
    }

    public Vacina(String nome, double dose, String indicacao) {
        this.nome = nome;
        this.dose = dose;
        this.indicacao = indicacao;
    }
    
    
}
