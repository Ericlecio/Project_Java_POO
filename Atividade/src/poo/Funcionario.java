package poo;

import java.util.List;

public class Funcionario extends Pessoa {
	private String cargo;
	private String salario;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Funcionario(String cargo, String salario) {
		super();
		this.cargo = cargo;
		this.salario = salario;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}


}
