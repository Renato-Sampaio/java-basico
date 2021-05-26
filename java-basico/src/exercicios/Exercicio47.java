package exercicios;

import javax.swing.JOptionPane;

/**
 * ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima
em estoque de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima +
quantidade mínima)/2). Se a quantidade em estoque for
maior ou igual a quantidade média escrever a mensagem
'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra'.
 * @author  Renato Sampaio
 * @since 09/02/2021
 */
public class Exercicio47 {

	/**
	 * Método principal pra rodar a classe
	 */
	public static void main(String[] args) {
		//criando variaveis
		double max,atual,min,media;
		JOptionPane.showInternalMessageDialog(null,"VAMOS CALCULAR A MEDIA DO SEU ESTOQUE E VERIFICAR SE É NECESSARIO EFETUAR A COMPRA.");
		max= Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade maxima para o estoque deste produto"));
		min= Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade minima para o estoque deste produto"));
		atual= Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade atual no estoque deste produto"));
		//calculando saldo atual
		media= max + min / 2;
		//verificando condicional e apresentando em tela.
		if(atual >= media) {
			JOptionPane.showInternalMessageDialog(null,"NÃO EFETUAR COMPRA DESTE PRODUTO.");
		} else {
			JOptionPane.showInternalMessageDialog(null,"EFETUAR COMPRA DESTE PRODUTO.");
		}
	}
}
//fim

