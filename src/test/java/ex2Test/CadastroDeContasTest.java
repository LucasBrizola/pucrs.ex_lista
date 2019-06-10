package ex2Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.pucrs.ex_email.ex1.ContaCorrente;
import com.pucrs.ex_email.ex2.CadastroDeConta;

public class CadastroDeContasTest {

	@Test
	public void deveCriarUmaConta() {
		CadastroDeConta cadastro = new CadastroDeConta();
		ContaCorrente novaConta = new ContaCorrente();
		novaConta.setNroConta(0100);
		cadastro.novaContaCorrente(novaConta);
		assertEquals(true, cadastro.novaContaCorrente(novaConta));
	}
}
