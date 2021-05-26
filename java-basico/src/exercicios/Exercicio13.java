package exercicios;

import javax.swing.JOptionPane;

/**
 * recebendo dados do usuario e apresentando em tela o valor do modulo.
 * 
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio13 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double valor1, valor2;
		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS EFETUAR O CALCULO DO MODULO DE DOIS VALORES : ");
		valor1 = Double.parseDouble(JOptionPane.showInputDialog(" Informe o primero valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog(" Informe o segundo valor : "));
		// efetuando calculo
		// exibindo resultado em tela
		JOptionPane.showInternalMessageDialog(null, (valor1 + " ^"  + valor2 +" = " + Math.pow(valor1, valor2)));

	}

}