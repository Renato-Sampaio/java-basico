package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa que mostra se forma um triâgulo
 * @author  Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio54 {

	/**
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double a, b, c;
		// Capturando informações do usuario
		JOptionPane.showInternalMessageDialog(null, "VAMOS DESCOBRIR SE É UM TRIANGULO");
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira medida"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda medida"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira medida"));
		//condição para verificar se forma um triangulo
		if ((a-b < c) && (c < a+b) && (a-c < b) && (b < a+c) && (b-c < a) && (a < b+c)) {
			JOptionPane.showMessageDialog(null, "Forma um triângulo!");
		} else {
			JOptionPane.showMessageDialog(null, "Não forma um triângulo!");
		}
	}
}
//fim