package exercicios;

import javax.swing.JOptionPane;

/**
 * LER 3 VALORES E MOSTRAR O MENOR DELES
 * @author  Renato Sampaio
 * @SINCE 09/02/2021
 */
public class Exercicio49 {

	/**
	 * Método principal pra rodar a classe
	 */
	public static void main(String[] args) {
		//criando variaveis
		double valor1,valor2,valor3;
		JOptionPane.showInternalMessageDialog(null,"INSIRA 3 VALORES E TE MOSTRAREI O MENOR ENTRE ELES ");
		valor1= Double.parseDouble(JOptionPane.showInputDialog("INSIRA O 1º VALOR"));
		valor2= Double.parseDouble(JOptionPane.showInputDialog("INSIRA O 2º VALOR"));
		valor3= Double.parseDouble(JOptionPane.showInputDialog("INSIRA O 3º VALOR"));
		//verificando saldo atual e apresentando em tela
		if ((valor1 < valor2) && ( valor1 < valor3)) {	
			JOptionPane.showInternalMessageDialog(null,"O MENOR ENTRE ELES É: " + valor1 +".");
		} else if ((valor2 < valor3) && ( valor2 < valor1)) {
				JOptionPane.showInternalMessageDialog(null,"O MENOR ENTRE ELES É: " + valor2 +".");
		} else {
			JOptionPane.showInternalMessageDialog(null,"O MENOR ENTRE ELES É: " + valor3 +".");
		}
	}
}
//fim
 