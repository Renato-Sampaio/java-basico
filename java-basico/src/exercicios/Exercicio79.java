package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio Faça um programa que calcule e escreva a média
 *         aritmética dos números inteiros entre 15 (inclusive) e 100
 *         (inclusive).
 * @since 10 de fev. de 2021
 */
public class Exercicio79 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declarando as variáveis
		int soma = 0, aux = 0;

		for (int i = 15; i <= 100; i++) {
			soma += i;
			aux += 1;
		}
		JOptionPane.showInternalMessageDialog(null, soma / aux);
	}
}