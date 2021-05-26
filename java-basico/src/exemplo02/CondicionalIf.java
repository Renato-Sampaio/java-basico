package exemplo02;

import javax.swing.JOptionPane;

/**Programa para demonstrar o IF ( eslse)
 * @author rsampaio
 * @since 08/02/2021
 */
public class CondicionalIf {

	/**
	 * Metodo principal para executar
	 */
	public static void main(String[] args) {
		
		// declarando variaveis
		double imc, altura , peso;
		
		// capturando dados
		
		peso= Double.parseDouble(JOptionPane.showInputDialog(" INFORME O PESO"));
		altura= Double.parseDouble(JOptionPane.showInputDialog(" INFORME O ALTURA"));
		
		//calculando imc
		
		imc= peso / (Math.pow(altura, 2));
		
		//exibir o resultado
		
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do Peso");
		} 
			
		if ((imc >= 18.5) && ( imc <= 24.9)) {
				JOptionPane.showMessageDialog(null, "Peso ideal");
		}

		
		if ((imc >= 25) && ( imc <= 29.9 )) {
				JOptionPane.showMessageDialog(null, "Sobre Peso");
		}
		
		if ((imc >= 30) && ( imc <= 39.9 )) {
			JOptionPane.showMessageDialog(null, "Obesidade");
		}
		
		if (imc >= 40) {
			JOptionPane.showMessageDialog(null, "Obesidade Mórbida");
		}

	}

}
