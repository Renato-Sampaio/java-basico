package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio O mesmo contexto do exercício anterior, mas
 *         depois de ordenar os elementos do vetor em ordem crescente, deve ser
 *         lido mais um número qualquer e inserir esse novo número na posição
 *         correta, ou seja, mantendo a ordem crescente do vetor.
 * @since 12 de fev. de 2021
 */
public class Exercicio96 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declara as variáveis
		int vetor[] = new int[11];
		int aux;
		String msg = "";

		// recebe do usuário os 10 valores
		for (int i = 1; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + i + "º número:"));
		}

		// ordena os números de maneira crescente
		for (int i = 1; i < vetor.length; i++) {
			for (int j = i; j > 0; j--) {
				if (vetor[j] < vetor[j - 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}
			}
		}

		// recebendo novo valor do usuário
		vetor[0] = Integer
				.parseInt(JOptionPane.showInputDialog("Informe um valor para adicionar na sequência informada:"));

		// ordena os números de maneira crescente adicionando o novo valor
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i; j > 0; j--) {
				if (vetor[j] < vetor[j - 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}
			}
		}

		// exibe os dados ao usuário
		for (int i = 0; i < vetor.length; i++) {
			msg += vetor[i] + "  ";
		}
		JOptionPane.showMessageDialog(null, "Os números informados em ordem crescente:  " + msg);
	}
}