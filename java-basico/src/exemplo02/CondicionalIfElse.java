package exemplo02;

import javax.swing.JOptionPane;

/**
 * IF - ELSE
 * 
 * @author rsampaio
 * @since 08/02/2021
 */
public class CondicionalIfElse {

	/**
	 * Metodo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando as variaveis
		double imc, altura, peso;

		peso = Double.parseDouble(JOptionPane.showInputDialog("Infome o peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Infome a altura"));

        //calculando o valor do IMC do usuario
		imc = peso / (Math.pow(altura, 2));

		// demonstrando o resultado para o usuario
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, " Abaixo do peso");
		} else {
			if (imc >= 18.6 ) 
			JOptionPane.showMessageDialog(null, " Peso ideal");
		}
	}

}
         //fim