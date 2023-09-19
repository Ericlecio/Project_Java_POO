package JAVA;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}

	public PessoaJuridica(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


}
