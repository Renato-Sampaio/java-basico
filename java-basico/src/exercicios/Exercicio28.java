package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o valor total de uma conta e imprimir quanto cada amigo deve pagar, considerando q apenas um deve pagar centavos
 * 
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio28 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int andreEcarlos;
		double total, felipe;
		
		// recebendo valores para as variaveis
		total = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor total da conta?"));
		
		// calculando total das vendas
		andreEcarlos = (int) ((total - (total % 3)) / 3);
		felipe = total - andreEcarlos * 2;		
		
		// exibindo valores das variáveis no console
		System.out.println("André e Carlos devem pagar: R$ " + andreEcarlos);
		System.out.println("Felipe deve pagar: R$ " + felipe);

	}

}