/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verificacao;

import Agendamento.Data;
import Agendamento.Endereco;
import Usuarios.Enfermeira;
import Usuarios.Medico;
import Usuarios.Paciente;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Consulta {
    private Medico medico;
    private Enfermeira enfermeira;
    private Paciente paciente;
    private Data data;
    
    ///herdar vacina
    
    public static void main(String[] args) {
        Medico medico = new Medico();
        Endereco endereco = new Endereco();
        
        //Endereco
        endereco.setLogradouro("Rua");
        endereco.setNome("Rua quebrada");
        endereco.setNumero(10);
        endereco.setBairro("Jardim maracá");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        
        //Medico
        medico.setNome("Guilherme");
        medico.setLogin("guilhermePortella");
        medico.setSenha("123");
        medico.setCpf(89898192);
        medico.setEmail("guilherm@gmail.com");
        medico.setIdade(23);
        medico.setEndereco(endereco);
        medico.setCRM(909090909);
        medico.setResidente(false);
        medico.setEspecialidade("Neorologista");
        
        System.out.println(medico);

    }
}
