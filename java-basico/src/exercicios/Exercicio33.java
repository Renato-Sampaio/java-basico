package exercicios;

import javax.swing.JOptionPane;

/**
 *ler a quantidade de cada tipo de moeda, e imprimir o valor total economizado, em reais.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio33 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double um_r,cinco,dez,vinte,cinq,um,total;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS VER QUANTO TEM NO COFRINHO? ");
		um= Double.parseDouble(JOptionPane.showInputDialog(" Qual a qantidade de moedas de 1 centavo "));
		cinco= Double.parseDouble(JOptionPane.showInputDialog(" Qual a qantidade de moedas de 5 centavos "));
		dez= Double.parseDouble(JOptionPane.showInputDialog(" Qual a qantidade de moedas de 10 centavos "));
		vinte= Double.parseDouble(JOptionPane.showInputDialog(" Qual a qantidade de moedas de 25 centavos "));
		cinq= Double.parseDouble(JOptionPane.showInputDialog(" Qual a qantidade de moedas de 50 centavos "));
		um_r= Double.parseDouble(JOptionPane.showInputDialog(" Qual a qantidade de moedas de 1 real "));
		
		
		// atribuindo contas as variaveis
		total = (1 * um_r) + (0.05 * cinco) + (0.1 * dez) + (0.25 * vinte) + (0.5 * cinq) + (0.01 * um);
		
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,"O total do cofrinho é de:" + total + " Reais");

		// fim

	}
}
