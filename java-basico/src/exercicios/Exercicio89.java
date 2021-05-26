package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio ler 20 notas, calcular media, quantos alunos
 *         ficaram acima da media, imprimir a media da sala e resultado da
 *         contagem.
 * @since 11 de fev. de 2021
 */
public class Exercicio89 {

	/**
	 * Método principal para executar a classe
	 */

	public static void main(String[] args) {
		// decalando variavel vetor.
		double notas[], media, aux, contador;

		// inicializando o vetor e definindo o seu tamanho.
		notas = new double[20];
		aux = 0;
		contador = 0;
		// recebendo os valores do usuario com auxilio do for.
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe as notas dos alunos, uma de cada vez; "));
			aux += notas[i];
		}

		media = aux / 20;
		// somando o vetor com auxilio do for.
		for (int i = 0; i < notas.length; i++) {
			if (media >= notas[i]) {
				contador++; //contador no laço de repetição se verdadeiro
			}
		}
		//condicional caso verdadeira ou falso.
		if (contador > 0) {
			//imprimindo em tela o numero de alunos acima da media
			JOptionPane.showInternalMessageDialog(null, "O numero de alunos que ficaram acima da media é: " + contador);
		} else {
			JOptionPane.showInternalMessageDialog(null, "Nenhum aluno ficou acima da média");
		}
		// imprimindo em tela a media da sala
		JOptionPane.showInternalMessageDialog(null, "A media da sala é: " + media);
	}
}
