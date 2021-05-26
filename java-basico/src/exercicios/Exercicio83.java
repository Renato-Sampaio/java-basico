package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Fa�a um programa para ler o c�digo e o pre�o de 5 produtos, calcular e escrever:
- O maior pre�o lido
- A m�dia aritm�tica dos pre�os dos produtos
 * @since 11 de fev. de 2021
 */
public class Exercicio83 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int aux = 0;
		double maior = 0, preco, media = 0;

		// inicializando a vari�vel, condicionando e incrementando com valores inputados pelo usuario.
		for (int i = 1; i <= 5; i++) {
			Integer.parseInt(JOptionPane.showInputDialog("Insira o C�DIGO do produto " + i));
			preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o PRE�O do produto " + i));
			aux += preco;

			if (preco > maior) {
				maior = preco;
			}
		}
		// calculando a m�dia
		media = aux /5;

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Maior pre�o: " + maior + "\n" + "M�dia dos pre�os: " + media);
	}
}
