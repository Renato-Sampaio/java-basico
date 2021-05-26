package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio 
 * Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.
 * @since 10 de fev. de 2021
 */
public class Exercicio71 {

	/*
	 * Metodo inicial para rodar a classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		String resultado;
		int res;
		int tab;
		// solicitando dados ao usuario.
		tab = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Valor, para calcular sua tabuada"));
		// atribuindo valor a variavel
		resultado = "TABUADA DO " + tab + "\n";
		// calculando a tabua do numero informado com laço de repetição
		for (int I = 1; I < 11; I++) {
			res = tab * I;
			resultado = resultado + tab + " X " + I + ":" + res + "\n";
		}
		JOptionPane.showInternalMessageDialog(null, resultado);
	}
}
