package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler o valor e imprimir se for Positivo ou Negativo ( Zero = Positivo)
 * @author Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio37 {

	/**
	 * Método principal para rodar a classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		double valor ;
		
		//apresentando e coletando dados
		JOptionPane.showInternalMessageDialog(null,"Insira um valor e lhe direi se ele é POSITIVO ou NEGATIVO !");
		valor=Double.parseDouble(JOptionPane.showInputDialog("Digite um valor qualquer."));
		
		//verificando condicionais
		
		if (valor >= 0) {
			JOptionPane.showInternalMessageDialog(null,"O valor inserido é POSITIVO !");
		}else {
		JOptionPane.showInternalMessageDialog(null,"O valor inserido é NEGATIVO !");
		}
	}
}
