package exercicios;

import javax.swing.JOptionPane;

/**
 * Verificar se usuario pode votar ou Não ( >= 16 vota, se não, nao vota ).
 * @author Renato Sampaio
 * @Since 09/02/2021
 */
public class Exercicio40 {

	/**
	 * Método Principal para funcionamento da classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		double ano_atual,ano_nasc,idade;
		// apresentando o programa e capturando dados do usuario
		JOptionPane.showInternalMessageDialog(null,"VAMOS AVALIAR POR SUA IDADE SE VOCÊ PODE VOTAR OU NÃO!");
		ano_atual= Double.parseDouble(JOptionPane.showInputDialog("Qual é o ano atual?"));
		ano_nasc= Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu ano de nascimento?"));
		
		//calculando a média simples
		idade = (ano_atual - ano_nasc);	
		//verificando condicionais
		if ( idade >= 16) {
			JOptionPane.showInternalMessageDialog(null," PODERÁ VOTAR ESSE ANO : ");
		} else {
			JOptionPane.showInternalMessageDialog(null," NÃO PODERÁ VOTAR ESSE ANO: ");
		}
	}
}
//fim