package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Fa�a um programa para ler um vetor de 10 n�meros. Ap�s isto, ler mais um n�mero qualquer, calcular e escrever quantas vezes esse n�mero aparece no vetor.
 * @since 12 de fev. de 2021
 */
public class Exercicio99 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		//Declarando as vari�veis e o vetor.
		int vetor[], valor, aux;
		
		//atribindo valores a variaveis e tamanho ao vetor.
		vetor= new int[10];
		aux=0;
		
		//recebenod do usu�rio os 15 valores .
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero do primeiro vetor:"));
		}
		
		//recebendo do usu�rio o n�mero que deseja buscar no vetor1.
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero que deseja buscar nos n�meros informados anteriormente:"));
		
		//Contabilizando quantas vezes o n�mero que o usu�rio deseja buscar aparece nos dez n�meros inicialmente inseridos.
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				aux++;
			}
		}
		
		//exibindo em tela ao usu�rio
		JOptionPane.showMessageDialog(null, "A quantidade de vezes que o n�mero " + valor + " aparece nos n�meros informados anteriormente �:  " + aux);
	}
}