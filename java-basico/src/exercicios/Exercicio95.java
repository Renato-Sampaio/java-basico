/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Fa�a um programa para ler 10 n�meros e armazenar
em um vetor. Ap�s isto, o programa deve ordenar os n�meros no vetor em ordem crescente. Escrever o vetor ordenado.
 * 12 de fev. de 2021
 */
public class Exercicio95 {
		/*
		 * M�todo principal para executar a classe
		 */
		public static void main(String[] args) {
			
			//Declarando as vari�veis e vetores.
			int vetor[], aux;
			String msg = "";
			// iniciando o vetor.
			vetor = new int[10];
			//recebendo do usu�rio os 10 valores
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero:"));
			}
			
			//ordena os n�meros de maneira crescente
			for (int i = 0; i < vetor.length; i++) {
				for (int j = i; j > 0; j--) {
					if (vetor[j] < vetor[j -1]) {
						aux = vetor[j];
						vetor[j] = vetor[j -1];
						vetor[j -1] = aux;
					}
				}
			}
			
			//exibe os dados ao usu�rio
			for (int i = 0; i < vetor.length; i++) {
				msg += vetor[i] + "  ";
			}
			JOptionPane.showMessageDialog(null, "A ordem crescente dos numeros informados �:  \n" + msg);
		}
	}