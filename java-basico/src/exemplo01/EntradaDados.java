package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstradar entrada de dados fornecidos pelo usuario
 * 
 * @author rsampaio
 * @since 05/02/2021
 */
public class EntradaDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		String nome;

		// atribuindo valor a variavel (input)
		nome = JOptionPane.showInputDialog("Digite o Seu Nome");
		// exibindo dados no console
		JOptionPane.showMessageDialog(null, " meu nome é " + nome);
	}

	
}
