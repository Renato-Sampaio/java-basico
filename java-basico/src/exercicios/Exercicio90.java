package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Escrever o maior entre 20 numeros e apresenta a sua posição
 * @since 11 de fev. de 2021
 */
public class Exercicio90 {
	/**
	 * Método principal para executar a classe.
	 */

	public static void main(String[] args) {
		// decalando variavel vetor.
		double numeros[], aux, maior, pos;
		// inicializando o vetor e definindo o seu tamanho.
		numeros = new double[20];
		maior = 0;
		aux = 0;
		pos = 0;
		// recebendo os valores do usuario com auxilio do for.
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Double.parseDouble(JOptionPane
					.showInputDialog("Informe o " + (i + 1) + "º numero ,( apenas positivos ) uma de cada vez; "));
			aux = numeros[i];

			if (numeros[i] < 0) {
				Double.parseDouble(JOptionPane.showInputDialog("Informe  apenas positivos ! "));
				maior = aux;
				pos = i;
			}
		}
		// somando o vetor com auxilio do for.
		if (aux > 0) {
			JOptionPane.showInternalMessageDialog(null, "O maior ente eles é : " + maior + "esta na posição : " + pos);

		}
	}
}
