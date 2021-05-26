package exercicios;

/**
 * @author Renato Duarte Sampaio
 *
 * @since 11 de fev. de 2021
 */
public class Exercicio87 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		String msg = ""; // concatenando informaçoes a varial mensagem.
		int x = 60, i, j;
		// inicializando a variável, condicionando e incrementando
		for (i = 1; i <= 10; i++) {
			msg += "\n"; // concatenando informaçoes a varial mensagem.
			for (j = 1; j < x; j++) {
				if ((i == 1) || (i == 10))
					msg += "+"; // concatenando informaçoes a varial mensagem.
				else {
					if ((j == 1) || (j == x - 1))
						msg += "+"; // concatenando informaçoes a varial mensagem.
					else
						msg += " "; // concatenando informaçoes a varial mensagem.
				}
			}
		}
		// mostra o resultado em tela para usuario.
		System.out.print( msg);
	}

}