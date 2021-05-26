package exercicios;

import javax.swing.JOptionPane;

/**
 * Escreva um programa para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor.
 * @author Renato Duarte Sampaio
 * 10 de fev. de 2021
 */
public class Exercicio64 {


	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando as variáveis
		double dividendo, divisor;
		
		// recebendo o primeiro valor do usuario
		dividendo = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		
		// inicializando a variavel divisor
		divisor = 0;
		
		//recebendo o segundo valor do usuario - tem que ser diferente de zero
		while (divisor == 0) {
			divisor = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		}
		
		// exibindo o resultado da divisão para o usuario
		JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + (dividendo / divisor));
		
	}

}

