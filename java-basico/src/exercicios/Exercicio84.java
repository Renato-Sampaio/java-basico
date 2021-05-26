package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * A prefeitura de uma cidade deseja fazer uma pesquisa
entre seus habitantes. Fa�a um programa para coletar dados sobre o sal�rio e n�mero de filhos de cada habitante e
ap�s as leituras, escrever:
a) M�dia de sal�rio da popula��o
b) M�dia do n�mero de filhos
c) Maior sal�rio dos habitantes
d) Percentual de pessoas com sal�rio menor que R$
150,00
Obs.: O final das leituras dos dados se dar� com a entrada de um �sal�rio negativo�
 * @since 11 de fev. de 2021
 */
public class Exercicio84 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		int hab, filhos, media_filhos;
		double salario, maior, media_salario, percentual;
		//atribuindo valor as variaveis
		media_filhos = 0;
		maior = 0;
		media_salario = 0;
		percentual = 0;

		// recebendo informa��es do usu�rio
		hab = Integer.parseInt(JOptionPane.showInputDialog("Informe o n� de habitantes de nossa cidade"));

		// inicializando a vari�vel, condicionando e incrementando
		for (int i = 1; i <= hab; i++) {
			filhos = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos possui este mun�cipe.  " + i));
			do {
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio deste mun�cipe. " + i));

			} while (salario < 0);
			
			media_filhos += filhos;//guardando info para calcular a media dos filhos.
			media_salario += salario;//guardando info para calcular a media dos salarios.

			if (salario > maior) {
				maior = salario;//guardando info do maior salario.

			}
			
			if (salario < 150) {//percetual de salario menor que 150 R$.
				percentual++;
			}
		}
		// mostra o resultado em tela para o usuario.
		JOptionPane.showMessageDialog(null,"M�dia de sal�rio da popula��o em nossa cidade: R$ " + (media_salario / hab) + "\n"+
						"M�dia do n�mero de filhos em nossa cidade: "+ (media_filhos / hab)+ "." + "\n" +
						"Maior sal�rio da cidade: " + maior +"."+"\n"+
						"Percentual de pessoas com sal�rio menor que R$ 150,00 em nossa cidade: " + ((percentual * 100) / hab) + "%");
	}
}