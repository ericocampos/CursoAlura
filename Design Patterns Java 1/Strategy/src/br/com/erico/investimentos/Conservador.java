package br.com.erico.investimentos;

import br.com.erico.interfaces.Investimento;
import br.com.erico.util.Conta;

public class Conservador implements Investimento{
	
	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
