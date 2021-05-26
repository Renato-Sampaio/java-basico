package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar exibição de dados para usuario
 * 
 * @author rsampaio
 * @since 05/02/2021
 */
public class SaidaDados {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double num1, num2, res;

		// atribuindo valores paras variaveis
		num1 = Double.parseDouble(JOptionPane.showInputDialog(" Qual o PRIMEIRO numero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog(" Qual o SEGUNDO numero"));

		// efetuando a operação da multiplicação
		res = num1 * num2;

		// exibindo o resultado em tela
		JOptionPane.showMessageDialog(null, "O primeiro valor digitado: " + num1 + "\n" + 
												"Segundo valor digitado : " + num2 + "\n" + 
															"Resultado da operação: " + res);
	}

}
