package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Renato Duarte Sampaio 
 * Escrever o menor entre 20 numeros e apresenta a sua posição
 * @since 11 de fev. de 2021
 */
public class Exercicio91 {
	/**
	 * Método principal para executar a classe.
	 */
	
	public static void main(String[] args) {
		// decalando variavel vetor.
		double numeros[], aux, menor, pos;
		// inicializando o vetor e definindo o seu tamanho.
		numeros = new double[20];
		menor = 0;
		aux = 0;
		pos = 0;
		// recebendo os valores do usuario com auxilio do for.
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Double.parseDouble(JOptionPane
					.showInputDialog("Informe o " + (i + 1) + "º numero ,( apenas positivos ) uma de cada vez; "));
			aux = numeros[i];
			
			if (numeros[i] < 0) {
				Double.parseDouble(JOptionPane.showInputDialog("Informe  apenas positivos ! "));
				menor = aux;
				pos=i;
			}
		}
			if (aux < 100000000) {
				JOptionPane.showInternalMessageDialog(null,
						"O menor ente eles é : " + menor + "esta na posição : " + pos);
			}
		}
	}
