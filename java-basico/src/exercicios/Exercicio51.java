package exercicios;

import javax.swing.JOptionPane;

/**
 * fazer a multiplica��o dos dois menores n�meros
 * @author  Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio51 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarando as variaveis
		int valor1, valor2, valor3;

		// capturando informa��es digitadas pelo usuario
		JOptionPane.showInternalMessageDialog(null, "DIFITE 3 NUMEROS, QUE FAREI A MULTIPLICA��O DO 2 MENORES ENTRE ELES.");
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
		
		//verificando qual s�o os maiores valores e apresentando em tela.
		if ((valor1 < valor2) && (valor1 < valor3) && (valor2 < valor3)) {
			JOptionPane.showMessageDialog(null, "A multiplica��o dos menores �: " + (valor1 * valor2));
		} else if ((valor1 < valor2) && (valor1 <valor3) && (valor2 > valor3)) {
			JOptionPane.showMessageDialog(null, "A multiplica��o dos menores �: " + (valor1 * valor3));
		} else {
			JOptionPane.showMessageDialog(null, "A multiplica��o dos menores �: " + (valor2 * valor3));
		}
	}
}
//fim