package exercicios;

import javax.swing.JOptionPane;

/**
 * converter dolar em real.
 * 
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio20 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double dolar, real;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS CONVERTER UM VALOR DE DOLAR (6.61) .PARA REAL ! ");
		dolar = Double.parseDouble(JOptionPane.showInputDialog(" Informe o valor em Dolares: "));

		// atribuindo contas as variaveis
		real = dolar * 6.61;

		// exibindo resultado em tela
		JOptionPane.showInternalMessageDialog(null,
				"O valor em real de, " + dolar + "dolares, é de : " + real +" reais");

		// fim

	}

}