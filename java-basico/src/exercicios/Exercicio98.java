package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Calcular e exibir a quantidade de vezes que os vetores possuem os mesmos n�meros nas mesmas posi��es.
 * @since 12 de fev. de 2021
 */
public class Exercicio98 {

		/*
		 * M�todo principal para executar a classe
		 */
		public static void main(String[] args) {
			
			//Declara as vari�veis
			int vetor1[], vetor2[],aux;
			
			//inicializando os vetores e atribuindo valor a variavel aux.
			 vetor1 = new int[15];
			 vetor2 = new int[15];
			 aux = 0;
			
			//recebendo do usu�rio os 15 valores do vetor1.
			for (int i = 0; i < vetor1.length; i++) {
				vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero do primeiro vetor:"));
			}
			
			//recebendo do usu�rio os 15 valores do  vetor2.
			for (int i = 0; i < vetor2.length; i++) {
				vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero do segundo vetor:"));
			}
			
			//Contabiliza quantas vezes o vetores possuem os mesmos n�meros nas mesmas posi��es
			for (int i = 0; i < vetor2.length; i++) {
				if (vetor1[i] == vetor2[i]) {
					aux++;
				}
			}
			
			//exibe os dados ao usu�rio
			JOptionPane.showMessageDialog(null, "A quantidade de vezes que os vetores possuem\n os mesmos n�meros nas mesmas posi��es �:  " + aux);
		}
	}