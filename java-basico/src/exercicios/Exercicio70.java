package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio Programa que calcule e imprime a tabuada do 8 (1 a 10). 
 * @since 10 de fev. de 2021
 */
public class Exercicio70 {

	/**
	 * Metodo inicial para rodar a classe
	 */
	public static void main(String[] args) {
		//criando variaveis
		String resultado;
		int res;
		//atribuindo valor a variavel
		resultado = "TABUADA DO 8 \n";
		//calculando a tabua do 8 com laço de repetição
		for (int I = 1; I < 11; I++) {
			res = 8 * I;
			resultado = resultado + "8 X " + I + ":" + res +"\n";
		}
		JOptionPane.showInternalMessageDialog(null, resultado);
	}
}
