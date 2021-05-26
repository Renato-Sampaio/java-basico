/**
 * 
 */
package exemplo05;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio Vetor String
 * @since 11 de fev. de 2021
 */
public class VetorString {

	/**
	 * metodo principal para executar a classe.
	 */
	public static void main(String[] args) {
		// declarando vetor
		String vetor[];

		/// iniciando vetor.
		vetor = new String[5];

		// valorizando vetor recebendo dados do usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um Nome:");

		}

		// exibindo os dados gravados
		for (int i = 0; i < vetor.length; i ++) {
			JOptionPane.showInternalMessageDialog(null, "Os nomes Informados fora: \n" + vetor[i]);
		}
	}

}
