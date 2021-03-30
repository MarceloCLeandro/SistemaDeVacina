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
public class Medico extends Pessoa {
    private int CRM;
    private String especialidade;
    private boolean residente;//yes or no

    public Medico() {
    }

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isResidente() {
        return residente;
    }

    public void setResidente(boolean residente) {
        this.residente = residente;
    }

    @Override
    public String toString() {
        return "Medico{" + "CRM=" + CRM + ", especialidade=" + especialidade + ", residente=" + residente + '}';
    }
    
    

    public String prescreverVacina(Vacina[] v){
        
        
        return null;
    }
    
    
}
