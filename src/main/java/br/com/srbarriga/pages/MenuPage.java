package br.com.srbarriga.pages;

import br.com.srbarriga.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaInserirConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}
	
	public void acessarTelaListarConta() {
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	public void acessarTelaMovimentacao() {
		clicarLink("Criar Movimentação");
	}
	
	public void acessarTelaResumo() {
		clicarLink("Resumo Mensal");
	}
	
	
}
