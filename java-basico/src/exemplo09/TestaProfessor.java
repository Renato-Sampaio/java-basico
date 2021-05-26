/**
 * 
 */
package exemplo09;

import javax.swing.JOptionPane;

/**
 * Classe Responsavel por istanciar um objeto Professor e exibir seus dados
 * @author Renato Duarte Sampaio
 * @since 23 de fev. de 2021
 */
public class TestaProfessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// criando um objeto professor e instanciando.
		
		Professor jose= new Professor();
		jose.setCpf(JOptionPane.showInputDialog("Digite o Cpf"));
		jose.setNome(JOptionPane.showInputDialog("Digite o Nome"));
		jose.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario")));

		jose.mostrarDados();
	
	}

	
}
