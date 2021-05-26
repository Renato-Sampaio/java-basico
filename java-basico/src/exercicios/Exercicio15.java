package exercicios;

import javax.swing.JOptionPane;

/**
 * recebendo dados do usuario e apresentando em tela o valor do antecessor informado.
 * 
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio15 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double valor1, res;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " ME DE UM NUMERO E TE APRESENTAREI SEU ANTECESSOR ");
		valor1 = Double.parseDouble(JOptionPane.showInputDialog(" Informe o numero: "));
		
		// efetuando calculo
		res = valor1 - 1;
		// exibindo resultado em tela
		JOptionPane.showInternalMessageDialog(null, "Antencessor do numero informado é: " + res);

	}

}