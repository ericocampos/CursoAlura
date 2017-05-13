package br.com.erico.util;

import br.com.erico.impostos.ICCC;
import br.com.erico.interfaces.Imposto;

public class TesteDeAplicacao {
	
	public static void main(String[] args) {
		Imposto ICCC = new ICCC();
		
		Orcamento orcamento1 = new Orcamento(500);
		Orcamento orcamento2 = new Orcamento(1500);
		Orcamento orcamento3 = new Orcamento(3500);
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		System.out.println("Calculo de imposto para o valor: " + orcamento1.getValor());
		calc.realizaCalculo(orcamento1, ICCC);
		System.out.println("Calculo de imposto para o valor: " + orcamento2.getValor());
		calc.realizaCalculo(orcamento2, ICCC);
		System.out.println("Calculo de imposto para o valor: " + orcamento3.getValor());
		calc.realizaCalculo(orcamento3, ICCC);
	}

}
