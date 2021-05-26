package exemplo04;

/**
 * Programa para explicação do FOR
 * @author Renato Sampaio
 * @since 10/02/2021
 */
public class RepiticaoFor {

	/*
	 * Metodo principal para executar a classe
	 */
	// declarando variaveis
			//inicialização da variavel
	public static void main(String[] args) {//inicio do laço for
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "ao cubo é: "+ ((i*i)*i));
		} //fim do laço for 
	

	}

}
