/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Fa�a um programa para ler um valor N qualquer (que
ser� o tamanho dos vetores). Ap�s, ler dois vetores A e B
(de tamanho N cada um) e depois armazenar em um terceiro vetor SOMA a soma dos elementos do vetor A com os
do vetor B (respeitando as mesmas posi��es) e escrever o
vetor Soma.
 * 12 de fev. de 2021
 */
public class Exercicio94 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		//Declarando as vari�veis
		int vetor1[], vetor2[], vetor_soma[], tamanho;
		String msg = "";
		
		//Recebendo  o tamanho dos vetores do usu�rio 
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de n�meros que deseja em cada grupo:"));
		//atribuindo tamanho aos vetores
		vetor1 = new int[tamanho];
		vetor2 = new int[tamanho];
		vetor_soma = new int[tamanho];
		
		//recebe do usu�rio os valores do primeiro vetor
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero do primeiro grupo:"));
		}
		
		//recebe do usu�rio os valores do primeiro vetor
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero do segundo grupo:"));
		}
		
		//calcula a soma dos dois vetores(respeitando as posi��es de cada valor)
		for (int i = 0; i < vetor_soma.length; i++) {
			vetor_soma[i] = vetor1[i] + vetor2[i];
			msg += "\n" + vetor_soma[i];
		}
		
		//exibindo em tela a soma para  usu�rio
		System.out.println("As somas dos valores do primeiro grupo com os valores do segundo s�o: " + msg);
	}
}