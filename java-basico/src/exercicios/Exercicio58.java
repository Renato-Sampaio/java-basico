package exercicios;

import javax.swing.JOptionPane;

/**
 *  Somar as idades de homem mais velho com mulher mais nova
 *  para fazer o produto do homem mais novo com a mulher mais velha
 * @author Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio58 {

	/*
	 * Méteodo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando variaveis
		int m1, m2, h1, h2;
		
		//capturando dados digitado pelo usuario
		JOptionPane.showInternalMessageDialog(null, "Somarei as idades do homem mais velho com mulher mais nova \n"
				+ "  para fazer o produto do homem mais novo com a mulher mais velha.");
		m1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da primeira mulher"));
		m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda mulher"));
		h1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do primeiro homem"));
		h2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do segundo homem"));
		
		//verificando quem são os mais velhos
		if ((h1 > h2) && (m1 > m2)) {
			JOptionPane.showMessageDialog(null, "A soma é: " + (h1 + m2));
			JOptionPane.showMessageDialog(null, "O produto é: " + (h2 * m1));
			
		} else if ((h1 > h2) && (m1 < m2)){
			JOptionPane.showMessageDialog(null, "A soma é: " + (h1 + m1));
			JOptionPane.showMessageDialog(null, "O produto é: " + (h2 * m2));
		} else if ( (h2 > h1) && (m1 > m2)){
			JOptionPane.showMessageDialog(null, "A soma é: " + (h2 + m2));
			JOptionPane.showMessageDialog(null, "O produto é: " + (h1 * m1));
		} else {
			JOptionPane.showMessageDialog(null, "A soma é: " + (h2 + m1));
			JOptionPane.showMessageDialog(null, "O produto é: " + (h1 * m2));
		}
	}
}
//fim