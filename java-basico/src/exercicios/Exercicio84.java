package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio
 * A prefeitura de uma cidade deseja fazer uma pesquisa
entre seus habitantes. Faça um programa para coletar dados sobre o salário e número de filhos de cada habitante e
após as leituras, escrever:
a) Média de salário da população
b) Média do número de filhos
c) Maior salário dos habitantes
d) Percentual de pessoas com salário menor que R$
150,00
Obs.: O final das leituras dos dados se dará com a entrada de um “salário negativo”
 * @since 11 de fev. de 2021
 */
public class Exercicio84 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variáveis
		int hab, filhos, media_filhos;
		double salario, maior, media_salario, percentual;
		//atribuindo valor as variaveis
		media_filhos = 0;
		maior = 0;
		media_salario = 0;
		percentual = 0;

		// recebendo informações do usuário
		hab = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº de habitantes de nossa cidade"));

		// inicializando a variável, condicionando e incrementando
		for (int i = 1; i <= hab; i++) {
			filhos = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos possui este munícipe.  " + i));
			do {
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário deste munícipe. " + i));

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
		JOptionPane.showMessageDialog(null,"Média de salário da população em nossa cidade: R$ " + (media_salario / hab) + "\n"+
						"Média do número de filhos em nossa cidade: "+ (media_filhos / hab)+ "." + "\n" +
						"Maior salário da cidade: " + maior +"."+"\n"+
						"Percentual de pessoas com salário menor que R$ 150,00 em nossa cidade: " + ((percentual * 100) / hab) + "%");
	}
}