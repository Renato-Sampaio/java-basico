package exercicios;

import javax.swing.JOptionPane;

/**
 * calcular os lacres dos pés dos frangos.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio31 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double PD,PE, res,frango;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " Calcular gastos da granja( lacres ) ! ");
		frango= Double.parseDouble(JOptionPane.showInputDialog(" Quantosfrangos tem na granja ? "));
		
		// atribuindo contas as variaveis
		PD=4;
		PE=3.5 *2;
		res= PD + PE * frango;
		
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,
				"O total a ser gasto na granja com lacres é de : " + res + " Reais");

		// fim

	}
}