 package exemplo05;

/**
 * @author Renato Duarte Sampaio
 * Explica��o de Vetor inteiro
 * 11 de fev. de 2021
 */
public class VetorInteiro {

	/**
	 * M�todo principal para rodar a classe
	 */
	public static void main(String[] args) {
		//declarando o vetor

		int vetor[];
		
		//iniciar vetor e informar posi��es.
		vetor = new int [3];
		// adicionando valor 10 na 1� posi��o do vetor
		vetor[0] = 10;
		// adicionando o valor 5 na 2� posi��o do vetor
		vetor[1] = 5;
		//adicionando o valor 25 na 3� posi��o do vetor
		vetor[2] = 25;
		
		//exibindo o valor da primeira posi��o do vetor.
		
		System.out.println(vetor[0]);
		
		//exibindo o valor da segunda posi��o do vetor.
		
		System.out.println(vetor[1]);
		
		//exibindo o valor da terceira posi��o do vetor.
				
		System.out.println(vetor[2]);
	}

}
