package exercicios;

import javax.swing.JOptionPane;

/**
 * Calculo de Varejo e Atacado ( frutas )
 * @author Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio38 {
	/**
	 * Método principal pra funcionamento da classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		double fruta;
		// apresentando e solicitando dados ao usuario
		JOptionPane.showInternalMessageDialog(null,
				"INSIRA O NUMERO DE FRUTAS A SEREM COMPRADAS PARA A APLICAÇÂO DO DESCONTO, QUANDO HOUVER.");
		fruta = Double.parseDouble(JOptionPane.showInputDialog("Quantas frutas serão compradas?"));
		// aplicando condicionais
		if (fruta >= 12) {
			fruta = 1.00 * fruta;
		} else {
			fruta = 1.30 * fruta;
		}
		JOptionPane.showInternalMessageDialog(null, "O valor da compra ficou em : " + fruta + " reais");
	}
}
//fim