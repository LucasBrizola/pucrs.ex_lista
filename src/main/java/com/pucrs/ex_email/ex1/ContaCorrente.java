package com.pucrs.ex_email.ex1;

public class ContaCorrente {

	private double valor;
	private double saldo;
	private int nroConta;

	public double getValor() {
		return valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNroConta() {
		return nroConta;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNroConta(int nroConta) {
		this.nroConta = nroConta;
	}

	public void deposito(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("valor não pode ser negativo");
		}
		saldo += valor;

	}

	public double retirada(double valor) {
		if (saldo < valor) {
			throw new IllegalArgumentException("valor ultrapassa o saldo");
		}
		if (valor < 0) {
			throw new IllegalArgumentException("valor não pode ser negativo");
		}
		saldo -= valor;
		return valor;
	}

}
