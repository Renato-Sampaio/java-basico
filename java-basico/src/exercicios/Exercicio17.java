package exercicios;
import javax.swing.JOptionPane;
/**
 * coletar dados de idade do usuario, anos, meses e dias e fornecer um total de dias para o usuario.
 * 
 * @author Renato Sampaio
 * @since 05/02/2021
 */
public class Exercicio17 {

	/*
	 * Método principal para execução do programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		int ano,mes,dia,totalano,totalmes,totalidade,idade;
		

		// recebendo valores do usuario
		JOptionPane.showInternalMessageDialog(null, " VAMOS DESCOBRIR SUA IDADE E TE INFORMAR ELA EM DIAS ! ");
		ano = Integer.parseInt(JOptionPane.showInputDialog(" Informe o ano que nasceu: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog(" Informe o mes que nasceu: "));
		dia = Integer.parseInt(JOptionPane.showInputDialog(" Informe o dia que nasceu: "));
		
		// efetuando calculo
		
		idade = 2021 - ano;
		totalano = idade * 365 + dia;
		totalmes = mes * 30;
		totalidade = totalano + totalmes;
		
		// exibindo resultado em tela
		JOptionPane.showInternalMessageDialog(null, "O resultado da sua idade em dias é : " + totalidade);

		//fim
	}

}