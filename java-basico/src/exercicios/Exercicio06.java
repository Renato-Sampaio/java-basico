package exercicios;
import javax.swing.JOptionPane;
/**
 * recebendo dados do usuario e apresentando em tela.
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio06 {
	/*
	 * M�todo principal para execu��o do programa 
	 */
	public static void main(String[] args) {
		//declarando variaveis
		String nome, celular, cidade;
		// recebendo valores do usuario
				nome = JOptionPane.showInputDialog("Qual o seu Nome? ");
				celular = JOptionPane.showInputDialog("Qual o seu numero de celular?");
				cidade = JOptionPane.showInputDialog("Qual a sua cidade?");
				// exibindo resultado em tela
				JOptionPane.showInternalMessageDialog(null, "Ent�o, seu nome � : " + nome + "\n"+
												"Seu numero de celular �: " + celular + "\n" + 
														" Sua cidade atual �: " + cidade );
//fim
	}

}
