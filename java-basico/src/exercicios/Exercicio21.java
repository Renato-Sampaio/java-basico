package exercicios;

import javax.swing.JOptionPane;

/**
 * ler o custo de f�brica de um carro, calcular e escrever o custo final ao consumidor.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio21 {

	/*
	 * M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double fab,dist,imp,cust;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS CALCULAR O CUSTO FINAL ! ");
		fab = Double.parseDouble(JOptionPane.showInputDialog(" Qual o custo de fabrica��o do carro ? "));

		// atribuindo contas as variaveis
		imp= fab + 45/100 * fab;
		dist= 28/100 * imp ;
		cust= imp + dist;

		// exibindo resultado em tela
		JOptionPane.showInternalMessageDialog(null,
				"O valor final do custo ao consumidor � de , " + (imp + fab + cust + dist) + " reais");

		// fim

	}

}

