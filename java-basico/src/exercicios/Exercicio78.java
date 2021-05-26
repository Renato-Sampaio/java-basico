package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos (incluindo os valores lidos na soma). Considere que o segundo valor lido será sempre maior que o primeiro valor lido.
 * @since 10 de fev. de 2021
 */
public class Exercicio78 {

		/*
		 * Método principal para executar a classe
		 */
		public static void main(String[] args) {


			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: "));
			
			int aux = 0;
			
			for (int i = (int)n1; i <= (int)n2; i++) {
			
				aux += i;
			
			}
			JOptionPane.showMessageDialog(null, "Soma total dos valores no intervalo: " + aux);
		}
	}