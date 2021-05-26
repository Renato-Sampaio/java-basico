package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS.
 * 10 de fev. de 2021
 */
public class Exercicio72 {

	/**
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int contador,valor;
		//inicializando a variagem de contagem
		contador=0;
		//usuario declarando 10 valores
		for (int i = 0; i < 10; i++) {
			valor= Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			if (valor < 0)
			contador++;
		}
		//Exibindo o resultado para o usuario
				JOptionPane.showInternalMessageDialog(null,"Numeros Negativos digitados "+ contador);
	}
	
}
