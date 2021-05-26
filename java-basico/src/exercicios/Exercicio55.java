package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para saber qual é o time vencedor
 * @author  Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio55 {

	/**
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Declarando variaveis
		String time1, time2;
		int gol1, gol2;
		//capturando informações digitadas pelo usuario
		JOptionPane.showInternalMessageDialog(null, "Resultado do jogo");
		time1 = JOptionPane.showInputDialog("Digite o nome do primeiro time");
		gol1 = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos gols o time " + time1 + " fez"));
		time2 = JOptionPane.showInputDialog("Digite o nome do segundo time");
		gol2 = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos gols o time " + time2 + " fez"));
		
		//verificando quantidade de gols
		if (gol1 == gol2) {
			JOptionPane.showMessageDialog(null, "EMPATE");
		} else if(gol1 > gol2) {
			JOptionPane.showMessageDialog(null, "Time da(o)" + time1 + " ganhou!");
		} else {
			JOptionPane.showMessageDialog(null, "Time da(o)" + time2 + " ganhou!");
		}
	}
}
//fim