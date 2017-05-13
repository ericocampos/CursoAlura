package br.com.erico.util;
import br.com.erico.interfaces.Imposto;

public class CalculadorDeImposto {
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		
		double resultado = imposto.calcula(orcamento);
		System.out.println(resultado);
	}
}
