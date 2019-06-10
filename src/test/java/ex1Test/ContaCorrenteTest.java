package ex1Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.pucrs.ex_email.ex1.ContaCorrente;

public class ContaCorrenteTest {

	@Test
	public void deveDepositarUmValorPositivo() {
		ContaCorrente conta = new ContaCorrente();
		conta.setSaldo(0);
		conta.deposito(10);

		assertEquals(10, conta.getSaldo(), 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void deveRetornarErroParaNumeroNegativo() {
		ContaCorrente conta = new ContaCorrente();
		conta.setValor(0);
		conta.deposito(-10);
	}

	@Test
	public void deveRetirarUmValor() {
		ContaCorrente conta = new ContaCorrente();
		conta.setSaldo(10);
		conta.retirada(10);

		assertEquals(0, conta.getSaldo(), 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void deveRetornarErroParaSaldoMenorQueValor() {
		ContaCorrente conta = new ContaCorrente();
		conta.setValor(9);
		conta.retirada(10);
	}

	@Test
	public void deveRetornarOSaldo() {
		ContaCorrente conta = new ContaCorrente();
		conta.setSaldo(100);
		conta.deposito(30);
		conta.retirada(20);

		assertEquals(110, conta.getSaldo(), 0);
	}

	@Test
	public void deveRetornarNroDaConta() {
		ContaCorrente conta = new ContaCorrente();
		conta.setNroConta(010035112040);

		assertEquals(010035112040, conta.getNroConta());
	}

}
