package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Programa que leia 10 valores e no final, escreva o maior e o menor valor lido.
 * @since 11 de fev. de 2021
 */
public class Exercicio81 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int valor = 0, menor = 1000000000, maior = 0;

		// inicializando a variável, condicionando e incrementando os valores inputados pelo usuario.
		for (int i = 1; i <= 10; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 valores\n" + i + "º valor"));

			if (valor < menor) {
				menor = valor;
			}

			if (valor > maior) {
				maior = valor;
			}
		}
		// mostra o resultado na em tela para o usuario.
		JOptionPane.showMessageDialog(null, "Menor valor informado: " + menor + "\nMaior valor informado: " + maior);
	}

}
