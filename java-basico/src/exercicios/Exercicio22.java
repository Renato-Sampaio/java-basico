package exercicios;

import javax.swing.JOptionPane;

/**
 * Calcule e escreva o salário final do vendedor, com todas comissões inclusas.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double sal,vendas,comcarros,comvendas,ncarros,valorcomcarros;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS CALCULAR O SALARIO FINAL JA COM AS COMISSÕES ! ");
		ncarros = Double.parseDouble(JOptionPane.showInputDialog(" Quantos carros você vendeu este mês ? "));
		vendas = Double.parseDouble(JOptionPane.showInputDialog(" Qual foi o valor total de suas vendas ? "));
		sal = Double.parseDouble(JOptionPane.showInputDialog(" Qual é o valor do seu salário fixo ? "));
		comcarros = Double.parseDouble(JOptionPane.showInputDialog(" Qual o valor da comissão por carro vendido? "));

		// atribuindo contas as variaveis
		comvendas= vendas * 5/100;
		valorcomcarros= ncarros * comcarros;
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,
				"O salario final este mês foi : " + (sal + comvendas + valorcomcarros) + " reais");

		// fim

	}

}