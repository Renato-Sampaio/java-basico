package exercicios;

import javax.swing.JOptionPane;

/**
 * Calcule e escreva o sal�rio final do vendedor, com todas comiss�es inclusas.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double sal,vendas,comcarros,comvendas,ncarros,valorcomcarros;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS CALCULAR O SALARIO FINAL JA COM AS COMISS�ES ! ");
		ncarros = Double.parseDouble(JOptionPane.showInputDialog(" Quantos carros voc� vendeu este m�s ? "));
		vendas = Double.parseDouble(JOptionPane.showInputDialog(" Qual foi o valor total de suas vendas ? "));
		sal = Double.parseDouble(JOptionPane.showInputDialog(" Qual � o valor do seu sal�rio fixo ? "));
		comcarros = Double.parseDouble(JOptionPane.showInputDialog(" Qual o valor da comiss�o por carro vendido? "));

		// atribuindo contas as variaveis
		comvendas= vendas * 5/100;
		valorcomcarros= ncarros * comcarros;
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,
				"O salario final este m�s foi : " + (sal + comvendas + valorcomcarros) + " reais");

		// fim

	}

}