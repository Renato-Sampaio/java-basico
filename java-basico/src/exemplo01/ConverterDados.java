package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar conversão de tipos de dados
 * 
 * @author rsampaio
 * @since 05/02/2021
 */
public class ConverterDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int valor1,valor2,resultado;
		
		// recebendo valores do usuario

		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Primeiro Valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Segundo Valor"));

		// exibindo resultado da soma
		resultado = valor1 + valor2;

		JOptionPane.showInternalMessageDialog(null, "O resultado da soma é: " + resultado);

	}

	
	
	
	
	
	
}
