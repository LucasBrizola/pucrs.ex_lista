package com.pucrs.ex_email.ex2;

import java.util.ArrayList;

import com.pucrs.ex_email.ex1.ContaCorrente;

public class CadastroDeConta {
	ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
	private boolean cadastrou;

	public boolean isCadastrou() {
		return cadastrou;
	}

	public void setCadastrou(boolean cadastrou) {
		this.cadastrou = cadastrou;
	}

	public ArrayList<ContaCorrente> getContas() {
		return contas;
	}

	public boolean novaContaCorrente(ContaCorrente c) {
		for (ContaCorrente contaCorrente : contas) {
			if (c.getNroConta() == contaCorrente.getNroConta()) {
				return false;
			}
		}
		contas.add(c);
		return true;
	}

	public ContaCorrente getConta(int nroConta) {
		for (ContaCorrente contaCorrente : contas) {
			if (nroConta == contaCorrente.getNroConta()) {
				return contaCorrente;
			}
		}
		return null;
	}

	public double getSaldoTotal() {
		double saldoTot = 0;
		if (contas.isEmpty()) {
			return saldoTot;
		}
		for (ContaCorrente contaCorrente : contas) {
			saldoTot += contaCorrente.getSaldo();
		}
		return saldoTot;

	}

	public int qtdContas(double noMinimo) {
		int qtdContas = 0;
		for (ContaCorrente contaCorrente : contas) {
			if (contaCorrente.getSaldo() >= noMinimo){
				qtdContas ++;
			}
		}
		
		return qtdContas;
	}
}
