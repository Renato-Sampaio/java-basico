package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * Fa�a um programa para ler um vetor de 20 n�meros.
Ap�s isto, dever� ser lido mais um n�mero qualquer e verificar se esse n�mero existe no vetor ou n�o. Se existir, o
programa deve gerar um novo vetor sem esse n�mero.
(Considere que n�o haver� n�meros repetidos no vetor).
 * @since 12 de fev. de 2021
 */
public class Exercicio97 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		
		//Declarando as vari�veis e vetores.
		int vetor1[],vetor2[],valor,pos;
		boolean aux = false;
		String msg = "";
		//inicializando vetores.
		vetor1= new int[20];
		vetor2= new int[19];
		pos = - 1 ;
		
		//recebendo do usu�rio os 20 valores.
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero:"));
		}
		
		//recebendo o valor que usuario deseja retirar da sequ�ncia de 20 n�meros originais.
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor que deseja buscar e retirar dos n�meros informados:"));
		
		//Verificando se o n�mero desejado para retirada est� entre os 20 n�meros informados anteriormente
		for (int i = 0; i < vetor1.length; i++) {
			if(vetor1[i] == valor) {
				aux = true;
				pos = i;
			}
		}
		
		//se caso o n�mero desejado para retirada esteja entre os 20 n�meros informados anteriormente: atribui um novo vetor para os 19 n�meros restantes
		if (aux) {
			for (int i = 0; i < vetor2.length; i++) {
				if (i >= pos) {
					vetor2[i] = vetor1[i + 1];
				} else {
					vetor2[i] = vetor1[i];
				}
			}
		}
		
		//exibe os dados ao usu�rio
		if(aux) {
			//se  o n�mero esperado para retirada esteja entre os 20 n�meros informados anteriormente ent�o:exibe os 19 n�meros restantes.
			for (int i = 0; i < vetor2.length; i++) {
				msg += vetor2[i] + "\n ";
			}
			JOptionPane.showMessageDialog(null, "Os 20 n�meros informados sem o n�mero informado para a retirada:\n" + msg);
		} else {
			// se  o n�mero esperado para retirada N�O esteja entre os 20 n�meros informados anteriormente ent�o:exibe os 20 n�meros originais
			
			for (int i = 0; i < vetor1.length; i++) {
				msg += vetor1[i] + "  ";
			}
			JOptionPane.showMessageDialog(null, "Os 20 n�meros informados inicialmente:\n " + msg);
		}
	}
}