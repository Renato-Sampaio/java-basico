package exercicios;

import javax.swing.JOptionPane;

/**
 * ler 2 valores e imprimir o maior deles.
 * @author Renato Sampaio
 * @Since 09/02/2021
 */
public class Exercicio41 {

	/**
	 * Método Principal para funcionamento da classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		double valor1, valor2;
		// apresentando o programa e capturando dados do usuario
		JOptionPane.showInternalMessageDialog(null,"INSIRA 2 VALORES, E TE MOSTRAREI O MAIOR ENTRE ELES.");
		valor1= Double.parseDouble(JOptionPane.showInputDialog("Qual é o 1º valor?"));
		valor2= Double.parseDouble(JOptionPane.showInputDialog("Qual é o 2º valor?"));
		
		//calculando a média simples
			
		//verificando condicionais
		if (valor1 == valor2) {
			JOptionPane.showInternalMessageDialog(null,"OS valores digitados não podem ser IGUAIS");
		}
		
		if ( valor1 > valor2) {
			JOptionPane.showInternalMessageDialog(null," O maior entre eles é o 1º valor inserido: " + valor1);
		} else if ( valor1 < valor2){
			JOptionPane.showInternalMessageDialog(null," O maior entre eles é o 2º valor inserido: " + valor2);
		}
	}
}
//fim