package exercicios;

import javax.swing.JOptionPane;

/**
 * recebendo dados do usuario e apresentando em tela o valor da multiplica��o.
 * 
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio11 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double valor1, valor2, res;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS EFETUAR A MULTIPLICA��O DE DOIS VALORES : ");
		valor1 = Double.parseDouble(JOptionPane.showInputDialog(" Informe o primero valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog(" Informe o segundo valor : "));
		// efetuando calculo
		res = valor1 * valor2;
		// exibindo resultado em tela
		JOptionPane.showInternalMessageDialog(null, "O resultado da multiplica��o do primeiro valor : " + valor1
				+ " com o segundo valor : " + valor2 + " �: " + "\n" + res);

	}

}