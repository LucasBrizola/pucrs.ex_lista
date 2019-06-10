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
