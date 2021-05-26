package exercicios;

import javax.swing.JOptionPane;

/**
 * ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo
atual (saldo atual = saldo - débito + crédito).
 * @author  Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio46 {

	/**
	 * Metodo principal para funcionamento da classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		double saldo,credito,debito,saldo_atual;
		JOptionPane.showInternalMessageDialog(null, "Calculo de Saldo");
		saldo= Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do seu Saldo"));
		debito= Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do seu Debito"));
		credito= Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do seu Credito"));
		//calculando saldo atual
		saldo_atual= (saldo-debito) + credito;
		//verificando codicional e apresentando em tela
		if(saldo_atual >= 0) {
			JOptionPane.showInternalMessageDialog(null,"O seu saldo é: " + saldo_atual+ "reais" + "\n" + "Sua conta esta com SALDO POSITIVO");
		} else {
			JOptionPane.showInternalMessageDialog(null,"O seu saldo é: " + saldo_atual+ " reais" + "\n" + "Sua conta esta com SALDO NEGATIVO");
		}
	}
}
//fim