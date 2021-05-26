package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Calcular e exibir a quantidade de vezes que os vetores possuem os mesmos números nas mesmas posições.
 * @since 12 de fev. de 2021
 */
public class Exercicio98 {

		/*
		 * Método principal para executar a classe
		 */
		public static void main(String[] args) {
			
			//Declara as variáveis
			int vetor1[], vetor2[],aux;
			
			//inicializando os vetores e atribuindo valor a variavel aux.
			 vetor1 = new int[15];
			 vetor2 = new int[15];
			 aux = 0;
			
			//recebendo do usuário os 15 valores do vetor1.
			for (int i = 0; i < vetor1.length; i++) {
				vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número do primeiro vetor:"));
			}
			
			//recebendo do usuário os 15 valores do  vetor2.
			for (int i = 0; i < vetor2.length; i++) {
				vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número do segundo vetor:"));
			}
			
			//Contabiliza quantas vezes o vetores possuem os mesmos números nas mesmas posições
			for (int i = 0; i < vetor2.length; i++) {
				if (vetor1[i] == vetor2[i]) {
					aux++;
				}
			}
			
			//exibe os dados ao usuário
			JOptionPane.showMessageDialog(null, "A quantidade de vezes que os vetores possuem\n os mesmos números nas mesmas posições é:  " + aux);
		}
	}