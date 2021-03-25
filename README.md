# SistemaDeVacina
Projeto – 2021 – 1º semestre Programação Orientada a Objetos

Curso: Ciência da Computação
Entrega: até 17/05/2021.

Descrição geral do assunto do projeto
O projeto deste semestre tem como objetivo de aplicar os conceitos estudados na disciplina de Programação Orientada a Objetos e consiste na construção de um sistema em Java que permita cadastro de itens e usuários, edições, consultas e remoções de dados. A tecnologia utilizada deve contemplar o uso do Java com interface gráfica em Swing.
O grupo deverá desenvolver algoritmos e um programa em Java, com classes específicas para resolver questões pertinentes a um Sistema de controle de vacina. As classes criadas para resolução do problema deverão ter os atributos específicos ao elemento denotado, e deverá conter todos os métodos get e set, toString e métodos construtores com parâmetros e sem parâmetros. 

Requisitos do Sistema:
1- Programação Orientada a Objetos: o desenvolvimento deverá ser efetuado utilizando a linguagem de programação Java e o IDE NetBeans, apresentando pelo menos duas telas em sua interface gráfica (login e menu inicial), com as seguintes características: 
•	utilizar os conceitos de POO; 
•	tela de autenticação com diferentes níveis de acessos diferentes (pelo menos dois), de acordo com o perfil de usuários.
•	menu para que o usuário possa escolher a funcionalidade requerida (devem obedecer ao perfil do usuário)
•	criação de objetos das diferentes classes (armazenar os dados em alguma estrutura de objetos polimorfos, como vetor ou ArrayList);
•	visualização dos objetos de uma classe específica. 
2- Técnicas de desenvolvimento de algoritmos: utilizar os conceitos de variáveis, estruturas de decisão, repetições, vetores/matrizes, métodos e deverão criar algoritmos em pseudocódigo que representem as diferentes funcionalidades do programa.
Fases do projeto
	O projeto interdisciplinar será dividido em duas etapas, consistindo em desenvolvimento do software e apresentação final.
Descrição das funcionalidades do software. 
	O sistema a ser desenvolvido é um sistema de controle de vacina. O mesmo deve possui três perfis de usuário; 
- “Médico” que pode prescrever uma vacina. 
- “Enfermeira” que pode aplicar uma vacina.
- “Paciente” que pode agendar uma consultar e consequentemente, tomar uma vacina.

Todos usuários tem acesso ao mesmo sistema, por isso, o sistema a ser desenvolvido deve possui alguma politica de acesso por perfil de usuário, isto é, na tela do paciente só pode aparece a funcionalidade de agendar consultar, por exemplo. 
	Ainda, você deve criar o sistema obedecendo o diagrama de Classe apresentado acima. Toda lógica do programa deve ser desenvolvida na classe consulta. Deve-se observar que o sistema segue um fluxo lógico, primeiro;
	- O paciente marca a consulta
	- O médico realiza uma consulta, observa a carteira de vacina do paciente e caso falte alguma vacina, o médico prescreve a vacina que o mesmo deve tomar. 
	- A enfermeira aplica a vacina. 

	É importante ressaltar que, vocês não podem usar banco de dados para armazenar os dados, os dados devem estar contidos somente na memória. Para isso, vocês podem usar os conceitos de variáveis e vetores.  
Na classe Enfermeira, você deve desenvolver o método aplicarVacina(), que recebe como parâmetro um objeto da classe vacina. Todavia, a dose da vacina é aplicada conforme a idade do paciência. Para desenvolver este método considere a tabela1 a seguir:

                    Vacina 	        0 – 2 anos     3 – 9 anos      10-18 anos      Acima de 18 anos
vacina sarampo 	                      0.40 (ml)     0.60 (ml)        0.80 (ml)	       1.00 (ml)
vacina h1n1	                          0.30 (ml)     0.60 (ml)	       0.90 (ml)	       1.20 (ml)
vacina meningite	                    0.10 (ml)     0.40 (ml)	       0.60 (ml)	       0.90 (ml)
vacina malária	                      0.25 (ml)     0.35 (ml)	       0.75 (ml)	       0.80 (ml)
Vacina covid19	                      0.20 (ml)     0.55 (ml)	       0.75 (ml)	       0.85 (ml)
Qualquer outra vacina	                0.45 (ml)     0.55 (ml)	       0.70 (ml)	       0.95 (ml)


1Os dados da tabela de doses de vacinas são meramente fictícios, tais dados não condizem com a realidade e são usados aqui somente com o sentido didático. Assim como, o fato de o médico prescrever uma vacina, sabemos que na realidade dificilmente o médico prescrever uma vacina, basta o paciente agendar uma consulta e a enfermeira aplica a vacina. Todavia, neste projeto, a figura do médico aparece como mais uma forma de treinar e aplicar os conceitos vistos em aula. Assim, realmente é necessário o desenvolvimento da classe Medico.[Sistema de Vacina.pdf](https://github.com/GuilhermePortella/SistemaDeVacina/files/6208500/Sistema.de.Vacina.pdf)
