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

	// verifica se a string n�o tem n�meros
	// caso tenha numero metodo retorna false
	public static boolean isOnlyText(String text) {
		return text.matches("[^\\d]+");
	}//fim do m�todo
}//fim da classe.
