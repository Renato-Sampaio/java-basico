package exemplo05;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio Vetor Double
 * @since 11 de fev. de 2021
 */
public class VetorDouble {

	/**
	 * Método Principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		double vetor[];

		// iniciando e informando o tamanho do vetor.
		vetor = new double[5];

		// recebendo os dados do usuario para valorizar o vetor.
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		}
		// exibindo os dados gravados no vetor.
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}
	}
}
