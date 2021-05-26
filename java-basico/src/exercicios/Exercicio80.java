package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Escreva um programa que permita a entrada das seguintes informa��es:
     a) o n�mero total de mercadorias no estoque;
     b) o valor de cada mercadoria.
   Ao final imprimir o valor total em estoque e a m�dia de valor das mercadorias.
 * @since 11 de fev. de 2021
 */
public class Exercicio80 {

	/**
	 * M�todo principal para executar a classe.
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int qtd_merca;
		double valor_merca = 0, media = 0;

		// recebendo informa��o do usu�rio
		qtd_merca = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor total de mercadorias em estoque."));

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i <= qtd_merca; i++) {
			valor_merca += Double.parseDouble(JOptionPane.showInputDialog("Insira o pre�o do produto " + i));
		}
		// calculando a m�dia
		media = valor_merca / 2;

		// mostra o resultado em tela para o usuario.
		JOptionPane.showMessageDialog(null,
				"Total de mercadorias em estoque �: " + qtd_merca + "\n "+ "M�dia do valor das mercadorias �: " + media + ".");
	}
}
