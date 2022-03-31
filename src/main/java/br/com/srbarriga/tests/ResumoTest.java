package br.com.srbarriga.tests;

import static br.com.srbarriga.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.srbarriga.core.BaseTest;
import br.com.srbarriga.pages.MenuPage;
import br.com.srbarriga.pages.ResumoPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();

	@Test
	public void test1_ExcluirMovimentacao(){
		menuPage.acessarTelaResumo();
		
		resumoPage.excluirMovimentacao();
		
		Assert.assertEquals("Movimenta��o removida com sucesso!",
				resumoPage.obterMensagemSucesso());
	}
	
	@Test
	public void test2_resumoMensal() {
		menuPage.acessarTelaResumo();
		
		Assert.assertEquals("Seu Barriga - Extrato",getDriver().getTitle());
	}

}
