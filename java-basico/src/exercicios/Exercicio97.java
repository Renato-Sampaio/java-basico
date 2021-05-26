package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Faça um programa para ler um vetor de 20 números.
Após isto, deverá ser lido mais um número qualquer e verificar se esse número existe no vetor ou não. Se existir, o
programa deve gerar um novo vetor sem esse número.
(Considere que não haverá números repetidos no vetor).
 * @since 12 de fev. de 2021
 */
public class Exercicio97 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		//Declarando as variáveis e vetores.
		int vetor1[],vetor2[],valor,pos;
		boolean aux = false;
		String msg = "";
		//inicializando vetores.
		vetor1= new int[20];
		vetor2= new int[19];
		pos = - 1 ;
		
		//recebendo do usuário os 20 valores.
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número:"));
		}
		
		//recebendo o valor que usuario deseja retirar da sequência de 20 números originais.
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor que deseja buscar e retirar dos números informados:"));
		
		//Verificando se o número desejado para retirada está entre os 20 números informados anteriormente
		for (int i = 0; i < vetor1.length; i++) {
			if(vetor1[i] == valor) {
				aux = true;
				pos = i;
			}
		}
		
		//se caso o número desejado para retirada esteja entre os 20 números informados anteriormente: atribui um novo vetor para os 19 números restantes
		if (aux) {
			for (int i = 0; i < vetor2.length; i++) {
				if (i >= pos) {
					vetor2[i] = vetor1[i + 1];
				} else {
					vetor2[i] = vetor1[i];
				}
			}
		}
		
		//exibe os dados ao usuário
		if(aux) {
			//se  o número esperado para retirada esteja entre os 20 números informados anteriormente então:exibe os 19 números restantes.
			for (int i = 0; i < vetor2.length; i++) {
				msg += vetor2[i] + "\n ";
			}
			JOptionPane.showMessageDialog(null, "Os 20 números informados sem o número informado para a retirada:\n" + msg);
		} else {
			// se  o número esperado para retirada NÃO esteja entre os 20 números informados anteriormente então:exibe os 20 números originais
			
			for (int i = 0; i < vetor1.length; i++) {
				msg += vetor1[i] + "  ";
			}
			JOptionPane.showMessageDialog(null, "Os 20 números informados inicialmente:\n " + msg);
		}
	}
}