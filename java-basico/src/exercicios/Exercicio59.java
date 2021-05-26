package exercicios;

import javax.swing.JOptionPane;

/**
 *Calculo para saber pre�o final de ma�a e morango.
 * @author Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio59 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Declarando variaveis
		double kilos_maca, kilos_morango, preco_maca, preco_morango, preco_final;
		
		//capturando informa��es digitadas pelo usuario
		JOptionPane.showInternalMessageDialog(null, "Informe o kilo dos produtos a serem comprados, que vou calcular seu pre�o final.");
		kilos_morango = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos kilos de morango voc� ira comprar"));
		kilos_maca = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos kilos de ma�� voc� ira comprar"));
		
		//Calculando o valor do morango
		if (kilos_morango <= 5) {
			preco_morango = kilos_morango * 2.50;
		} else {
			preco_morango = kilos_morango * 2.20;
		}
		
		//Calculando o valor do ma��
		if (kilos_maca <= 5) {
			preco_maca = kilos_maca * 1.80;
		} else {
			preco_maca = kilos_maca * 1.50;
		}
		
		//calculando o valor final
		preco_final = preco_morango + preco_maca;
		
		//verificando para dar desconto final
		if ((kilos_maca + kilos_morango > 8) || (preco_final > 25.00)) {
			preco_final = preco_final * 0.90;
			JOptionPane.showMessageDialog(null, "Voc� ter� um desconto de 10% e pagar� um total de R$" + preco_final);
		} else
			JOptionPane.showMessageDialog(null, "Voc� pagar� um total de R$" + preco_final);	
	}
}
//fim