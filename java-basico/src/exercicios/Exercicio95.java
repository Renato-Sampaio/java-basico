/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Faça um programa para ler 10 números e armazenar
em um vetor. Após isto, o programa deve ordenar os números no vetor em ordem crescente. Escrever o vetor ordenado.
 * 12 de fev. de 2021
 */
public class Exercicio95 {
		/*
		 * Método principal para executar a classe
		 */
		public static void main(String[] args) {
			
			//Declarando as variáveis e vetores.
			int vetor[], aux;
			String msg = "";
			// iniciando o vetor.
			vetor = new int[10];
			//recebendo do usuário os 10 valores
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número:"));
			}
			
			//ordena os números de maneira crescente
			for (int i = 0; i < vetor.length; i++) {
				for (int j = i; j > 0; j--) {
					if (vetor[j] < vetor[j -1]) {
						aux = vetor[j];
						vetor[j] = vetor[j -1];
						vetor[j -1] = aux;
					}
				}
			}
			
			//exibe os dados ao usuário
			for (int i = 0; i < vetor.length; i++) {
				msg += vetor[i] + "  ";
			}
			JOptionPane.showMessageDialog(null, "A ordem crescente dos numeros informados é:  \n" + msg);
		}
	}