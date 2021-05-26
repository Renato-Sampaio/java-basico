package exercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Programa para verificar os valores digitados e escrever a soma dos dois maiores
 * @author Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio50 {

	/**
	 * Método principal para execução da Classe
	 */
	public static void main(String[] args) {

		// criando e instanciando um vetor de inteiros com 3 posições
		int valores[] = new int[3];	
		// criando a variável e capturando o valor digitado pelo usuário
		for (int i = 0; i < valores.length; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor " + (i+1) +":"));
		}				 
		// ordenando o vetor por ordem crescente 
		Arrays.sort(valores);
		
		// exibindo a soma dos dois maiores valores
		JOptionPane.showMessageDialog(null, "Exibindo a soma dos dois maiores valores: " + (valores[1] + valores[2]));
	}
}
//fim