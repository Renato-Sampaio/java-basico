package exercicios;

import javax.swing.JOptionPane;

/**
 * recebendo dados do usuario e apresentando em tela.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio07 {

	/*
	 * M�todo principal para execu��o do programa 
	 */
	public static void main(String[] args) {
		// criando variaveis
		int idade;
		double peso,altura;
		
		// recebendo valores do usuario
		 idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
		 peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: "));
		 altura= Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
		 
		// exibindo resultado em tela
			JOptionPane.showInternalMessageDialog(null, "Ent�o, sua idade �  " + idade + " anos" + "\n"+
											"Seu peso atual �: " + peso + " Kg" + "\n" + 
													" Sua altura �:  " + altura + " m");
	}

}
