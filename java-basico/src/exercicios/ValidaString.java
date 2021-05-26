/**
 * 
 */
package exercicios;

/**
 * Classe Responsavel por validar os dados inputados pelo usuario.
 * @author Renato Duarte Sampaio
 * @since 26 de fev. de 2021
 */
public class ValidaString {

	public static boolean isEmptyOrNull(String nome) {
		return (nome == " ");
	}

	// verifica se a string não tem números
	// caso tenha numero metodo retorna false
	public static boolean isOnlyText(String text) {
		return text.matches("[^\\d]+");
	}//fim do método
}//fim da classe.
