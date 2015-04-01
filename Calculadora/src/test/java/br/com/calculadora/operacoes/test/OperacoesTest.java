package br.com.calculadora.operacoes.test;


import junit.framework.TestCase;

import org.junit.Test;

import br.com.calculadora.operacoes.Operacoes;

public class OperacoesTest {
	
	private Operacoes operacoes = new Operacoes();

	@Test
	public void somaTest() {
		Double valor1 = new Double(10);
		Double valor2 = new Double(5);
		Double retortnoEsperado = new Double(15);
		Double retornoFeito = operacoes.soma(valor1, valor2);
		
		TestCase.assertEquals(retortnoEsperado, retornoFeito, 0);
	}
	
	@Test
	public void subtracaoTest() {
		Double valor1 = new Double(10);
		Double valor2 = new Double(5);
		Double retortnoEsperado = new Double(5);
		Double retornoFeito = operacoes.subtracao(valor1, valor2);
		
		TestCase.assertEquals(retortnoEsperado, retornoFeito, 0);
	}
	
	@Test
	public void multiplicacaoTest() {
		Double valor1 = new Double(10);
		Double valor2 = new Double(5);
		Double retortnoEsperado = new Double(50);
		Double retornoFeito = operacoes.multiplicacao(valor1, valor2);
		
		TestCase.assertEquals(retortnoEsperado, retornoFeito, 0);
	}
	
	@Test
	public void divisaoTest() {
		Double valor1 = new Double(10);
		Double valor2 = new Double(5);
		Double retortnoEsperado = new Double(2);
		Double retornoFeito = operacoes.divisao(valor1, valor2);
		
		TestCase.assertEquals(retortnoEsperado, retornoFeito, 0);
	}
	
}
