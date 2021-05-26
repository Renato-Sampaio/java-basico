package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 *
 *         10 de fev. de 2021
 */
public class Exercicio73 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int contador, contador2, valor;
		// inicializando a variagem de contagem
		contador = 0;
		contador2 = 0;
		// usuario declarando 10 valores
		for (int i = 0; i < 10; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			if ((valor >= 10) && (valor <= 20)) {
				contador++;
			} else {
				contador2++;
			}
		}
		// Exibindo o resultado para o usuario
		JOptionPane.showInternalMessageDialog(null,
				"Numeros dentro do intervalo 10 - 20:  " + contador +"\n"+ "Numeros fora do intervalo 10 - 20:  " + contador2);
	}
}