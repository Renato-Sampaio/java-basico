package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que mostra se forma um tri�gulo
 * @author  Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio54 {

	/**
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double a, b, c;
		// Capturando informa��es do usuario
		JOptionPane.showInternalMessageDialog(null, "VAMOS DESCOBRIR SE � UM TRIANGULO");
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira medida"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda medida"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira medida"));
		//condi��o para verificar se forma um triangulo
		if ((a-b < c) && (c < a+b) && (a-c < b) && (b < a+c) && (b-c < a) && (a < b+c)) {
			JOptionPane.showMessageDialog(null, "Forma um tri�ngulo!");
		} else {
			JOptionPane.showMessageDialog(null, "N�o forma um tri�ngulo!");
		}
	}
}
//fim