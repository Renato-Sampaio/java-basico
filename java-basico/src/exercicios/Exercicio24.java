/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * media final de um aluno
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio24 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double n1,n2,n3,nota1,nota2,nota3,media;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS CALCULAR A MEDIA DE UM ALUNO ! ");
		n1= Double.parseDouble(JOptionPane.showInputDialog(" Qual foi a primeira nota ? "));
		n2= Double.parseDouble(JOptionPane.showInputDialog(" Qual foi a segunda nota  ? "));
		n3= Double.parseDouble(JOptionPane.showInputDialog(" Qual foi a terceira nota ? "));
		
		// atribuindo contas as variaveis
		nota1= n1 * 2;
		nota2= n2 * 3;
		nota3= n3 * 5;
		media= (nota1 +(nota2 + (nota3)))/10;
		
		// exibindo resultado em tela e calculando.
		JOptionPane.showInternalMessageDialog(null,
				"A media deste aluno é de: " + media + ".");

		// fim

	}
}