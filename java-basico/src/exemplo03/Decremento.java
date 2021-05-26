/**
 * 
 */
package exemplo03;

/**
 * Progama para demonstrar o decremento de valores.
 * @author Renato Sampaio
 * @Since 08/02/2021
 */
public class Decremento {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		
		int numero;
		
		numero = 1;
		
		System.out.println(numero);//exibindo valor 1
		numero= numero - 1;
		System.out.println(numero);//exibindo valor 0
		
		//inicializando a variavel
		numero =10;
		
		numero--;
		System.out.println(numero);//exibindo valor 9
		
		numero--;// valor 8
		numero--;// valor 7
		
		System.out.println(numero);//exibindo valor 7
		
	}

}
