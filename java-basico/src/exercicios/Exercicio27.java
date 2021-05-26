package exercicios;

import javax.swing.JOptionPane;

/**
 * Informar valor final do montante de camisetas p, m e g.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio27 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double np,nm,ng, montante;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS CALCULAR O VALOR A SER PAGO NOS MONTANTE DE CAMISETAS ");
		np= Double.parseDouble(JOptionPane.showInputDialog(" QUANTAS CAMISAS P SERAO COMPRADAS ? "));
		nm= Double.parseDouble(JOptionPane.showInputDialog(" QUANTAS CAMISAS M SERAO COMPRADAS ?"));
		ng=	Double.parseDouble(JOptionPane.showInputDialog(" QUANTAS CAMISAS G SERAO COMPRADAS ?"));		
		// atribuindo contas as variaveis
		montante= ( np * 10  +( nm * 12 +( ng * 15)));
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,
				"O total a ser pago é de :  " + montante +" reais");

		// fim

	}
}