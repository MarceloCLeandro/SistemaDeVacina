/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verificacao;

import Agendamento.Data;
import Agendamento.Endereco;
import Agendamento.Vacina;
import Usuarios.Enfermeira;
import Usuarios.Medico;
import Usuarios.Paciente;
import Usuarios.Pessoa;
import java.util.ArrayList;
import java.util.List;
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
    private ArrayList<Vacina> vacina = new ArrayList<>();
    
    
    //ArrayList<Medico> cadastroMed = new ArrayList<Medico>();
    

    public Consulta() {
    }
    
    public Medico getMedico() {
        return medico;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public ArrayList<Vacina> getVacina() {
        return vacina;
    }

    public void setVacina(ArrayList<Vacina> vacina) {
        this.vacina = vacina;
    }
    
    public static void main(String[] args) {
        
       
        
        int x;
        
        int entrada;
        entrada = Consulta.entradaUsuario();
        
        
        
        if(entrada == 1){
            Consulta.cadastrarUsuario();
            
            
            
            
            
        }else if(entrada == 2){
            Consulta.loginUsuario();
        }
        
    }
    

    public static void consultaUsuario(Medico[] medicos){
        /*
        Qual pessoa vc quer saber os dados ?
        o usuario digita o indice desejado 
        printar as informações do indice desejado
        */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(medicos[0]);
//        System.out.println(medicos[1]);
//        
//        System.out.println("Digite a pessoa que você quer ver os dados: ");
        
      //  System.out.println(medicos[1].getNome());
        
    }
    
    //Cadastro de Usuarios
    public static boolean cadastrarUsuario(){
        int inputUsuario = 0;//inicializando com um valor padrão
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Qual o perfil desejado ?");
            System.out.println("1 - Medico");
            System.out.println("2 - Paciente");
            System.out.println("3 - Enfermeira");
            
            inputUsuario = Consulta.validacaoInt(scanner);
            
        }while(inputUsuario != 1 && inputUsuario != 2 && inputUsuario != 3);
       
        switch(inputUsuario){
            case 1:
                System.out.println("Case Médico");
      
                ArrayList<Medico> listMedico = new ArrayList();
                listMedico.add(Consulta.cadastroDeMedico());
                listMedico.get(0);
                break;
            case 2:
                System.out.println("Case Paciente");
                Consulta.cadastroDePaciente();
                break;
            case 3:
                System.out.println("Case Enfermeira");
                Consulta.cadastroDeEnfermeira();
                break;
        }
        
        
        return true;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static ArrayList<Medico> setMedicos(ArrayList<Medico> Medico) { 
                ////////////////////Atenção Atenção Atencão

            return Medico;
        }
    
        
        //ArrayList<Enfermeira> cadastroEnf = new ArrayList<Enfermeira>();
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Cadastro de Medico
    public static Medico cadastroDeMedico(){
               
        Medico medico = new Medico();
        Medico medico2 = new Medico();
        Endereco endereco = new Endereco();
        Scanner scanner = new Scanner(System.in);
       //  instancia   //      construtor

         List<Medico> listMedico = new ArrayList();
         
//        listMedico.add(medico);
        //objMed.add(cadastroDeMedico(medico));
        //listMedico.cadastroMed.add(new Medico());
        //cadastroMed.add(medico);


        /*        C R U D
        *** Create - Criar um registro ***
        Read - Ler um registro (Consulta)
        Update - Altera um registro
        Delete - Apaga um registro
        */
        System.out.println("Logradouro: RUA ou AVENIDA: ");//logradouro String
        endereco.setLogradouro(scanner.next());
        
        System.out.println("Nome do sua Rua: ");//Rua String
        endereco.setNome(scanner.next());
        
        System.out.println("Digite o numero da sua casa: ");//Numero da casa int
        endereco.setNumero(scanner.nextInt());
        
        System.out.println("Digite seu bairro: ");//Bairro String
        endereco.setBairro(scanner.next());
        
        System.out.println("Qual é sua cidade? ");//Cidade String
        endereco.setCidade(scanner.next());
        
        System.out.println("Qual estado? ");//Estado String
        endereco.setEstado(scanner.next());
        
        medico.setEndereco(endereco);//salva endereco em medico
        
        System.out.println("Digite o CRR:");//CRM int
        medico.setCRM(scanner.nextInt());
        
        System.out.println("Qual sua especialidade? ");//Especialidade String
        medico.setEspecialidade(scanner.next());
        
        System.out.println("Residente? ");//Residente Boolean
        medico.setResidente(scanner.nextBoolean());
        
        System.out.println("Qual é seu nome? ");//Nome String
        medico.setNome(scanner.next());
        
        System.out.println("Qual sua idade? ");//Idade int
        medico.setIdade(scanner.nextInt());
        
        System.out.println("Qual é seu Email? ");//Email String
        medico.setEmail(scanner.next());
        
        System.out.println("Digite um nome para Login no sistema: ");//Login String
        medico.setLogin(scanner.next());
        
        System.out.println("Digite uma senha para Login no sistema: ");//Senha String
        medico.setSenha(scanner.next());
        
        System.out.println("Digite seu CPF: ");//CPF String
        medico.setCpf(scanner.nextInt());
        
        System.out.println(medico.toString());
        
        return medico;
    }
    
    //Cadastro de Paciente
    public static Paciente cadastroDePaciente(){
        String Paciente;
        
        
        Endereco endereco = new Endereco();
        Paciente paciente = new Paciente();
        Scanner scanner = new Scanner(System.in);
        
        
        /*        C R U D
        *** Create - Criar um registro ***
        Read - Ler um registro (Consulta)
        Update - Altera um registro
        Delete - Apaga um registro
        */
        System.out.println("Logradouro: RUA ou AVENIDA: ");//logradouro String
        endereco.setLogradouro(scanner.next());
        
        System.out.println("Nome do sua Rua: ");//Rua String
        endereco.setNome(scanner.next());
        
        System.out.println("Digite o numero da sua casa: ");//Numero da casa int
        endereco.setNumero(scanner.nextInt());
        
        System.out.println("Digite seu bairro: ");//Bairro String
        endereco.setBairro(scanner.next());
        
        System.out.println("Qual é sua cidade? ");//Cidade String
        endereco.setCidade(scanner.next());
        
        System.out.println("Qual estado? ");//Estado String
        endereco.setEstado(scanner.next());
        paciente.setEndereco(endereco);
        
        System.out.println("Digite seu nome: ");//Nome String
        paciente.setNome(scanner.next());
        
        System.out.println("Digite sua idade");//Idade int
        paciente.setIdade(scanner.nextInt());
        
        System.out.println("Digite seu CPF:");//CPF int
        paciente.setCpf(scanner.nextInt());
        
        System.out.println("Digite seu email: ");//Email String
        paciente.setEmail(scanner.next());
        
        System.out.println("Digite seu Login: ");// Login String
        paciente.setLogin(scanner.next());
        
        System.out.println("Digite uma senha: ");//Senha String
        paciente.setSenha(scanner.next());
        
        System.out.println("Digite seu cartão do SUS: ");//Cartão SUS int
        paciente.setCartaoSus(scanner.nextInt());
        
        System.out.println("Digite uma data para tomar a vacina:  ");//setCartaoDeAgendamento String
        paciente.setCartaoDeAgendamento(scanner.next());
        
        System.out.println(paciente.toString());
        
        return paciente;
    }
    
    //Cadastro de Enfermeira
    public static Enfermeira cadastroDeEnfermeira(){
        String Enfermeira;
        
        Scanner scanner = new Scanner(System.in);
        Endereco endereco = new Endereco();
        Enfermeira enfermeira = new Enfermeira();
        
        
        System.out.println("Logradouro: RUA ou AVENIDA: ");//logradouro String
        endereco.setLogradouro(scanner.next());
        
        System.out.println("Nome do sua Rua: ");//Rua String
        endereco.setNome(scanner.next());
        
        System.out.println("Digite o numero da sua casa: ");//Numero da casa int
        endereco.setNumero(scanner.nextInt());
        
        System.out.println("Digite seu bairro: ");//Bairro String
        endereco.setBairro(scanner.next());
        
        System.out.println("Qual é sua cidade? ");//Cidade String
        endereco.setCidade(scanner.next());
        
        System.out.println("Qual estado? ");//Estado String
        endereco.setEstado(scanner.next());
        enfermeira.setEndereco(endereco);
        
        System.out.println("Digite o seu nome: ");// nome String
        enfermeira.setNome(scanner.next());
        
        System.out.println("Digite sua idade: ");//Idade int
        enfermeira.setIdade(scanner.nextInt());
        
        System.out.println("Digite seu CPF: ");//CPF int
        enfermeira.setCpf(scanner.nextInt());
        
        System.out.println("Digite seu email: ");//Email String
        enfermeira.setEmail(scanner.next());
        
        System.out.println("Digite um Login: ");//Login String
        enfermeira.setLogin(scanner.next());
        
        System.out.println("Digite uma senha: ");//Senha String
        enfermeira.setSenha(scanner.next());
        
        System.out.println("Digite seu Coren: ");//Coren int
        enfermeira.setCoren(scanner.nextInt());
        
        System.out.println(enfermeira.toString());
        return enfermeira;
    }
    
    //Login de Usuario NOK
    public static boolean loginUsuario(){
        Scanner scanner = new Scanner(System.in);
        String email;
        String senha;
        
        System.out.println("Digite o seu e-mail: ");
        email = scanner.next();
        
        System.out.println("Digite sua senha: ");
        senha = scanner.next();
        
        System.out.println(email + "\n" +senha);
        
        return true;
    }
    
    //Entrada do usuario OK
    public static int entradaUsuario(){
        int inputUsuario = 0;
        
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Bem Vindo ao Sistema de Vacinas");
        //Do ira sempre repetir enquanto a condição do while for verdadeira
        do {
            System.out.println("Selecione a opção desejada:");//aqui imprime a saudação e as opções 
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Login");
            
            inputUsuario = Consulta.validacaoInt(scanner);
        //Caso o usuario digite a opção esperada saira do While, caso digite uma opção invalia repetira
        }while((inputUsuario != 1)&&(inputUsuario != 2));
        
        return inputUsuario;
    }
    
    //Validar se o usuario digitou uma opção valida OK
    public static int validacaoInt(Scanner leitor){
        int inputUsuario = 0;
        //Esse codigo verifica se o usuario digitou uma opção valida
        //Caso ele digite qualquer coisa diferente de um inteiro
        if (leitor.hasNextInt()){
            inputUsuario = leitor.nextInt();
        }else{
            leitor.next();
            System.out.println("Opção não existe. Tente novamente: ");
        }
        return inputUsuario;
    }





}
