package exemplo04;

/**
 * Programa para demonstrar a utilização do comando Do While
 * @author Renato Sampaio
 *
 */
public class RepeticaoDoWhile {

	/*
	 *  Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variavel
		int i;
		
		//iniciando a variavel
		i=10;
		
		do {
			System.out.println(i + " ao cubo é:" + ((i * i)*i));
			i++;
		}while ( i < 10);

	}

}
