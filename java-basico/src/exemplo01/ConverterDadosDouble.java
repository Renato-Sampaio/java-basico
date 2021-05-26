package exemplo01;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar convers�o de dados do tipo String para double.
 * @author rsampaio
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * M�todo para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double valor1, valor2, resultado;
		
		//atribuindo valores as variaveis ( input)
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o Primeiro Valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o Segundo Valor"));

		//efetuando o calculo de divis�o
		resultado = valor1 / valor2;
		
		JOptionPane.showMessageDialog(null, "O resultado da divis�o � :" + resultado);
	    // fim
	
	}

}
