package exemplo04;

/**
 * Programa para explica��o do FOR
 * @author Renato Sampaio
 * @since 10/02/2021
 */
public class RepiticaoFor {

	/*
	 * Metodo principal para executar a classe
	 */
	// declarando variaveis
			//inicializa��o da variavel
	public static void main(String[] args) {//inicio do la�o for
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "ao cubo �: "+ ((i*i)*i));
		} //fim do la�o for 
	

	}

}
