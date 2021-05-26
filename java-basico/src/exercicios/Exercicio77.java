package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Escreva um programa para ler 10 números. Todos os números lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada.
 * @since 10 de fev. de 2021
 */
public class Exercicio77 {

	/*
	 * Método Principal para funcionamento da classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int  valor, aux;
		// inicializando a variagem de contagem
		valor = 0;
		aux = 0;
		// usuario declarando 10 valores
		for (int i = 0; i < 10; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			if (valor <= 40) {
				aux += valor;
			}
		}
		
		// Exibindo o resultado para o usuario
		JOptionPane.showInternalMessageDialog(null,"A soma dos numeros Menores que 40 é:  " + aux);
	}
}
