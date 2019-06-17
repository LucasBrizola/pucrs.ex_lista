# pucrs.ex_lista

Exercícios de Fixação

Classes

1. Crie uma classe ContaCorrente com os seguntes métodos:
a.void deposito(double valor)
b.double retirada(double valor)
c.double getSaldo()
d.int getNroConta()

2. Crie uma classe CadastroDeContas com os seguintes métodos:

a.boolean novaContaCorrente(ContaCorrente c) -> acrescenta a nova conta 
c no cadastro. Retorna true se a operação foi bem sucedida, false caso contrário;

b.ContaCorrente getConta(int nroCta)-> retorno a conta corrente
de número nroConta, null caso a conta não exista;

c.double  getSaldoTotal() ->  retorna  a  soma  dos  saldos  de  todas  as 
contas cadastradas;

d.int  qtdContas(double  noMinimo) -> retorna a quantidade de contas que
tem saldo maior ou igual a noMinimo;

3. O dono de uma rede de bares da cidade nos encomendou um sistema em Java para rodar em
tablets, para controlar o acesso de clientes ao bar. O proprietário deseja que, ao entrar
no bar, o cliente informe seu nome, cpf, idade e gênero.
A qualquer momento, ele  deseja  ser  capaz  de  consultar  quem  são as  pessoas
que estão no bar, se alguém com um determinado CPF está no bar, quantas são as pessoas e
qual a distribuição por gênero (percentual de clientes  masculinos e  femininos).
Ao sair, o cliente deve informar seu CPF, para registrar sua saída. Modele e implemente
este sistema (defina classes, com seus atributos e métodos).

4. O Mars Rover é um problema bastante utilizado por permitir discutir a definição de 
classes, e utilizar vários dos conceitos que temos estudado. Vamos exercitar, aqui, os 
princípios de projetos de classes e os fundamentos da linguagem Java.
DESAFIO: Ler arquivos em java.
DICA: veja a seção sobre IO do tutorial Java da Oracle (https://docs.oracle.com/javase/tutorial/essential/io/index.html).

A squad of robotic rovers are to be landed by NASA on a plateau on Mars.This  plateau,  which  is  curiously  rectangular,  must  be  navigated  by  the rovers  so  that  their  on  board  cameras  can  get  a  complete  view  of  the surrounding terrain to send back to Earth.A  rover's  position  is  represented  by  a  combination  of  an  x  and  y  co-ordinates and a letter representing one of the four cardinal compass points. The  plateau  is  divided  up  into  a  grid  to  simplify  navigation.  An  example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.In  order  to  control  a  rover,  NASA  sends  a  simple  string  of  letters.  The possible  letters  are  'L',  'R'  and  'M'.  'L'  and  'R'  makes  the  rover  spin  90 degrees left or right respectively, without moving from its current spot.'M' means move forward one grid point, and maintain the same heading.Assume that the square directly North from (x, y) is (x, y+1).Input (from keyboard. Hint: use Scanner class with System.in):The  first  line  of  input  is  the  upper-right  coordinates  of  the  plateau,  the lower-left coordinates are assumed to be 0,0.The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation.Each rover will be finished sequentially, which means that the second rover won't start to move until the first one has finished moving.
