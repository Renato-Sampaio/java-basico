package exercicios;

import javax.swing.JOptionPane;

/**
 * CAIXA ELETRONICO
 * 
 * @author rsampaio
 * @since 08/02/2021
 */
public class CaixaEletronico {

	/**
	 * Metodo principal para rodar a classe
	 */
	public static void main(String[] args) {
		// criando variaveis
		String resultado;
		double saque;
		int saque1, nota50, nota20, nota10, nota5, nota2;

		// dando boas vindas ao usuario
		JOptionPane.showMessageDialog(null, "BEM VINDO AO BANCO FOURSYS");
		// capiturando o valor a ser sacado

		saque = Double.parseDouble(JOptionPane.showInputDialog("================ CAIXA ELETRONICO ================"
				+ "\n" + "                         Notas Dispoviveis : 2, 5, 10, 20, 50." + "\n" + "\n" + ""
				+ "                           Informe o valor que deseja sacar!"));

		// atribuindo valor a variaveis
		nota50 = 0;
		nota20 = 0;
		nota10 = 0;
		nota5 = 0;
		nota2 = 0;

		// verificando condicionais e retornando valor ao usuario
		// informativos de numerais invalidos
		if (saque <= 0) {
			JOptionPane.showMessageDialog(null, "INFORME VALOR VALIDO.");
		} else if (Math.floor(saque) != saque) {
			JOptionPane.showMessageDialog(null,
					"      INFORME VALOR VALIDO" + "\n" + "VALOR NÃO PODE CONTER CENTAVOS.");
		} else if ((saque == 1) || (saque == 3)) {
			JOptionPane.showMessageDialog(null, "INFORME VALOR VALIDO.");
		} else {
			// atribuindo respostas para imprimir ao usuario
			resultado = "O VALOR DO SAQUE É: R$" + saque + "\n";
			saque1 = (int) saque;
			if (saque1 % 2 == 1) {
				saque1 = saque1 - 5;
				nota5 += 1;
			}

			// calculando a quantidade de notas de 50
			if (saque1 >= 50) {
				switch (saque1) {
				case 53:
					saque1 = saque1 - 53;
					nota20 = nota20 + 2;
					nota5 = nota5 + 1;
					nota2 = nota2 + 4;
					break;

				case 51:
					saque1 = saque1 - 51;
					nota20 = nota20 + 2;
					nota5 = nota5 + 1;
					nota2 = nota2 + 3;
					break;

				default:
					while (saque1 >= 50) {
						nota50 = (saque1 / 50);
						saque1 = saque1 - (50 * nota50);
					}
				}
			}
			// calculando a quantidade de notas de 20
			if (saque1 >= 20) {
				switch (saque1) {
				case 23:
					saque1 = saque1 - 23;
					nota20 = nota20 + 2;
					nota5 = nota5 + 1;
					nota2 = nota2 + 4;
					break;

				case 21:
					saque1 = saque1 - 21;
					nota20 = nota20 + 2;
					nota5 = nota5 + 1;
					nota2 = nota2 + 3;
					break;

				default:
					while (saque1 >= 20) {
						nota20 = (saque1 / 20);
						saque1 = saque1 - (20 * nota20);
					}
				}
			}
			// calculando a quantidade de notas de 10
			if (saque1 >= 10) {
				switch (saque1) {
				case 13:
					saque1 = saque1 - 13;
					nota5 = nota5 + 1;
					nota2 = nota2 + 4;
					break;

				case 11:
					saque1 = saque1 - 11;
					nota5 = nota5 + 1;
					nota2 = nota2 + 3;
					break;

				default:
					while (saque1 >= 10) {
						nota10 = (saque1 / 10);
						saque1 = saque1 - (10 * nota10);
					}
				}
			}
			// calculando a quantidade de notas de 5
			if (saque1 >= 5) {
				switch (saque1) {
				case 9:
					saque1 = saque1 - 9;
					nota2 = nota2 + 2;
					break;
				case 8:
					saque1 = saque1 - 8;
					nota2 = nota2 + 4;
					break;
				case 7:
					saque1 = saque1 - 7;
					nota5 = nota5 + 1;
					nota2 = nota2 + 1;
					break;
				default:
					while (saque1 >= 5) {
						nota5 = (saque1 / 5);
						saque1 = saque1 - (5 * nota5);
					}
				}
			}
			// calculando a quantidade de notas de 2
			while (saque1 >= 2) {
				nota2 = (saque1 / 2);
				saque1 = saque1 - (2 * nota2);

			}
			// apresentando o total das notas utilizadas no saque.
			resultado += "========TOTAL DE NOTAS=======: \n";
			if (nota50 != 0) {
				resultado += "Notas de R$50,00: " + nota50 + "\n";
			}
			if (nota20 != 0) {
				resultado += "Notas de R$20,00: " + nota20 + "\n";
			}
			if (nota10 != 0) {
				resultado += "Notas de R$10,00: " + nota10 + "\n";
			}
			if (nota5 != 0) {
				resultado += "Notas de R$5,00: " + nota5 + "\n";
			}
			if (nota2 != 0) {
				resultado += "Notas de R$2,00: " + nota2 + "\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
		}
	}
}
//fim