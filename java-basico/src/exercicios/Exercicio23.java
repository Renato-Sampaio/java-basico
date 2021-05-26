package exercicios;

import javax.swing.JOptionPane;

/**
 * ler em fahrenheit e calcular e apresentar em tela em celsius
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio23 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double fah,cel;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS CONVERTER TEMPERATURAS ! ");
		fah= Double.parseDouble(JOptionPane.showInputDialog(" Quantos graus esta marcando o termometro em Fahrenheit ? "));
		
		// atribuindo contas as variaveis
		cel=((5*(fah - 32))/9);
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,
				"A temperatura em celcius é : " + cel + " C°");

		// fim

	}
}