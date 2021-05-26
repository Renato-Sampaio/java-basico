package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Fa�a um programa para ler uma quantidade e a seguir ler esta quantidade de n�meros. Depois de ler todos os n�meros o programa deve apresentar na tela o maior dos n�meros lidos e a m�dia dos n�meros lidos.

 * @since 11 de fev. de 2021
 */
public class Exercicio82 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int quant, numero = 0, maior = 0, aux = 0;
		double media = 0;

		// recebendo informa��o do usu�rio.
		quant = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de n�meros que deseja informar?"));

		// inicializando a vari�vel, condicionando e incrementando com valores inputados pelo usuario.
		for (int i = 1; i <= quant; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + i + "� n�mero"));
			aux += numero;

			if (numero > maior) {
				maior = numero;
			}
		}
		// calculando a m�dia
		media = aux / 2;

		// mostra o resultado em tela para o usuario.
		JOptionPane.showMessageDialog(null, "Maior entre eles �: " + maior + "\n" + "A m�dia dos n�meros �: " + media +".");
	}
}