package exercicios;

import javax.swing.JOptionPane;

/**
 * Verificar se usuario pode votar ou N�o ( >= 16 vota, se n�o, nao vota ).
 * @author Renato Sampaio
 * @Since 09/02/2021
 */
public class Exercicio40 {

	/**
	 * M�todo Principal para funcionamento da classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		double ano_atual,ano_nasc,idade;
		// apresentando o programa e capturando dados do usuario
		JOptionPane.showInternalMessageDialog(null,"VAMOS AVALIAR POR SUA IDADE SE VOC� PODE VOTAR OU N�O!");
		ano_atual= Double.parseDouble(JOptionPane.showInputDialog("Qual � o ano atual?"));
		ano_nasc= Double.parseDouble(JOptionPane.showInputDialog("Qual � o seu ano de nascimento?"));
		
		//calculando a m�dia simples
		idade = (ano_atual - ano_nasc);	
		//verificando condicionais
		if ( idade >= 16) {
			JOptionPane.showInternalMessageDialog(null," PODER� VOTAR ESSE ANO : ");
		} else {
			JOptionPane.showInternalMessageDialog(null," N�O PODER� VOTAR ESSE ANO: ");
		}
	}
}
//fim