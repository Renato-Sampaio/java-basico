package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Faça um programa para ler o código e o preço de 5 produtos, calcular e escrever:
- O maior preço lido
- A média aritmética dos preços dos produtos
 * @since 11 de fev. de 2021
 */
public class Exercicio83 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int aux = 0;
		double maior = 0, preco, media = 0;

		// inicializando a variável, condicionando e incrementando com valores inputados pelo usuario.
		for (int i = 1; i <= 5; i++) {
			Integer.parseInt(JOptionPane.showInputDialog("Insira o CÓDIGO do produto " + i));
			preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o PREÇO do produto " + i));
			aux += preco;

			if (preco > maior) {
				maior = preco;
			}
		}
		// calculando a média
		media = aux /5;

		// mostra o resultado na tela
		JOptionPane.showMessageDialog(null, "Maior preço: " + maior + "\n" + "Média dos preços: " + media);
	}
}
