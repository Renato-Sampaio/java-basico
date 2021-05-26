package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar qual o número é maior ou se são iguais.
 * @author  Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio56 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando variaveis
		double valor1, valor2;
		
		// capturando dados digitado pelo usuario.
		JOptionPane.showInternalMessageDialog(null, "DIGITE 2 NUMEROS, QUE TE MOSTRAREI O MAIOR ENTRE ELES OU SE SÃO IGUAIS");
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		//verificando qual é maior ou se são iguais e apresentando ao usuario.
		if (valor1 == valor2) {
			JOptionPane.showMessageDialog(null, "Números iguais");
		} else if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "Primeiro é maior");
		} else {
			JOptionPane.showMessageDialog(null, "Segundo maior");
		}
	}
}
//fim
