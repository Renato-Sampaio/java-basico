package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar qual o n�mero � maior ou se s�o iguais.
 * @author  Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio56 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando variaveis
		double valor1, valor2;
		
		// capturando dados digitado pelo usuario.
		JOptionPane.showInternalMessageDialog(null, "DIGITE 2 NUMEROS, QUE TE MOSTRAREI O MAIOR ENTRE ELES OU SE S�O IGUAIS");
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		//verificando qual � maior ou se s�o iguais e apresentando ao usuario.
		if (valor1 == valor2) {
			JOptionPane.showMessageDialog(null, "N�meros iguais");
		} else if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "Primeiro � maior");
		} else {
			JOptionPane.showMessageDialog(null, "Segundo maior");
		}
	}
}
//fim
