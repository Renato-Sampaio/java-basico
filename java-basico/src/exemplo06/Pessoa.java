package exemplo06;

/**
 * Classe para demonstrar a utilização de objetos Responsavel por armazenar seus
 * atributos e metrodos.
 * 
 * @author Renato Duarte Sampaio
 *
 * @since 17 de fev. de 2021
 */
public class Pessoa {

	// atributos ou caracteristicas do objeto.
	String nome, dataNascimento, sexo, auxiliar = "";
	double altura, peso;

	// MÉTODO PARA EXIBIR OS DADOS DO OBJETOS

	public void exibirDados() {// inicio do Método
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimeto: " + dataNascimento);
		System.out.println("Altura: " + altura);
		System.out.println("PESO: " + peso);
		System.out.println("SEXO: " + sexo);
		System.out.println("IDADE: " + calcularIdade());
		System.out.println("MAIOR DE IDADE: " + faixaEtaria());

	}// fim do metodo

	// metodo para retornar a idade da pessoa
	public int calcularIdade() {
		// declarando a variavel de retorno do metodo
		int idade = 0;
		// variavel para armazenar o ano de nascimento
		int anoNascimento = 0;
		int anoAtual = 2021;

		// quebrando a data do tipo String.
		String dataQuebrada[] = dataNascimento.split("/");
		anoNascimento = Integer.parseInt(dataQuebrada[2]);

		// calcular idade do objeto.
		idade = anoAtual - anoNascimento;

		// retornando a idade calculada.
		return idade;

	}

	// método para retornar se é maior ou não.
	public String faixaEtaria() {
		if (calcularIdade() >= 18) {
			return "Maior de Idade";

		} else {

			return "Menor de Idade";
		}
	}
}