package exercicios;

/**
 * @author Renato Duarte Sampaio
 *
 * @since 11 de fev. de 2021
 */
public class Exercicio87 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		String msg = ""; // concatenando informa�oes a varial mensagem.
		int x = 60, i, j;
		// inicializando a vari�vel, condicionando e incrementando
		for (i = 1; i <= 10; i++) {
			msg += "\n"; // concatenando informa�oes a varial mensagem.
			for (j = 1; j < x; j++) {
				if ((i == 1) || (i == 10))
					msg += "+"; // concatenando informa�oes a varial mensagem.
				else {
					if ((j == 1) || (j == x - 1))
						msg += "+"; // concatenando informa�oes a varial mensagem.
					else
						msg += " "; // concatenando informa�oes a varial mensagem.
				}
			}
		}
		// mostra o resultado em tela para usuario.
		System.out.print( msg);
	}

}