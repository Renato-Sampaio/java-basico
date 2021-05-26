package exercicios;

import javax.swing.JOptionPane;

/**
 * Informar quantos dias se passaram desde o início do ano.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio26 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double dia,mes,res;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " Quantos dias se passaram desde o inicio do ano ?! ");
		dia= Double.parseDouble(JOptionPane.showInputDialog(" Que dia é hoje ? "));
		mes= Double.parseDouble(JOptionPane.showInputDialog(" Qual Mês estamos do ano ?"));
				
		// atribuindo contas as variaveis
		res=(((mes - 1)* 30)+ dia);
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,
				"O numero total de dias desde o inicio do ano é de: : " + res +" dias");

		// fim

	}
}