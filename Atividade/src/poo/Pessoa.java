package poo;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected String genero;


	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Pessoa(String nome, int idade, String genero) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


}
