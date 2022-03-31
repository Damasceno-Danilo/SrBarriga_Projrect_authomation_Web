package br.com.srbarriga.tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.srbarriga.core.BaseTest;
import br.com.srbarriga.pages.ContasPage;
import br.com.srbarriga.pages.MenuPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contaPage = new ContasPage();
	
	@Test
	public void test1_InserirConta() {
		menuPage.acessarTelaInserirConta();
		
		contaPage.setNome("Conta teste");
		contaPage.salvar();
		
		Assert.assertEquals("Conta adicionada com sucesso!", contaPage.obtermensagemSucesso());
		
	}
	
	@Test
	public void test2_AlterarConta() {
		
		menuPage.acessarTelaListarConta();
		
		contaPage.clicarBotaoAlterar();
		contaPage.setNome("Conta Alterada");
		contaPage.salvar();
		
		Assert.assertEquals("Conta alterada com sucesso!", contaPage.obtermensagemSucesso());
		
	}
	
	@Test
	public void test3_InserirContaMesmoNome() {
		menuPage.acessarTelaInserirConta();
		
		contaPage.setNome("Conta Alterada");
		contaPage.salvar();
		
		Assert.assertEquals("Já existe uma conta com esse nome!", contaPage.obtermensagemErro());
	}
	
	

}
