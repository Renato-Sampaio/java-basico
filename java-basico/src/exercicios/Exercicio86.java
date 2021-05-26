package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 *	Programa para exiba as seguintes sequências de números: 
 *(1, 1 2 3 4 5 6 7 8 9 10)
 *(2, 1 2 3 4 5 6 7 8 9 10) 
 *(3, 1 2 3 4 5 6 7 8 9 10)
 *(4, 1 2 3 4 5 6 7 8 9 10) e assim sucessivamente, até que o primeiro número (antes da vírgula),também chegue a 10.
 * @since 11 de fev. de 2021
 */
public class Exercicio86 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		String msg = "";

		// criando o laço de repetição com a condicional solicitada 
		for (int i = 1; i <= 10; i++) {
			msg += "\n\n" + i + ","; // concatenando informaçoes a varial mensagem.
			for (int j = 1; j <= 10; j++) {
				msg += " " + j + " "; // concatenando informaçoes a varial mensagem.
			}
		}
		// mostra o resultado em console para o usuario.
		JOptionPane.showMessageDialog(null, msg);
	}

}
