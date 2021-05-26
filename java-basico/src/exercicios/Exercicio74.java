package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio Ler 10 valores, calcular e escrever a média
 *         aritmética desses valores lidos
 * @since 10 de fev. de 2021
 */
public class Exercicio74 {
	/**
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int valor,res;

		// inicializando a variagem de contagem
		valor = 0;
		// usuario declarando 10 valores
		for (int i = 0; i <= 10; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			valor += valor;
		}
		res= valor/10;
		// Exibindo o resultado para o usuario
		JOptionPane.showInternalMessageDialog(null, "A media dos Numeros é " + res);
	}

}