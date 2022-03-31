package br.com.srbarriga.pages;

import org.openqa.selenium.By;

import br.com.srbarriga.core.BasePage;

public class HomePage extends BasePage {
	
	public void obterSaldoDaConta() {
		
		obterTexto(By.xpath("//*[@id=\"tabelaSaldo\"]//td[2]"));
	}

}
