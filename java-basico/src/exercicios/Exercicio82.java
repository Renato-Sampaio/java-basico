package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Faça um programa para ler uma quantidade e a seguir ler esta quantidade de números. Depois de ler todos os números o programa deve apresentar na tela o maior dos números lidos e a média dos números lidos.

 * @since 11 de fev. de 2021
 */
public class Exercicio82 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int quant, numero = 0, maior = 0, aux = 0;
		double media = 0;

		// recebendo informação do usuário.
		quant = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de números que deseja informar?"));

		// inicializando a variável, condicionando e incrementando com valores inputados pelo usuario.
		for (int i = 1; i <= quant; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + i + "º número"));
			aux += numero;

			if (numero > maior) {
				maior = numero;
			}
		}
		// calculando a média
		media = aux / 2;

		// mostra o resultado em tela para o usuario.
		JOptionPane.showMessageDialog(null, "Maior entre eles é: " + maior + "\n" + "A média dos números é: " + media +".");
	}
}