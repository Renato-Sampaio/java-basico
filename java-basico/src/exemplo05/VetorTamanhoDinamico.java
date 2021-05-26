package exemplo05;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio 
 * Tamanho Dinamico
 * @since 11 de fev. de 2021
 */
public class VetorTamanhoDinamico {

	/**
	 * Método Principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		int vetor[];


		//variavel auxiliar para definir o tamanho do vetor.
		int tamanho;
		
		//usurario informando o tamanho do vetor
		tamanho= Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
		
		//iniciando o vetor.
		vetor = new int[tamanho];
		
		
		// recebendo os dados do usuario para valorizar o vetor.
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		// exibindo os dados gravados no vetor.
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}
	}
}
