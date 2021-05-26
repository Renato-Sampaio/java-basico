package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Escreva um programa para imprimir os 10 primeiros números inteiros maiores que 100.
 * 10 de fev. de 2021
 */
public class Exercicio68 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//escrevendo os 10 primeiros inteiros de < 100
		for (int i = 101; i < 111; i++) {
			JOptionPane.showInternalMessageDialog(null,"Numero: " + i);	
		}

	}

}