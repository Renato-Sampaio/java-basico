package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio O mesmo contexto do exerc�cio anterior, mas
 *         depois de ordenar os elementos do vetor em ordem crescente, deve ser
 *         lido mais um n�mero qualquer e inserir esse novo n�mero na posi��o
 *         correta, ou seja, mantendo a ordem crescente do vetor.
 * @since 12 de fev. de 2021
 */
public class Exercicio96 {
	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declara as vari�veis
		int vetor[] = new int[11];
		int aux;
		String msg = "";

		// recebe do usu�rio os 10 valores
		for (int i = 1; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + i + "� n�mero:"));
		}

		// ordena os n�meros de maneira crescente
		for (int i = 1; i < vetor.length; i++) {
			for (int j = i; j > 0; j--) {
				if (vetor[j] < vetor[j - 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}
			}
		}

		// recebendo novo valor do usu�rio
		vetor[0] = Integer
				.parseInt(JOptionPane.showInputDialog("Informe um valor para adicionar na sequ�ncia informada:"));

		// ordena os n�meros de maneira crescente adicionando o novo valor
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i; j > 0; j--) {
				if (vetor[j] < vetor[j - 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}
			}
		}

		// exibe os dados ao usu�rio
		for (int i = 0; i < vetor.length; i++) {
			msg += vetor[i] + "  ";
		}
		JOptionPane.showMessageDialog(null, "Os n�meros informados em ordem crescente:  " + msg);
	}
}