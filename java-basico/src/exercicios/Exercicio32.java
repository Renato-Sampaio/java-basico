package exercicios;

import javax.swing.JOptionPane;

/**
 * calcular os litros a serem comprados.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio32 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double lata,garrafa1,garrafa2,res,latan,garrafa1n,garrafa2n;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " Calcular gastos da granja( lacres ) ! ");
		lata= Double.parseDouble(JOptionPane.showInputDialog(" Digite a quantidade de latas a serem compradas. "));
		garrafa1= Double.parseDouble(JOptionPane.showInputDialog(" Digite a quantidade de garrafas de 600ml a serem compradas. "));
		garrafa2= Double.parseDouble(JOptionPane.showInputDialog(" Digite a quantidade de garrafas de 2 litros a serem compradas"));
		
		// atribuindo contas as variaveis
		latan= 0.35 * lata;
		garrafa1n= 0.60 * garrafa1;
		garrafa2n= 2.0 * garrafa2;
		res= latan + garrafa1n + garrafa2n;
		
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,"O total de litros a ser comprado é de :" + res + " litros");

		// fim

	}
}
