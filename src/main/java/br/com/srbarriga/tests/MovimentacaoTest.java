package br.com.srbarriga.tests;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.srbarriga.core.BaseTest;
import br.com.srbarriga.pages.MenuPage;
import br.com.srbarriga.pages.MovimentacaoPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovimentacaoTest extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage(); 
	
	@Test
	public void test1_InserirMovimentacao() {
		menuPage.acessarTelaMovimentacao();
		
		movPage.setDataMovimentacao("30/03/2022");
		movPage.setDataPagamento("01/04/2022");
		movPage.setDescrição("Pagamento internet");
		movPage.setInteressado("Via Clip");
		movPage.setValor("1000");
		movPage.setConta("Conta Alterada");
		movPage.setStatusPago();
		movPage.salvar();
		
		Assert.assertEquals("Movimentação adicionada com sucesso!", movPage.obtermensagemSucesso());
			
	}
	
	@Test
	public void test2_CamposObrigatorios() {
		menuPage.acessarTelaMovimentacao();
		
		movPage.salvar();
		List<String> erros = movPage.obterErros();
		
		Assert.assertTrue(erros.contains("Data da Movimentação é obrigatório"));
		Assert.assertTrue(erros.contains("Data do pagamento é obrigatório"));
		Assert.assertTrue(erros.contains("Descrição é obrigatório"));
		Assert.assertTrue(erros.contains("Interessado é obrigatório"));
		Assert.assertTrue(erros.contains("Valor é obrigatório"));
		Assert.assertTrue(erros.contains("Valor deve ser um número"));
		
	}
	
	@Test
	public void test3_MovimentacaoFutura() {
		
		menuPage.acessarTelaMovimentacao();
		
		movPage.setDataMovimentacao("20/04/2022");
		movPage.setDataPagamento("21/04/2022");
		movPage.setDescrição("Pagamento internet");
		movPage.setInteressado("Via Clip");
		movPage.setValor("1000");
		movPage.setConta("Conta Alterada");
		movPage.setStatusPago();
		movPage.salvar();
		
		Assert.assertEquals("Data da Movimentação deve ser menor ou igual à data atual", movPage.obtermensagemErro());
	}

}
