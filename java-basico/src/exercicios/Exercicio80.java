package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Escreva um programa que permita a entrada das seguintes informações:
     a) o número total de mercadorias no estoque;
     b) o valor de cada mercadoria.
   Ao final imprimir o valor total em estoque e a média de valor das mercadorias.
 * @since 11 de fev. de 2021
 */
public class Exercicio80 {

	/**
	 * Método principal para executar a classe.
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int qtd_merca;
		double valor_merca = 0, media = 0;

		// recebendo informação do usuário
		qtd_merca = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor total de mercadorias em estoque."));

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i <= qtd_merca; i++) {
			valor_merca += Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto " + i));
		}
		// calculando a média
		media = valor_merca / 2;

		// mostra o resultado em tela para o usuario.
		JOptionPane.showMessageDialog(null,
				"Total de mercadorias em estoque é: " + qtd_merca + "\n "+ "Média do valor das mercadorias é: " + media + ".");
	}
}
