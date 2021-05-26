/**
 * 
 */
package exemplo05;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Valorizando vetor inteiro looping.( usando FOR)
 * @since 11 de fev. de 2021
 */
public class ValorizandoVetorInteiroLooping {

	/**
	 * Metodo principal para executar a classe.
	 */
	public static void main(String[] args) {
		// decalando variavel vetor.
		int vetor[];
		
		//inicializando o vetor e definindo o seu tamanho.
		vetor= new int[5];
		
		//recebendo os valores do usuario com auxilio do for.
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));

		}
		//exibindo os valores
		for (int i = 0; i < vetor.length; i++) {
			JOptionPane.showInternalMessageDialog(null, "Osvalores lidos foi: " + vetor[i]);
		}
	}

}
