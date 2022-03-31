package br.com.srbarriga.pages;

import org.openqa.selenium.By;

import br.com.srbarriga.core.BasePage;

public class ContasPage extends BasePage {
	
	public void setNome (String nome) {
		escrever("nome", nome);
	}
	
	public void salvar() {
		clicarBtnPorTexto("Salvar");
		
	}
	
	public String obtermensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public String obtermensagemErro() {
		return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}
	
	public void clicarBotaoAlterar() {
		clicarBotao(By.xpath("//*[@id=\"tabelaContas\"]//a[1]"));
	}
	
	public void clicarBotaoExcluir() {
		clicarBotao(By.xpath("//tr[1]//a[2]//span"));
	}
	
	

}
