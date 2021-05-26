package exercicios;

import javax.swing.JOptionPane;

/**
 * ler 2 valores e imprimir na ordem crescente.
 * @author  Renato Sampaio
 * @Since 09/02/2021
 */
public class Exercicio42 {

	/**
	 * Método Principal para funcionamento da classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		double valor1, valor2;
		// apresentando o programa e capturando dados do usuario
		JOptionPane.showInternalMessageDialog(null,"INSIRA 2 VALORES, E TE MOSTRAREI NA ORDEM CRESCENTE.");
		valor1= Double.parseDouble(JOptionPane.showInputDialog("Qual é o 1º valor?"));
		valor2= Double.parseDouble(JOptionPane.showInputDialog("Qual é o 2º valor?"));
		
		//calculando a média simples
			
		//verificando condicionais
		if (valor1 == valor2) {
			JOptionPane.showInternalMessageDialog(null,"OS valores digitados não podem ser IGUAIS \n"+"*****Tente novamente*****");
		}
		
		if ( valor1 > valor2) {
			JOptionPane.showInternalMessageDialog(null," A ordem crescente dos Numeros inseridos é: " + valor2 +","+valor1+".");
		} else if ( valor1 < valor2){
			JOptionPane.showInternalMessageDialog(null," A ordem crescente dos Numeros inseridos é: " + valor1 +","+valor2+".");
		}
	}
}
//fim