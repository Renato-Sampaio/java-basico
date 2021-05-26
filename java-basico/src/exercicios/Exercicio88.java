/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio programa que faça leitura dos nomes de 10
 *         pessoas e armazene os nomes lidos em um vetor.Após isto, o programa
 *         deve permitir a leitura de mais 1 nome qualquer de pessoa e diga se
 *         achou ou não na lista anterior. 11 de fev. de 2021
 */
public class Exercicio88 {

	/**
	 * Método inicial para Executar a classe.
	 */
	public static void main(String[] args) {
		// decalando variavel vetor.
		String nomes[], nome;

		// inicializando o vetor e definindo o seu tamanho.
		nomes = new String[10];

		// recebendo os valores do usuario com auxilio do for.
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe os Nomes");
		}
		nome = JOptionPane.showInputDialog("Informe o nome para buscar na lista informada");

		// variavel para achar quantas vezes achou o nome .
		int achou = 0;
		// buscando o ultimo nome digitado o vetor com auxilio do for.
		for (int i = 0; i < nomes.length; i++) {

			if (nomes[i].equals(nome)) {
				achou++;
			}
		}

		if (achou > 0) {
			JOptionPane.showInternalMessageDialog(null,
					"Achei oque voce procurava , nome: " + nome );
		} else {
			JOptionPane.showInternalMessageDialog(null, "Não achei o nome que voce procurava: " + nome);
		}
	}
}
