/**
 * 
 */
package exemplo05;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 *
 *         11 de fev. de 2021
 */
public class BuscarValorVetorString {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// decalando variavel vetor.
		String vetor[], nome;

		// inicializando o vetor e definindo o seu tamanho.
		vetor = new String[3];
		nome = "Renato";
		// recebendo os valores do usuario com auxilio do for.
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um Nome");

		}
		// somando o vetor com auxilio do for.
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(nome)) {
				JOptionPane.showInternalMessageDialog(null, "Achei oque voce procurava na posição: " + i);
			}
		}

	}
}
