package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 *	Programa para exiba as seguintes sequ�ncias de n�meros: 
 *(1, 1 2 3 4 5 6 7 8 9 10)
 *(2, 1 2 3 4 5 6 7 8 9 10) 
 *(3, 1 2 3 4 5 6 7 8 9 10)
 *(4, 1 2 3 4 5 6 7 8 9 10) e assim sucessivamente, at� que o primeiro n�mero (antes da v�rgula),tamb�m chegue a 10.
 * @since 11 de fev. de 2021
 */
public class Exercicio86 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		String msg = "";

		// criando o la�o de repeti��o com a condicional solicitada 
		for (int i = 1; i <= 10; i++) {
			msg += "\n\n" + i + ","; // concatenando informa�oes a varial mensagem.
			for (int j = 1; j <= 10; j++) {
				msg += " " + j + " "; // concatenando informa�oes a varial mensagem.
			}
		}
		// mostra o resultado em console para o usuario.
		JOptionPane.showMessageDialog(null, msg);
	}

}
