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
public class Pessoa {
    private String nome;
    private int idade;
    private int cpf;
    private String email;
    private String login;
    private String senha;
    private String endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, int cpf, String email, String login, String senha, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
    }
    
    
    
    
}
