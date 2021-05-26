package exercicios;
import javax.swing.JOptionPane;
/**
 * recebendo dados do usuario e apresentando em tela o valor da multiplicação.
 * 
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio16 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double valor1, valor2, res;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS EFETUAR O CALCULO DA AREA DE UM RETÂGULO ! ");
		valor1 = Double.parseDouble(JOptionPane.showInputDialog(" Informe primero valor da BASE: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog(" Agora informe o  valor da ALTURA : "));
		// efetuando calculo
		res = valor1 * valor2;
		// exibindo resultado em tela
		JOptionPane.showInternalMessageDialog(null, "O resultado da area do retângulo é : " + res);

	}

}