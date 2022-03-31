package br.com.srbarriga.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.srbarriga.core.BaseTest;
import br.com.srbarriga.pages.ContasPage;
import br.com.srbarriga.pages.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contaPage = new ContasPage();
	
	@Test	
	public void excluirContaComMovimentação() {
		menuPage.acessarTelaListarConta();
		
		contaPage.clicarBotaoExcluir();
		Assert.assertEquals("Conta em uso na movimentações", contaPage.obtermensagemErro());
		
	}

}
