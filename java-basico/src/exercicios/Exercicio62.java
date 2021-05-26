package exercicios;

import javax.swing.JOptionPane;

/**
 * fazer a media das notas e aplicar um coneito a media do aluno.
 * @author Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio62 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarando variaveis
		double nota1, nota2, nota3, media_ex, media;
		
		//capturando dados do usuario
		JOptionPane.showMessageDialog(null, "Calculando a Media e Aplicando conceito.");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
		media_ex = Double.parseDouble(JOptionPane.showInputDialog("Digite a media dos exercicios"));
		
		//calculando a media
		media = (nota1 + (nota2 * 2) + (nota3 * 3) + media_ex)/7;
		//verificando as condicionais para saber em qual consito o aluno se enquadra.		
		if (media >= 9) {
			JOptionPane.showMessageDialog(null, "Sua média está no conceito A");
		} else if ((media >= 7.5) && (media < 9.0)) {
			JOptionPane.showMessageDialog(null, "Sua média está no conceito B");
		} else if ((media >= 6.0) && (media < 7.5)) {
			JOptionPane.showMessageDialog(null, "Sua média está no conceito C");
		}else {
			JOptionPane.showMessageDialog(null, "Sua média está no conceito D");
		}
	}
}
//fim