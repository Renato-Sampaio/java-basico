/**
 * 
 */
package exemplo03;

/**
 * Programa para demonstrar Incremento e Decremento de valores
 * @author Renato Sampaio
 * @since 10/02/2021
 */
public class Incremento {

	/*
	 * M�todo principal para rodar um programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		
		int numero;
		
		numero=1;
		
		System.out.println(numero);

		numero = numero + 1; // incremento ( mas n�o usamos assim )
		
		System.out.println(numero);
		
		numero++; // incremento correto
		
		System.out.println(numero);
		System.out.println(numero++);
		System.out.println(++numero);
	}

}
