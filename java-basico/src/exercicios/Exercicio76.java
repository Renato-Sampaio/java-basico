package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Escreva um programa para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos.
 * @since 10 de fev. de 2021
 */
public class Exercicio76 {

	/*
	 * Metado principal para funcionar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double valor,aux;

		// inicializando a variagem de contagem
		valor = 0;
		aux=0;
		// usuario declarando 10 valores
		for (int i = 0; i < 10; i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
			aux += valor;
			
		}
	
		// Exibindo o resultado para o usuario
		JOptionPane.showInternalMessageDialog(null, "A media dos Numeros é " + aux);
	}
}