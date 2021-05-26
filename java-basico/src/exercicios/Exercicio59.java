package exercicios;

import javax.swing.JOptionPane;

/**
 *Calculo para saber preço final de maça e morango.
 * @author Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio59 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Declarando variaveis
		double kilos_maca, kilos_morango, preco_maca, preco_morango, preco_final;
		
		//capturando informações digitadas pelo usuario
		JOptionPane.showInternalMessageDialog(null, "Informe o kilo dos produtos a serem comprados, que vou calcular seu preço final.");
		kilos_morango = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos kilos de morango você ira comprar"));
		kilos_maca = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos kilos de maçã você ira comprar"));
		
		//Calculando o valor do morango
		if (kilos_morango <= 5) {
			preco_morango = kilos_morango * 2.50;
		} else {
			preco_morango = kilos_morango * 2.20;
		}
		
		//Calculando o valor do maçã
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
			JOptionPane.showMessageDialog(null, "Você terá um desconto de 10% e pagará um total de R$" + preco_final);
		} else
			JOptionPane.showMessageDialog(null, "Você pagará um total de R$" + preco_final);	
	}
}
//fim