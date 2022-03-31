package br.com.srbarriga.pages;

import static br.com.srbarriga.core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.srbarriga.core.BasePage;

public class MovimentacaoPage extends BasePage {
	
	public void setDataMovimentacao(String data) {
		escrever("data_transacao", data);
	}
	
	public void setDataPagamento(String data) {
		escrever("data_pagamento", data);
	}
	
	public void setDescrição(String texto) {
		escrever("descricao", texto);
	}
	
	public void setInteressado(String texto) {
		escrever("interessado", texto);
	}
	
	public void setValor(String valor) {
		escrever("valor", valor);	
	}
	
	public void setConta(String conta) {
		selecionarCombo("conta", conta);
	}
	
	public void setStatusPago() {
		clicarRadio("status_pago");
	}
	
	public void salvar() {
		clicarBtnPorTexto("Salvar");
	}
	
	public String obtermensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public String obtermensagemErro() {
		return obterTexto(By.xpath("/html/body/div[1]"));
	}
	
	public List<String> obterErros() {
		List<WebElement> erros = getDriver().findElements(By.xpath("//div[@class='alert alert-danger']//li"));		
		List<String> retorno = new ArrayList<String>();
		for(WebElement erro: erros) {
			retorno.add(erro.getText());
		}
		return retorno;
	}

}
