package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para saber o total a ser pago em uma pe�a.
 * @author Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio61 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando variaveis
		String nome;
		int total;
		double preco_uni, res;
		
		//recebendo valores digitado pelo usuario
		JOptionPane.showMessageDialog(null, "Calculando o valor final na compra de um determinado tipo de pe�a.");
		nome = JOptionPane.showInputDialog("Qual a pe�a que voc� deseja comprar");
		total = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade que voc� deseja comprar"));
		preco_uni = Double.parseDouble(JOptionPane.showInputDialog("Qual o pre�o unitario"));
		
		//calculando o total 
		res= total * preco_uni;
		
		//escrevendo o total
		JOptionPane.showMessageDialog(null, "O pre�o total da compra de " + nome + " �: R$" + res);
		
		//aplicando desconto com base na quantidade de pe�as
		if (total <= 5) {
			res = total * 0.98;
			JOptionPane.showMessageDialog(null, "Voc� ter� um total de 2% de desconto e pagara R$" + res);
		} else if ((total > 5) && (total <= 10)) {
			res = total * 0.97;
			JOptionPane.showMessageDialog(null, "Voc� ter� um total de 3% de desconto e pagara R$" + res);
		} else {
			res = total * 0.95;
			JOptionPane.showMessageDialog(null, "Voc� ter� um total de 5% de desconto e pagara R$" + res);
		}
	}
}
//fim