package exemplo07;

/**
 * @author Renato Duarte Sampaio
 *
 * 17 de fev. de 2021
 */
public class TestaPessoa {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarar e instanciar o objeto pessoa
		Pessoa joao = new Pessoa();
		
		// Atribuindo os valores ao objeto joao
		joao.setNome("Jo�o Aurelio Oliveira");
		joao.setSalario(1750);
		
		// criando o objeto de data
		Data dataNascimento = new Data();
		
		// Inicializando a data do objeto jo�o
		dataNascimento.setDia(11);
		dataNascimento.setMes(3);
		dataNascimento.setAno(1997);
		
		// Atribuindo os valores de data para o objeto jo�o
		joao.setDataNascimento(dataNascimento);
		
		// exibindo os dados do objeto joao
		System.out.println("Nome: " + joao.getNome());
		System.out.println("Nascimento: " + joao.getDataNascimento());
		System.out.println(joao.getDataNascimento().faixaEtaria());
		System.out.println("Sal�io: " + joao.getSalario());
		System.out.println(joao.salarioMinimo());
		
	}

}

