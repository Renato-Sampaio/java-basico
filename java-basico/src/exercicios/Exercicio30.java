package exercicios;

import javax.swing.JOptionPane;

/**
 * ler em celcius e calcular e apresentar em tela em fahrenheit
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio30 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double fah,cel;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS CONVERTER TEMPERATURAS ! ");
		cel= Double.parseDouble(JOptionPane.showInputDialog(" Quantos graus esta marcando o termometro em Fahrenheit ? "));
		
		// atribuindo contas as variaveis
		fah=((cel * (9/5)) + 32 );
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,
				"A temperatura em fahrenheit é : " + fah + " F°");

		// fim

	}
}