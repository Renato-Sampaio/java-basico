package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio Ler o n�mero de alunos existentes em uma turma
 *         e, ap�s isto, ler as notas destes alunos, calcular e escrever a m�dia
 *         aritm�tica dessas notas lidas.
 * @since 10 de fev. de 2021
 */
public class Exercicio75 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
		double aux = 0, nota = 0;
		
		
		for (int i = 0; i < n; i++) {
			nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + (i+1) + ":"));
			aux += nota;
			
		}
		JOptionPane.showMessageDialog(null, "A m�dia aritm�tica das notas �: " + aux / n);
	}
}