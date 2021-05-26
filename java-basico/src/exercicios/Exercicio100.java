package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 *	Programa para ler, armazenar a temperatura m�dia de todos os dias da semana e exibir algumas informa��es
 * @since 12 de fev. de 2021
 */
public class Exercicio100 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando as variaveis auxiliares para calculo
		double menorTemperatura, maiorTemperatura;
		double mediaTemperatura;
		double somaTemperatura;
		int quantidadeDias;

		// declarando o vetor para armazenar as temperaturas dos dias da semana
		double temperatura[];

		// inicializar as vari�veis de c�lculo
		menorTemperatura = Double.MAX_VALUE;
		maiorTemperatura = Double.MIN_VALUE;
		mediaTemperatura = 0;
		somaTemperatura = 0;
		quantidadeDias = 0;

		// inicializar o vetor de temperatura semanal
		temperatura = new double[7];

		// capturando do usuario as temperaturas dos dias da semana
		for (int i = 0; i < temperatura.length; i++) {
			temperatura[i] = Double.parseDouble(
					JOptionPane.showInputDialog("Informe a temperatura do " + (i + 1) + "� dia da semana"));
		}

		// verificando a menor temperatura da semana
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] < menorTemperatura) {
				menorTemperatura = temperatura[i];
			}
		}

		// verificando a maior temperatura da semana
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] > maiorTemperatura) {
				maiorTemperatura = temperatura[i];
			}
		}

		// calculando a m�dia de temperatura semanal
		for (int i = 0; i < temperatura.length; i++) {
			somaTemperatura += temperatura[i];
		}
		mediaTemperatura = somaTemperatura / temperatura.length;
		
		// verificando a quantidade de dias com temperatura abaixo da m�dia
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] < mediaTemperatura) {
				quantidadeDias++;
			}
		}
		
		//exibindo o resultado para o usuario
		System.out.println("Menor temperatura: " + menorTemperatura);
		System.out.println("Maior temperatura: " + maiorTemperatura);
		System.out.println("M�dia semanal....: " + mediaTemperatura);
		System.out.println("Dias abaixo media: " + quantidadeDias);

	}

}
