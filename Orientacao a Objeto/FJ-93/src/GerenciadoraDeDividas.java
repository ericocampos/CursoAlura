
public class GerenciadoraDeDividas {

	public void efetuaPagamento(Divida divida, double valor, String nomePagador, Documento documentoPagador) {
		Pagamento pagamento = new Pagamento();

		pagamento.setDocumentoPagador(documentoPagador);
		pagamento.setPagador(nomePagador);
		pagamento.setValor(valor);

		divida.registra(pagamento);
	}

}
