# Sistema De Controle De Vacina

 Projeto P.O.O / Sistema feito em Apache NetBeans
 
<h3> Projeto – 2021 – 1º semestre
Programação Orientada a Objetos</h3>


Curso: Ciência da Computação
Entrega: até 17/05/2021.
Grupos: entre 4 e 6 alunos.

<h4>Motivação</h4>
Este projeto oferece os desafios à altura de um curso de Ciência da Computação pois reúne, de uma só vez, habilidades adquiridas em diversas áreas da computação, em especial àquelas voltadas ao desenvolvimento algoritmos e programação em Java, além de incentivar a pesquisa.

<h4>Descrição geral do assunto do projeto</h4>
O projeto deste semestre tem como objetivo de aplicar os conceitos estudados na disciplina de Programação Orientada a Objetos e consiste na construção de um sistema em Java que permita cadastro de itens e usuários, edições, consultas e remoções de dados. A tecnologia utilizada deve contemplar o uso do Java com interface gráfica em Swing.
O grupo deverá desenvolver algoritmos e um programa em Java, com classes específicas para resolver questões pertinentes a um Sistema de controle de vacina.
As classes criadas para resolução do problema deverão ter os atributos específicos ao elemento denotado, e deverá conter todos os métodos get e set, toString e métodos construtores com parâmetros e sem parâmetros. A seguir, segue o diagrama de Classe que vocês deveram seguir: 

![Diagrama projeto](https://user-images.githubusercontent.com/65774706/112736454-96bbed80-8f31-11eb-8da5-697cf3e3a446.png)

	Figura 1: Diagrama de classe – Controle de vacina

<h4>Requisitos do Sistema:</h4>

 <b>1- Programação Orientada a Objetos:</b> o desenvolvimento deverá ser efetuado utilizando a linguagem de programação Java e o IDE NetBeans, apresentando pelo menos duas telas em sua interface gráfica (login e menu inicial), com as seguintes características:
 
 
  •	utilizar os conceitos de POO; 
  
  •	tela de autenticação com diferentes níveis de acessos diferentes (pelo menos dois), de acordo com o perfil de usuários.
  
  •	menu para que o usuário possa escolher a funcionalidade requerida (devem obedecer ao perfil do usuário)
  
  •	criação de objetos das diferentes classes (armazenar os dados em alguma estrutura de objetos polimorfos, como vetor ou ArrayList);
  
  •	visualização dos objetos de uma classe específica. 
  
 <b>2- Técnicas de desenvolvimento de algoritmos:</b>
 
 utilizar os conceitos de variáveis, estruturas de decisão, repetições, vetores/matrizes, métodos e deverão criar algoritmos em pseudocódigo que representem as diferentes funcionalidades do programa.
 
<h4>Fases do projeto</h4>

O projeto interdisciplinar será dividido em duas etapas, consistindo em <b>desenvolvimento do software</b> e <b>apresentação final</b>.

<h4>Descrição das funcionalidades do software.</h4>

O sistema a ser desenvolvido é um <b>sistema de controle de vacina</b>. O mesmo deve possui três perfis de usuário; 

  •	“Médico” que pode prescrever uma vacina. 
  
  •	“Enfermeira” que pode aplicar uma vacina.

  •	“Paciente” que pode agendar uma consultar e consequentemente, tomar uma vacina.

Todos usuários tem acesso ao mesmo sistema, por isso, o sistema a ser desenvolvido deve possui alguma politica de acesso por perfil de usuário, isto é, na tela do paciente só pode aparece a funcionalidade de agendar consultar, por exemplo. 
Ainda, você deve criar o sistema obedecendo o diagrama de Classe apresentado acima. Toda lógica do programa deve ser desenvolvida na classe consulta. Deve-se observar que o sistema segue um fluxo lógico, primeiro;
	
  •	O paciente marca a consulta
  
  •	O médico realiza uma consulta, observa a carteira de vacina do paciente e caso falte alguma vacina, o médico prescreve a vacina que o mesmo deve tomar. 
  
  •	A enfermeira aplica a vacina. 
  

É importante ressaltar que, vocês não podem usar banco de dados para armazenar os dados, os dados devem estar contidos somente na memória. Para isso, vocês podem usar os conceitos de variáveis e vetores.  
Na classe Enfermeira, você deve desenvolver o método aplicarVacina(), que recebe como parâmetro um objeto da classe vacina. Todavia, a dose da vacina é aplicada conforme a idade do paciência. Para desenvolver este método considere a tabela1 a seguir:

___________________________________________________________________________________________

<table>
	<tr>
        <td>Vacina</td>
        <td>0 – 2 anos</td>
        <td>3 – 9 anos</td>
	<td>10-18 anos</td>
	<td>Acima de 18 anos</td>
    	</tr>
	<tr>
        <td>Vacina Sarampo</td>
        <td>0.40 (ml)</td>
        <td>0.60 (ml)</td>
	<td>0.80 (ml)</td>
	<td>1.00 (ml)</td>
    	</tr>
	<tr>
        <td>Vacina H1N1</td>
        <td>0.30 (ml)</td>
        <td>0.60 (ml)</td>
	<td>0.90 (ml)</td>
	<td>1.20 (ml)</td>
    	</tr>
	<tr>
        <td>Vacina Meningite</td>
        <td>0.10 (ml)</td>
        <td>0.40 (ml)</td>
	<td>0.60 (ml)</td>
	<td>0.90 (ml)</td>
    	</tr>
	<tr>
        <td>Vacina Malária</td>
        <td>0.25 (ml)</td>
        <td>0.35 (ml)</td>
	<td>0.75 (ml)</td>
	<td>0.80 (ml)</td>
    	</tr>
	<tr>
        <td>Vacina Covid-19</td>
        <td>0.20 (ml)</td>
        <td>0.55 (ml)</td>
	<td>0.75 (ml)</td>
	<td>0.85 (ml)</td>
    	</tr>
	<tr>
        <td>Qualquer outra Vacina</td>
        <td>0.45 (ml)</td>
        <td>0.55 (ml)</td>
	<td>0.70 (ml)</td>
	<td>0.95 (ml)</td>
    	</tr>
	

</table>

	Tabela 1: Faixa etária da dose de vacina.
___________________________________________________________________________________________

Os dados da tabela de doses de vacinas são meramente fictícios, tais dados não condizem com a realidade e são usados aqui somente com o sentido didático. Assim como, o fato de o médico prescrever uma vacina, sabemos que na realidade dificilmente o médico prescrever uma vacina, basta o paciente agendar uma consulta e a enfermeira aplica a vacina. Todavia, neste projeto, a figura do médico aparece como mais uma forma de treinar e aplicar os conceitos vistos em aula. Assim, realmente é necessário o desenvolvimento da classe Medico.[Sistema de Vacina.pdf]
(https://github.com/GuilhermePortella/SistemaDeVacina/files/6208500/Sistema.de.Vacina.pdf)
