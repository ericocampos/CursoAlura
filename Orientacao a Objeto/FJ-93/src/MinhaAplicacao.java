
public class MinhaAplicacao {
	public static void main(String[] args) {
		BancoDeDados bd = new BancoDeDados("localhost","usuario","senha");
		BalancoEmpresa balanco = new BalancoEmpresa(bd);
		registraDividas(balanco);
		realizaPagamentos(balanco);
		bd.desconecta();
	}
	
	private static void registraDividas(BalancoEmpresa balanco){
		Divida d1 = new Divida();
		Divida d2 = new Divida();
		
		balanco.registraDivida(d1);
		balanco.registraDivida(d2);
	}
	
	private static void realizaPagamentos(BalancoEmpresa balanco){
		Pagamento p1 = new Pagamento();
		Pagamento p2 = new Pagamento();
		Cnpj credor = new Cnpj("00.000.000/0001-01");
		
		balanco.pagaDivida(credor, p1);
		balanco.pagaDivida(credor, p2);
	}
}
