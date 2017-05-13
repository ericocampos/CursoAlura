package br.com.erico.impostos;
import br.com.erico.interfaces.Imposto;
import br.com.erico.util.Orcamento;

public class ISS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
