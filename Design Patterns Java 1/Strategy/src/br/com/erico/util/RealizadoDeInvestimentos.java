package br.com.erico.util;

import br.com.erico.interfaces.Investimento;

public class RealizadoDeInvestimentos {
	public void realiza(Conta conta, Investimento investimento){
		double resultado = investimento.calcula(conta);
		
		conta.deposita(resultado * 0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
}
