/**
 * 
 */
package exemplo10;



/**
 * Classe responsavel por armazenar os metodos de validações de dados.
 * @author Renato Duarte Sampaio
 * @since 23 de fev. de 2021
 */
public class Valida {

	//método para verificar String vazia .
	
	public static boolean isStringVazio(String args) {
		// COMANDO TRIM = tira os espaços da variavel String.
		if (args.trim().equals("")) {
		return true;	
		}else {
			return false;
		}
	}//fim do método.
	
	//método para verificar String válida.
	public static boolean isStringValida(String args) {
		if (!args.matches("[0-9]*")) {// * = aceita maiusculos, minusculo, acentos e cedilhas( menos numero )
		return false;
		
		}else {
			return true;
	  	}
	}//fim do método
	
	
	static //método para verificar se é numero
	int numero;
	public static boolean isNumber(String args) {
	try {
		 numero = Integer.parseInt( args );
		return true;
	} catch ( Exception e) {
		return false;
	}
	
	}

	public static boolean isIntPositivo(int numero2) {
		// TODO Auto-generated method stub
		return false;
	}
}
