package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para colocar 3 numeros em ordem crescente
 * @author  Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio52 {

	/**
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarando as variaveis
		int valor1, valor2, valor3;

		// capturando informações digitadas pelo usuario
		JOptionPane.showInternalMessageDialog(null, "DIGITE 3 NUMEROS, QUE TE MOSTRAREI A ORDEM CRESCENTE DELES.");
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
		//conferindo as condicionais e apresentando em tela para o usuario
		if ((valor1 < valor2) && (valor1 < valor3) && (valor2 < valor3)) {
			JOptionPane.showMessageDialog(null, valor1 + "," + valor2 + "," + valor3 + ".");
		} else if ((valor1 < valor2) && (valor1 < valor3) && (valor2 > valor3)) {
			JOptionPane.showMessageDialog(null, valor1 + "," + valor3 + "," + valor2 + ".");
		} else if ((valor2 < valor1) && (valor2 < valor3) && (valor1 < valor3)) {
			JOptionPane.showMessageDialog(null, valor2 + "," + valor1 + "," + valor3 + ".");
		} else if ((valor2 < valor1) && (valor2 < valor3) && (valor1 > valor3)) {
			JOptionPane.showMessageDialog(null,valor2 + "," + valor3 + "," + valor1 + ".");
		} else if ((valor3 < valor1) && (valor3 < valor2) && (valor1 < valor2)) {
			JOptionPane.showMessageDialog(null, valor3 + "," + valor1 + "," + valor2 + ".");
		} else if ((valor3 < valor1) && (valor3 < valor2) && (valor1 > valor2)) {
			JOptionPane.showMessageDialog(null, valor3 + "," + valor2 + "," + valor1 + ".");
		}
	}
}
//fim