package exercicios;

import javax.swing.JOptionPane;

/**
 * recebendo dados do usuario e apresentando em tela.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * Método principal para execução do programa 
	 */
	public static void main(String[] args) {
		// criando variaveis
		
		double salario,vale;
		
		// recebendo valores do usuario
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário: "));
		 vale= Double.parseDouble(JOptionPane.showInputDialog("Informe seu vale-refeição: "));
		 
		// exibindo resultado em tela
			JOptionPane.showInternalMessageDialog(null, "Então, seu salario é  " + salario + " Reais" + "\n"+
											"Seu vale-refeição atual é : " + vale + "reais");
	}

}