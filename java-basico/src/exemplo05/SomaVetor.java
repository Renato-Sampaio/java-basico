package exemplo05;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio Soma de vetor
 * @since 11 de fev. de 2021
 */
public class SomaVetor {

	/**
	 * Metodo principal para executar a classe.
	 */
	public static void main(String[] args) {
		// decalando variavel vetor.
		int vetor[];
		int soma;
		// inicializando o vetor e definindo o seu tamanho.
		vetor = new int[5];
		soma = 0;
		// recebendo os valores do usuario com auxilio do for.
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));

		}
		// somando o vetor com auxilio do for.
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		// exibindo os valores
		JOptionPane.showInternalMessageDialog(null, "A soma dos Valores é : " + soma);
	}
}
