package exercicios;

import javax.swing.JOptionPane;

/**
 * recebendo dados do usuario e apresentando em tela.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * M�todo principal para execu��o do programa 
	 */
	public static void main(String[] args) {
		// criando variaveis
		
		double salario,vale;
		
		// recebendo valores do usuario
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu sal�rio: "));
		 vale= Double.parseDouble(JOptionPane.showInputDialog("Informe seu vale-refei��o: "));
		 
		// exibindo resultado em tela
			JOptionPane.showInternalMessageDialog(null, "Ent�o, seu salario �  " + salario + " Reais" + "\n"+
											"Seu vale-refei��o atual � : " + vale + "reais");
	}

}