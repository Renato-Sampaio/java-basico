package exercicios;

import javax.swing.JOptionPane;

/**
 * RECEBER DADOS DE VOTOS , CALCULAR A PORCENTAGEM E APRESENTAR EM TELA
 * 
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio18 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double total_votos, branco, nulo, valido, total_valido, total_nulo, total_branco;

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS DESCOBRIR PORCENTAGEM DE VOTOS DE UMA ELEIÇÃO ! ");
		branco = Double.parseDouble(JOptionPane.showInputDialog(" Informe o numero de votos brancos: "));
		nulo = Double.parseDouble(JOptionPane.showInputDialog(" Informe o numero de votos nulos : "));
		valido = Double.parseDouble(JOptionPane.showInputDialog(" Informe o numero de votos validos : "));

		// atribuindo contas as variaveis
		total_votos = branco + nulo + valido;
		total_branco = (branco / total_votos) * 100;
		total_nulo = (nulo / total_votos) * 100;
		total_valido = (valido / total_votos) * 100;

		// exibindo resultado em tela
		JOptionPane.showInternalMessageDialog(null,
				"OS RESULTADO DAS ELEÇÕES FOI : " + "\n" + "VOTOS COMPUTADOS: " + total_votos + " % dos votos" + "\n"
						+ "BRANCOS: " + total_branco + " % dos votos" + "\n" + "NULOS: " + total_nulo + " % dos votos"
						+ "\n" + "VALIDOS: " + total_valido + " % dos votos");

		// fim
	}

}
