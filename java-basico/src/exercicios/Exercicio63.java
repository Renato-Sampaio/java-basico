package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar direito à aposentadoria
 * @author Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio63 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int ano_atual, ano_nasc, ent_empresa, idade, tempo_trab;
		// capturando dados do usuario
		JOptionPane.showMessageDialog(null, "Verificar direito à aposentadoria.");
		ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos"));
		ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Em que ano nasceu"));
		ent_empresa = Integer.parseInt(JOptionPane.showInputDialog("Em que ano que entrou na empresa"));
		// calculando idade
		idade = ano_atual - ano_nasc;
		tempo_trab = ano_atual - ent_empresa;
		// verificando condições de aposentadoria e apresentando em tela.
		if ((idade >= 60) && (tempo_trab >= 25)) {
			JOptionPane.showMessageDialog(null, "Requerer aposentadoria");
		} else if ((idade >= 65) || (tempo_trab >= 30)) {
			JOptionPane.showMessageDialog(null, "Requerer aposentadoria");
		} else
			JOptionPane.showMessageDialog(null, "Não requerer aposentadoria");
	}
}
//fim