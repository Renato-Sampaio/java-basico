package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Ler um valor N e imprimir todos os valores inteiro entre 1 (inclusive) e N (inclusive). Considere que o N ser� sempre maior que ZERO.
 * 10 de fev. de 2021
 */
public class Exercicio69 {
	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int N;

		// recebendo o primeiro valor do usuario
		N = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor, maior que 0"));

		while (N == 0);
		{
			N = Integer.parseInt(JOptionPane.showInputDialog("Informe o outro valor \n" + "valor 0 n�o � aceito"));
		}

		for (int I = 0; I < N; I++) {
			JOptionPane.showInternalMessageDialog(null, "Numero: " + I);
		}
	}
}