package exercicios;

import javax.swing.JOptionPane;

/**
 *Fa�a um algoritmo para calcular quantos litros de �gua e de suco s�o necess�rios para se fazer X litros de refresco
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio34 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double agua, suco , litros;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " Quantos litros de �gua e de suco s�o necess�rios para (X)litros de refersco?");
		litros= Double.parseDouble(JOptionPane.showInputDialog(" Qual a quantidade de litros de refresco voce quer ?:  "));
	
		
		// atribuindo contas as variaveis
		agua= 0.8 * litros;
		suco= 0.2 * litros;
		
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,"O valor de litros de agua � de:" + agua + " litros");
		JOptionPane.showInternalMessageDialog(null,"O valor de litros de suco � de:" + suco + " litros");

		// fim

	}
}