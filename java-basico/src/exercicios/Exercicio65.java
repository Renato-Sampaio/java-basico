package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio Programa ler 2 notas e aceitar apenas de 0 a 10
 *         de cada nota. 10 de fev. de 2021
 */
public class Exercicio65 {

	/**
	 * Metodo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double nota1, nota2, media;
		// recebendo o primeiro valor do usuario
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeira nota"));
		
		// recebendo o segundo valor do usuario - tem que ser diferente de zero
		while ((nota1 > 10) || (nota1 < 0)) {
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe nota 1, somente numeros de 0 a 10"));
		}	
		
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
		
		// recebendo o segundo valor do usuario - tem que ser diferente de zero
		while ((nota2 > 10) || (nota2 < 0)) {
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe nota 2, somente numeros de 0 a 10"));
		}
		
		// calculando a média
		media = (nota1 + nota2) / 2;

		// exibindo o resultado da divisão para o usuario
		JOptionPane.showMessageDialog(null, "A média atingita pelo aluno foi: " + media);

	}

}
