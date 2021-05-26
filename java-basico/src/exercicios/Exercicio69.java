package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Ler um valor N e imprimir todos os valores inteiro entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.
 * 10 de fev. de 2021
 */
public class Exercicio69 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int N;

		// recebendo o primeiro valor do usuario
		N = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor, maior que 0"));

		while (N == 0);
		{
			N = Integer.parseInt(JOptionPane.showInputDialog("Informe o outro valor \n" + "valor 0 não é aceito"));
		}

		for (int I = 0; I < N; I++) {
			JOptionPane.showInternalMessageDialog(null, "Numero: " + I);
		}
	}
}