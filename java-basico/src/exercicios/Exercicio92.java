package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio ler um vetor A com 10 numeros
 * @since 12 de fev. de 2021
 */
public class Exercicio92 {

	/**
	 * Método principal para executzr a classe.
	 */
	public static void main(String[] args) {
		// Declarando variaveis e vetores.
		double vetorA[], vetorM[], X;
		String msg;
		// inicializando vetor A e declarando valor sobre a variavel msg.
		vetorA = new double[10];
		msg = "  ";

		// valorizando vetor A e recebendo dados do usuario.
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º numero; "));

		}
		X = Double.parseDouble(
				JOptionPane.showInputDialog("Informe o numero para multiplicarmos com os valores inseridos; "));

		vetorM = new double[10];
		for (int i = 0; i < vetorM.length; i++) {
			vetorM[i] = vetorA[i] * X;
			msg += vetorM[i] + " x " + X + "\n";

			if (vetorM[i] > 0) {
			}
		}
		JOptionPane.showInternalMessageDialog(null, "O resultado das multiplicações foram de:\n" + msg);
	}
}
