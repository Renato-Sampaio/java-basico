package exercicios;

import javax.swing.JOptionPane;

/**
 * Ler 1ª e 2ª nota , calcular a media e se >= 6 ( aprovado ), se não reprovado.
 * @author Renato Sampaio
 * @Since 09/02/2021
 */
public class Exercicio39 {

	/**
	 * Método Principal para funcionamento da classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		double nota1,nota2,media;
		// apresentando o programa e capturando dados do usuario
		JOptionPane.showInternalMessageDialog(null,"VAMOS CONFERIR SE O ALUNO FOI APROVADO OU REPROVADO");
		nota1= Double.parseDouble(JOptionPane.showInputDialog("Qual foi a 1ª  nota?"));
		nota2= Double.parseDouble(JOptionPane.showInputDialog("Qual foi a 2ª  nota?"));
		
		//calculando a média simples
		media= (nota1+ nota2)/ 2;
		
		//verificando condicionais
		if ( media >= 6) {
			JOptionPane.showInternalMessageDialog(null," O ALUNO FOI APROVADO, COM MÉDIA : "+ media);
		} else {
			JOptionPane.showInternalMessageDialog(null," O ALUNO FOI REPROVADO, COM MÉDIA: " + media);
		}
	}
}
//fim