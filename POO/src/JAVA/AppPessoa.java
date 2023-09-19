package JAVA;

import java.util.ArrayList;
import java.util.List;

public class AppPessoa {
	public static void main(String[] args) {

		// Criando a primeira pessoa fisica 1.
		PessoaFisica pessoafisica1 = new PessoaFisica();
		pessoafisica1.setNome("Ericlecio Thiago");
		pessoafisica1.setCpf("12345");

		// Criando o primeiro endereco da pessoa fisica 1.
		Endereco endereco1 = new Endereco();
		endereco1.setBairro("Rua dos Palmares");
		endereco1.setMunicipio("Palmares");
		endereco1.setNumero("222");
		endereco1.setUf("PE");

		// Criando o segundo endereco da pessoa fisica 1.
		Endereco endereco2 = new Endereco();
		endereco2.setBairro("Santa rosa");
		endereco2.setMunicipio("Palmares");
		endereco2.setNumero("111");
		endereco2.setUf("PE");

		// Criando lista com os enderecos da pessoa fisica 1.
		List<Endereco> lista1 = new ArrayList<Endereco>();
		lista1.add(endereco1);
		lista1.add(endereco2);
		pessoafisica1.setEndereco(lista1); // Setando a lista de enderecos 'lista1' para a pessoa fisica 1.

		// Criando a primeira pessoa fisica 2.
		PessoaFisica pessoafisica2 = new PessoaFisica();
		pessoafisica2.setNome("Favorito");
		pessoafisica2.setCpf("54321");

		// Criando o primeiro endereco da pessoa fisica 2.
		Endereco endereco3 = new Endereco();
		endereco3.setBairro("Nova Palmares");
		endereco3.setMunicipio("Palmares");
		endereco3.setNumero("333");
		endereco3.setUf("PE");

		// Criando lista com os enderecos da pessoa fisica 2.
		List<Endereco> lista2 = new ArrayList<Endereco>();
		lista2.add(endereco3);
		pessoafisica2.setEndereco(lista2); // Setando a lista de enderecos 'lista2' para a pessoa fisica 2.

		// Criando lista de pessoas fisica 1 e 2.
		List<PessoaFisica> listapessoas = new ArrayList<PessoaFisica>();
		listapessoas.add(pessoafisica1);
		listapessoas.add(pessoafisica2);

		for (PessoaFisica pessoaFisica : listapessoas) {
			System.out.println(pessoaFisica.getNome() + " - " + pessoaFisica.getCpf()); // Primeiro 'for' para percorrer
																						// a lista de pesssoas para
																						// imprimir o nome e cpf apenas
																						// uma vez.
			for (Endereco endereco : pessoaFisica.getEndereco()) { // Segundo 'for' para imprimir os endereços da pessoa
																	// fisica 1 e 2.
				System.out.println("Bairro: " + endereco.getBairro());
				System.out.println("Numero: " + endereco.getNumero());
				System.out.println("Municipio: " + endereco.getMunicipio());
				System.out.println("UF: " + endereco.getUf());
			}
			System.out.println("---------------------------------");
		}

	}
}
