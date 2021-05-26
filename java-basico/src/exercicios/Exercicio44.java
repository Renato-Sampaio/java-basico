package exercicios;

import javax.swing.JOptionPane;

/**
 * Calculo de salario + hora extras a 50%
 * @author  Renato Sampaio
 *@since 09/02/2021
 */
public class Exercicio44 {
	/**
	 * Método principal para funcionamento da classe
	 */
	public static void main(String[] args) {
		// Criando variaveis
		double salario, hora_mes,valor_hora, extra;
		// apresentando o programa e capturando dados do usuario
		JOptionPane.showInternalMessageDialog(null, "Calculo de salario + hora extras a 50%");
		hora_mes= Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas no mes: "));
		valor_hora= Integer.parseInt(JOptionPane.showInputDialog("Qua horas se findou a partida?"));
			
		//verificando condicionais
		//com base nas horas trabalhadas calcular o salario e apresentar em tela.
		if ( hora_mes <= 160 ) {
			salario= hora_mes * valor_hora;
			JOptionPane.showInternalMessageDialog(null,"o Salario será: "+ salario +" reias");
		} else {
			extra = ((hora_mes -160) * valor_hora * 1.5) + 160* valor_hora;
			JOptionPane.showInternalMessageDialog(null,"o Salario será: "+ extra +" reias");
		}
	}
}
//fim
