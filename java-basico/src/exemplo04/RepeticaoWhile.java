/**
 * 
 */
package exemplo04;

/**
 * Programa para demonstrae laço de repetição While.
 * @author Renato Sampaio
 *
 */
public class RepeticaoWhile {

	/**
	 * Metodo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int indice;
		// inicializando variavel
		indice=0;
		
		//laço efetuando o laço de repetição para exibir o cubo de um numero.
		while (indice < 10) {//inicio do laço de repetição
			System.out.println(indice + "ao cubo é : "+((indice * indice)*indice));
			indice++;//valor 1
		}//fim do laço de repetição

	}

}
