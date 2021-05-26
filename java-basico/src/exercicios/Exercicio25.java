package exercicios;

import javax.swing.JOptionPane;

/**
 * calcular e exibir ao usuario quantos litros entrou no tanque.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio25 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double litros,valorpago,valorlitros;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS A QUANTIDADE DE LITROS COMPRADOS ! ");
		valorlitros= Double.parseDouble(JOptionPane.showInputDialog(" Qual o preço do litro gasolina ? ? "));
		valorpago= Double.parseDouble(JOptionPane.showInputDialog(" Qual foi o valor pago no fim do abastecimento"));
				
		// atribuindo contas as variaveis
		litros= valorpago / valorlitros;
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,
				"A quantidade de litros comprados foi de: " + litros + " litros.");

		// fim

	}
}