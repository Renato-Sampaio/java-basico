/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * Salrio + Comissão de vendas
 * @author  Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio45 {

	/**
	 * Metodo princiapal para rodar a classe
	 */
	public static void main(String[] args) {
		// Criando variaveis
		double salario_fixo, vendas, salario_final;
		// apresentando o programa e capturando dados do usuario
		JOptionPane.showInternalMessageDialog(null, "Calculo de salario + Comissão de vendas");
		salario_fixo = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario fixo: "));
		vendas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total das suas vendas: "));

		// verificando condicionais
		// com base nas horas trabalhadas calcula o salario
		if (vendas <= 1500) {
			salario_final = (salario_fixo + (vendas * 0.03));
			JOptionPane.showMessageDialog(null, "O Salario Final do Vendedor será R$ " + salario_final);
		} else if (vendas > 1500) {
			salario_final = (salario_fixo + (1500 * 0.03) + ((vendas - 1500) * 0.05));
			JOptionPane.showMessageDialog(null, "O Salario Final do Vendedor será R$ " + salario_final);
		}
	}
}
//fim