package exemplo06;

/**
 * Classe para demonstrar utilização do objeto pessoa.
 * 
 * @author Renato Duarte Sampaio
 *
 *         17 de fev. de 2021
 */
public class TestaPessoa {

	/**
	 * Metodo Principal para Executar a classe.
	 */
	public static void main(String[] args) {
		// declarando objeto pessoa.

		Pessoa joao;

		// inicializando o objeto joao (instancia e objeto)
		joao = new Pessoa();
		// exibindo o objeto pessoa.

		System.out.println(joao);

		// atribuindo os valores ao objeto.
		joao.nome = "João Almeida de Souza";
		joao.dataNascimento = "23/05/1986";
		joao.altura = 1.89;
		joao.peso = 85;
		joao.sexo = "MASCULINO";

		// declarando objeto maria

		Pessoa maria;

		maria = new Pessoa();

		// atribuindo valores ao objetos

		maria.nome = "Maria da Silva de Souza";
		maria.dataNascimento = "12/08/1985";
		maria.altura = 1.52;
		maria.peso = 65;
		maria.sexo = "FEMININO";

		// exibindo os dados do objeto joao.
		System.out.println("NOME: " + joao.nome);
		System.out.println("DATA DE NASCIMENTO: " + joao.dataNascimento);
		System.out.println("ALTURA: " + joao.altura);
		System.out.println("PESO: " + joao.peso);
		System.out.println("SEXO: " + joao.sexo);

		// dividindo o bloco de infos.

		System.out.println("");

		// exibindo os dados do objeto maria.
		System.out.println("NOME: " + maria.nome);
		System.out.println("DATA DE NASCIMENTO: " + maria.dataNascimento);
		System.out.println("ALTURA: " + maria.altura);
		System.out.println("PESO: " + maria.peso);
		System.out.println("SEXO: " + maria.sexo);

		// pulando uma linha
		System.out.println("");

		// exibindo os dados do objeto joao.
		joao.exibirDados();

		// pulando uma linha
		System.out.println("");
		
		//exibindo os dados do objeto maria.
		maria.exibirDados();
	}

}
