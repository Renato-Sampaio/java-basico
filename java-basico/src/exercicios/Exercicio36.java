package exercicios;

import javax.swing.JOptionPane;

/**
 * Imprimir em tela se numero input é maior que 10 ou não é maior que 10.
 * @author Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio36 {

	/**
	 * Metodo principal para rodar a classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		double valor;
		// apresentando e coletando dados
		JOptionPane.showInternalMessageDialog(null,"Vamos ver se um numero inserido é MAIOR que 10 ou não.");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor qualquer :"));

//verificando condicionais
		if (valor > 10) {
			JOptionPane.showInternalMessageDialog(null,"O valor é Maior que 10");
		} else {
			JOptionPane.showInternalMessageDialog(null,"O valor não é Maior que 10");
		}

	}

}
//fim
