/**
 * 
 */
package exemplo04;

/**
 * Programa para demonstrae la�o de repeti��o While.
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
		
		//la�o efetuando o la�o de repeti��o para exibir o cubo de um numero.
		while (indice < 10) {//inicio do la�o de repeti��o
			System.out.println(indice + "ao cubo � : "+((indice * indice)*indice));
			indice++;//valor 1
		}//fim do la�o de repeti��o

	}

}
