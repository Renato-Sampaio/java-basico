package exercicios;

import javax.swing.JOptionPane;

/**
 *Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:a idade dessa pessoa em anos;a idade dessa pessoa em meses;a idade dessa pessoa em dias;ade dessa pessoa em semanas.
 * @autor Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio35 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double idade, ano_nasc, ano_atual, mes, dias, semanas;
		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " CALCULANDO SUA IDADE EM ANOS,MESES,SEMANAS E DIAS. ");
		ano_nasc= Double.parseDouble(JOptionPane.showInputDialog(" Qual seu ano de nascimento ?:  "));
		ano_atual= Double.parseDouble(JOptionPane.showInputDialog(" Em que ano estamos?:  "));
	
		
		// atribuindo contas as variaveis
		idade= ano_atual - ano_nasc;
		mes= idade * 12;
		dias= idade * 365;
		semanas= idade * 52;
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,"Sua idade em anos é: " + idade + " anos");
		JOptionPane.showInternalMessageDialog(null,"Sua idade em meses é: " + mes + " meses");
		JOptionPane.showInternalMessageDialog(null,"Sua idade em semanas é: " + semanas + " semanas");
		JOptionPane.showInternalMessageDialog(null,"Sua idade em dias é: " + dias + " dias");
		JOptionPane.showInternalMessageDialog(null,"               OBRIGADO");
		// fim 

	}
}