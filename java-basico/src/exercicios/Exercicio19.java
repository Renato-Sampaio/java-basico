package exercicios;

import javax.swing.JOptionPane;

/**
 * Vamos calcular o salario atua com reajuste percentual.
 * 
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio19 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double salario,reajuste,salariofinal;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS CALCULAR SEU SALARIO FINAL JÁ COM SEU REAJUSTE! ");
		salario = Double.parseDouble(JOptionPane.showInputDialog(" Informe o salario atual: "));
		reajuste = Double.parseDouble(JOptionPane.showInputDialog(" Informe o a porcentagem do reajuste"));
		

		// atribuindo contas as variaveis
		salariofinal = salario + ( salario * reajuste/100 );

		// exibindo resultado em tela
		JOptionPane.showInternalMessageDialog(null,"O seu novo salário é: "+ salariofinal );

		// fim
	}

}
