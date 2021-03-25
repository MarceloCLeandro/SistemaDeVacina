/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;
/**
 *
 * @author Guilherme
 */
public class Medico {
    private int CRM;
    private String especialidade;
    private boolean residente;//yes or no

    public Medico() {
    }
    public Medico(int CRM, String especialidade, boolean residente) {
        this.CRM = CRM;
        this.especialidade = especialidade;
        this.residente = residente;
    }
    
    
    
    
}
