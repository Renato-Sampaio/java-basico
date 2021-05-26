package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler 1� e 2� nota , calcular a media e se >= 6 ( aprovado ), se n�o reprovado.
 * @author Renato Sampaio
 * @Since 09/02/2021
 */
public class Exercicio39 {

	/**
	 * M�todo Principal para funcionamento da classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		double nota1,nota2,media;
		// apresentando o programa e capturando dados do usuario
		JOptionPane.showInternalMessageDialog(null,"VAMOS CONFERIR SE O ALUNO FOI APROVADO OU REPROVADO");
		nota1= Double.parseDouble(JOptionPane.showInputDialog("Qual foi a 1�  nota?"));
		nota2= Double.parseDouble(JOptionPane.showInputDialog("Qual foi a 2�  nota?"));
		
		//calculando a m�dia simples
		media= (nota1+ nota2)/ 2;
		
		//verificando condicionais
		if ( media >= 6) {
			JOptionPane.showInternalMessageDialog(null," O ALUNO FOI APROVADO, COM M�DIA : "+ media);
		} else {
			JOptionPane.showInternalMessageDialog(null," O ALUNO FOI REPROVADO, COM M�DIA: " + media);
		}
	}
}
//fim