package exercicios;

import javax.swing.JOptionPane;

/**
 * LER 3 VALORES E MOSTRAR O MAIOR DELES
 * @author  Renato Sampaio
 * @SINCE 09/02/2021
 */
public class Exercicio48 {

	/**
	 * M�todo principal pra rodar a classe
	 */
	public static void main(String[] args) {
		//criando variaveis
		double valor1,valor2,valor3;
		JOptionPane.showInternalMessageDialog(null,"INSIRA 3 VALORES E TE MOSTRAREI O MAIOR ENTRE ELES ");
		valor1= Double.parseDouble(JOptionPane.showInputDialog("INSIRA O 1� VALOR"));
		valor2= Double.parseDouble(JOptionPane.showInputDialog("INSIRA O 2� VALOR"));
		valor3= Double.parseDouble(JOptionPane.showInputDialog("INSIRA O 3� VALOR"));
		// verificando condicional  e apresentando em tela.
		if ((valor1 > valor2) && ( valor1 > valor3)) {	
			JOptionPane.showInternalMessageDialog(null,"O MAIOR ENTRE ELES �: " + valor1 +".");
		} else if ((valor2 > valor3) && ( valor2 > valor1)) {
				JOptionPane.showInternalMessageDialog(null,"O MAIOR ENTRE ELES �: " + valor2 +".");
		} else {
			JOptionPane.showInternalMessageDialog(null,"O MAIOR ENTRE ELES �: " + valor3 +".");
		}
	}
}
//fim
 