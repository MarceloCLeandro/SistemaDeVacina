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
public class Data {
    private int dia;
    private int mes;
    private int ano;

    //metodo construtor sem parametros
    public Data() {
    }


    // gets e sets, metodos de acesso
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        //Estudar metodo String.format()
        String data = this.dia + "/" + this.mes + "/" + this.ano;
        return data;
    }
    
    
    
}
