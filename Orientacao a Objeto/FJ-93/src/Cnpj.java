
public class Cnpj implements Documento{

	private String valor;
	
	public Cnpj(String cnpj) {
		this.valor = cnpj;
	}

	public String getValor() {
		return valor;
	}
	
	public void setValor(String novoValor) {
		this.valor = novoValor;
	}
	
	private int segundoDigitoCorreto(){
		return 2;
	}

	private int segundoDigitoVerificador(){
		return 2;
	}
	
	private int primeiroDigitoCorreto(){
		return 1;
	}

	private int primeiroDigitoVerificador(){
		return 1;
	}
	
	public boolean ehValido(){
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}
	
	public boolean equals(Object o){
		if (!(o instanceof Cnpj)){
			return false;
		}
		
		Cnpj outro = (Cnpj) o;
		return this.valor.equals(outro.valor);
	}
	
	public int hashCode(){
		return this.valor.hashCode();
	}
	
	@Override
	public String toString() {
		return this.valor;
	}
	
	
	
	
}
