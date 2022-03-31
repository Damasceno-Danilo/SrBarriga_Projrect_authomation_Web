package br.com.srbarriga.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.srbarriga.tests.ContaTest;
import br.com.srbarriga.tests.MovimentacaoTest;
import br.com.srbarriga.tests.RemoverMovimentacaoContaTest;
import br.com.srbarriga.tests.ResumoTest;
import br.com.srbarriga.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuitsGeral {

}
