package ex2Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.pucrs.ex_email.ex1.ContaCorrente;
import com.pucrs.ex_email.ex2.CadastroDeConta;

public class CadastroDeContasTest {
	private CadastroDeConta cadastro;
	private ContaCorrente novaConta;
	private ContaCorrente outraConta;

	@Before
	public void setup() {
		cadastro = new CadastroDeConta();
		novaConta = new ContaCorrente();
		outraConta = new ContaCorrente();
	}

	@Test
	public void deveCriarDuasConta() {
		outraConta.setNroConta(0101);
		novaConta.setNroConta(0100);
		assertEquals(false, cadastro.isCadastrou());
		cadastro.setCadastrou(cadastro.novaContaCorrente(novaConta));
		assertEquals(true, cadastro.isCadastrou());
		cadastro.setCadastrou(cadastro.novaContaCorrente(outraConta));
		assertEquals(true, cadastro.isCadastrou());
		assertEquals(novaConta, cadastro.getConta(0100));
	}

	@Test
	public void deveTentarCriarDuasContasIguais() {
		outraConta.setNroConta(0100);
		novaConta.setNroConta(0100);
		assertEquals(false, cadastro.isCadastrou());
		cadastro.setCadastrou(cadastro.novaContaCorrente(novaConta));
		assertEquals(true, cadastro.isCadastrou());
		cadastro.setCadastrou(cadastro.novaContaCorrente(outraConta));
		assertEquals(false, cadastro.isCadastrou());
	}

	@Test
	public void deveRetornarNumeroDaConta() {
		outraConta.setNroConta(0101);
		novaConta.setNroConta(0100);
		cadastro.setCadastrou(cadastro.novaContaCorrente(outraConta));
		cadastro.setCadastrou(cadastro.novaContaCorrente(novaConta));

		assertEquals(novaConta, cadastro.getConta(0100));
	}

	@Test
	public void nãoDeveRetornarNumeroDaConta() {
		outraConta.setNroConta(0101);
		novaConta.setNroConta(0100);
		cadastro.setCadastrou(cadastro.novaContaCorrente(outraConta));
		cadastro.setCadastrou(cadastro.novaContaCorrente(novaConta));

		assertEquals(null, cadastro.getConta(0102));
	}

	@Test
	public void deveRetornarSaldoTotal() {
		outraConta.setNroConta(0101);
		novaConta.setNroConta(0100);
		outraConta.setSaldo(100.0);
		novaConta.setSaldo(150.30);
		cadastro.setCadastrou(cadastro.novaContaCorrente(outraConta));
		cadastro.setCadastrou(cadastro.novaContaCorrente(novaConta));

		assertEquals(250.30, cadastro.getSaldoTotal(), 0);
	}

	@Test
	public void deveRetornarSaldoTotalZerado() {
		outraConta.setNroConta(0101);
		novaConta.setNroConta(0100);
		outraConta.setSaldo(0.0);
		novaConta.setSaldo(0.0);
		cadastro.setCadastrou(cadastro.novaContaCorrente(outraConta));
		cadastro.setCadastrou(cadastro.novaContaCorrente(novaConta));

		assertEquals(0, cadastro.getSaldoTotal(), 0);
	}

	@Test
	public void deveRetornarQtdContasZerado() {
		outraConta.setNroConta(0101);
		novaConta.setNroConta(0100);
		outraConta.setSaldo(100.0);
		novaConta.setSaldo(130.5);
		cadastro.setCadastrou(cadastro.novaContaCorrente(outraConta));
		cadastro.setCadastrou(cadastro.novaContaCorrente(novaConta));

		assertEquals(0, cadastro.qtdContas(150));
	}
	
	@Test
	public void deveRetornarQtdContasIgualADois() {
		outraConta.setNroConta(0101);
		novaConta.setNroConta(0100);
		outraConta.setSaldo(100.0);
		novaConta.setSaldo(130.5);
		cadastro.setCadastrou(cadastro.novaContaCorrente(outraConta));
		cadastro.setCadastrou(cadastro.novaContaCorrente(novaConta));

		assertEquals(2, cadastro.qtdContas(100.0));
	}

}
