package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar o valor a ser pago em alcool ou gasolina
 * @author  Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio57 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarando variaveis
		String combustivel;
		double litros, valor_total;

		// capturando qual o tipo de combustivel vai ser colocado
		JOptionPane.showInternalMessageDialog(null, "Escolha um combustivel , alcool ou gasolina, e diga a quantidade abastecida, assim informarei o total a ser pago.");
		combustivel = JOptionPane.showInputDialog("Digite o Combsustivel que deseja abastecer [alcool]  ou  [gasolina]");

		// verificando tipo de combustivel e calculando em seus valores definidos, e apresentando em tela.
		switch (combustivel) {
		case "alcool": {
			litros = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos litros foi colocado"));
			if (litros <= 20) {
				valor_total = (litros * 2.90) * 0.97;
				JOptionPane.showMessageDialog(null, "Seu desconto foi de 3% e pagara: R$" + valor_total);
			} else {
				valor_total = (litros * 2.90) * 0.95;
				JOptionPane.showMessageDialog(null, "Seu desconto foi de 5% e pagara: R$" + valor_total);
			}
			break;
		}
		case "gasolina": {
			litros = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos litros foi colocado"));
			if (litros <= 20) {
				valor_total = (litros * 3.30) * 0.96;
				JOptionPane.showMessageDialog(null, "Seu desconto foi de 4% e pagara: R$" + valor_total);
			} else {
				valor_total = (litros * 3.30) * 0.94;
				JOptionPane.showMessageDialog(null, "Seu desconto foi de 6% e pagara: R$" + valor_total);
			}
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Combustivel digitado incorretamente!");
			;
		}
	}
}
//fim
