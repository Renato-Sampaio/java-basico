package exercicios;

import javax.swing.JOptionPane;

/**
 *Faça um algoritmo para calcular quantos litros de água e de suco são necessários para se fazer X litros de refresco
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio34 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double agua, suco , litros;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " Quantos litros de água e de suco são necessários para (X)litros de refersco?");
		litros= Double.parseDouble(JOptionPane.showInputDialog(" Qual a quantidade de litros de refresco voce quer ?:  "));
	
		
		// atribuindo contas as variaveis
		agua= 0.8 * litros;
		suco= 0.2 * litros;
		
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,"O valor de litros de agua é de:" + agua + " litros");
		JOptionPane.showInternalMessageDialog(null,"O valor de litros de suco é de:" + suco + " litros");

		// fim

	}
}