 package exemplo05;

/**
 * @author Renato Duarte Sampaio
 * Explicação de Vetor inteiro
 * 11 de fev. de 2021
 */
public class VetorInteiro {

	/**
	 * Método principal para rodar a classe
	 */
	public static void main(String[] args) {
		//declarando o vetor

		int vetor[];
		
		//iniciar vetor e informar posições.
		vetor = new int [3];
		// adicionando valor 10 na 1ª posição do vetor
		vetor[0] = 10;
		// adicionando o valor 5 na 2ª posição do vetor
		vetor[1] = 5;
		//adicionando o valor 25 na 3ª posição do vetor
		vetor[2] = 25;
		
		//exibindo o valor da primeira posição do vetor.
		
		System.out.println(vetor[0]);
		
		//exibindo o valor da segunda posição do vetor.
		
		System.out.println(vetor[1]);
		
		//exibindo o valor da terceira posição do vetor.
				
		System.out.println(vetor[2]);
	}

}
