package poo;

import java.util.ArrayList;
import java.util.List;

public class AppPessoa {
	public static void main(String[] args) {

		Departamento departamento1 = new Departamento();
		departamento1.setNome("DEV");

		Empresa empresa01 = new Empresa();
		empresa01.setCnpj("12344444");
		empresa01.setNome("Leo S/A");

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Ericlecio");
		funcionario1.setIdade(21);
		funcionario1.setCargo("Programador");
		funcionario1.setGenero("Masculino");
		funcionario1.setSalario("5.000");

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Marcos");
		funcionario2.setIdade(21);
		funcionario2.setCargo("Programador");
		funcionario2.setGenero("Masculino");
		funcionario2.setSalario("5.600");

		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Flavio");
		funcionario3.setIdade(22);
		funcionario3.setCargo("Programador");
		funcionario3.setGenero("Masculino");
		funcionario3.setSalario("4.600");

		List<Funcionario> listaFuncionario = new ArrayList <Funcionario>();
		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3);
		departamento1.setFuncionario(listaFuncionario);

		for (Funcionario funcionario : departamento1.getLista()) {
			System.out.println("Nome: " + funcionario.getNome() + 
					"\n"+ "Idade: " + funcionario.getIdade() + 
					"\n" + "Cargo: " + funcionario.getCargo() + 
					"\n" + "Genero: " + funcionario.getGenero() + 
					"\n" + "Salario: " + funcionario.getSalario());
			System.out.println("Empresa: " + empresa01.getNome());
			System.out.println("Cnpj: " + empresa01.getCnpj());
			System.out.println("Nome do departamento: "+ departamento1.getNome());
			System.out.println("---------------------------------");

		}


	}
}
