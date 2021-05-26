package exercicios;

import javax.swing.JOptionPane;

/**
 * ler hora inicio e hora fim de um jogo de xadrez ( maximo 24horas apenas ).
 * @author  Renato Sampaio
 * @Since 09/02/2021
 */
public class Exercicio43 {

	/**
	 * Método Principal para funcionamento da classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		int valor1, valor2, duracao;
		// apresentando o programa e capturando dados do usuario
		JOptionPane.showInternalMessageDialog(null,"Quantas horas durou esse jogo de xadrez?.");
		valor1= Integer.parseInt(JOptionPane.showInputDialog("Que horas se deu inicio a partida?"));
		valor2= Integer.parseInt(JOptionPane.showInputDialog("Qua horas se findou a partida?"));
			
		//verificando condicionais e apresentando em tela.
		if (valor1 == valor2) {
			JOptionPane.showInternalMessageDialog(null,"O jogo durou 24 horas");
		}
		
		if ( valor1 > valor2) {
			duracao =((24-valor1)+valor2);
			JOptionPane.showInternalMessageDialog(null," O jogo durou: " + duracao +" Horas.");
		} else if ( valor1 < valor2){
			duracao= (valor2 - valor1);
			JOptionPane.showInternalMessageDialog(null," O jogo durou: " + duracao +" Horas.");
		}
	}
}
//fim