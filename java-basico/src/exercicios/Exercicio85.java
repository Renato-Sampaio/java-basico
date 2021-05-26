package exercicios;
/**
 * @author Renato Duarte Sampaio
 * Tabuada do 1 ao 10
 * 11 de fev. de 2021
 */
public class Exercicio85 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando vari�vel msg para mostrar na console.
		String msg = "";

		// criando variavel auxiliar em loop para fazer a tabuada do 1 ao 10
		for (int i = 1; i <= 10; i++) {
			msg += "\n"; // concatenando informa�oes a varial mensagem.
			for (int j = 1; j <= 10; j++) {
				msg += j + " x " + i + " = " + (j * i) + "\n"; // concatenando informa�oes a varial mensagem.
			}
		}

		// mostra o resultado em console para o usuario.
		System.out.print(msg);
	}
}