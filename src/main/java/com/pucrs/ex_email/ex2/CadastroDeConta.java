package com.pucrs.ex_email.ex2;

import java.util.ArrayList;

import com.pucrs.ex_email.ex1.ContaCorrente;

public class CadastroDeConta {
	ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
	
	public ArrayList<ContaCorrente> getContas() {
		return contas;
	}
	
	public boolean novaContaCorrente(ContaCorrente c) {
		int flag = 0;
		for (ContaCorrente contaCorrente : contas) {
			if (c.getNroConta() != contaCorrente.getNroConta())
				contas.add(c);
			flag = 1;
		}
		if (flag == 1) {
			return true;
		} else
			return false;
	}

}
