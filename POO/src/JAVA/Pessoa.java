package JAVA;

import java.util.List;


public class Pessoa {
	protected String nome;
	protected List<Endereco> endereco;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, List<Endereco> endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}


}
