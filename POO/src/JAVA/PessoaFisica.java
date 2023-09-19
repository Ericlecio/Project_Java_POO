package JAVA;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}
	public PessoaFisica(String cpf) {
		super();
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
