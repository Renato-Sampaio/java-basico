package exercicios;

import javax.swing.JOptionPane;

/**
 * Pegar qauntidade de produto fiinal e disponibilizar a quantidade de produtos para fabrica��o.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio29 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double queijo,presunto,hamburguer,lanches;
		

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " INFORME QUANTOS LANCHES VAI PRODUZRIR E TE DAREI O TOTAL DE INGREDIENTES ");
		lanches= Double.parseDouble(JOptionPane.showInputDialog(" QUANTOS LANCHES SER�O ? "));
	
		// atribuindo contas as variaveis
		queijo = (((0.05) * 2 ) * lanches);
		presunto= (0.05 * lanches);
		hamburguer=	(0.1 * lanches);
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,
				"A quantidade de queijo � :  " + queijo +"kg");
		JOptionPane.showInternalMessageDialog(null,
				"A quantidade de queijo � :  " + presunto +" kg");
		JOptionPane.showInternalMessageDialog(null,
				"O primeiro valor a ser pago � :  " + hamburguer +" kg");
		// fim

	}
}