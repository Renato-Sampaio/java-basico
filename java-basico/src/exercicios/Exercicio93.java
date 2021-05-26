package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * @Faça um programa para ler 20 números e armazenar em um vetor. Após a leitura
 *       total dos 20 números, o programa deve escrever esses 20 números lidos
 *       na ordem inversa.
 * 
 * @since 12 de fev. de 2021
 */
public class Exercicio93 {

	/**
	 * Metodo principal para Executar a classe.
	 */
	public static void main(String[] args) {
		// Declarando variaveis e vetores.
		double vetorA[];
		// inicializando vetor A e declarando valor sobre a variavel auxiliar.
		vetorA = new double[20];
		
		// valorizando vetor A e recebendo dados do usuario.
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º numero; "));		
		}
		for (int i = vetorA.length - 1; i >= 0; i--) {
			JOptionPane.showInternalMessageDialog(null, "A ordem inversa dos numeros é : \n" + vetorA[i]);
			;
		}
	}
	
}