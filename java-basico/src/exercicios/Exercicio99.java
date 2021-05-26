package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Faça um programa para ler um vetor de 10 números. Após isto, ler mais um número qualquer, calcular e escrever quantas vezes esse número aparece no vetor.
 * @since 12 de fev. de 2021
 */
public class Exercicio99 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		//Declarando as variáveis e o vetor.
		int vetor[], valor, aux;
		
		//atribindo valores a variaveis e tamanho ao vetor.
		vetor= new int[10];
		aux=0;
		
		//recebenod do usuário os 15 valores .
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número do primeiro vetor:"));
		}
		
		//recebendo do usuário o número que deseja buscar no vetor1.
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o número que deseja buscar nos números informados anteriormente:"));
		
		//Contabilizando quantas vezes o número que o usuário deseja buscar aparece nos dez números inicialmente inseridos.
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				aux++;
			}
		}
		
		//exibindo em tela ao usuário
		JOptionPane.showMessageDialog(null, "A quantidade de vezes que o número " + valor + " aparece nos números informados anteriormente é:  " + aux);
	}
}