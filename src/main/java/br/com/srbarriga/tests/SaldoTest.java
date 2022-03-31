package br.com.srbarriga.tests;

import org.junit.Test;

import br.com.srbarriga.core.BaseTest;
import br.com.srbarriga.pages.HomePage;

public class SaldoTest extends BaseTest {
	
	private HomePage homePage = new HomePage();
	
	@Test
	public void saldoContaTeste() {
		homePage.obterSaldoDaConta();
	}

}
