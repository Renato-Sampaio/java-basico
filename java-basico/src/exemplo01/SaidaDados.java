package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar exibi��o de dados para usuario
 * 
 * @author rsampaio
 * @since 05/02/2021
 */
public class SaidaDados {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double num1, num2, res;

		// atribuindo valores paras variaveis
		num1 = Double.parseDouble(JOptionPane.showInputDialog(" Qual o PRIMEIRO numero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog(" Qual o SEGUNDO numero"));

		// efetuando a opera��o da multiplica��o
		res = num1 * num2;

		// exibindo o resultado em tela
		JOptionPane.showMessageDialog(null, "O primeiro valor digitado: " + num1 + "\n" + 
												"Segundo valor digitado : " + num2 + "\n" + 
															"Resultado da opera��o: " + res);
	}

}
