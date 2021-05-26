package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para validar ID e SENHA de uma conta.
 * @author Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio60 {

	/**
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// Declarando variaveis
		int id, senha;
		
		//recebendo valores digitado pelo usuario e verificando condicionais.
		JOptionPane.showMessageDialog(null, "Efetuar LOGIN.");
		id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID ."));
		//se ID for igual a 1234 , passa, se não, menjagem de erro
		if(id == 1234) {
			senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha de usuario"));
			//se passar pelo ID , confirmar senha, se igual a 9999 , mensagem Permitido , se não Negado.
			if (senha == 9999) {  
				JOptionPane.showMessageDialog(null, "Acesso permitido!");
			} else { 
				JOptionPane.showMessageDialog(null, "Acesso negado!");
			}
		} else {
			//diferente de ID ou Senha , mensagem de erro
			JOptionPane.showMessageDialog(null, "Usuário inválido!");
		}
	}
}
//fim