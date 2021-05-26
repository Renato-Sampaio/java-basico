package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização do componente JoptionPane acessando atributos estaticos .
 * 
 * @author Renato Duarte Sampaio
 * @since 23 de fev. de 2021
 */
public class TestaJoptionPane {

	/**
	 * Método principal para executar a classe.
	 */
	public static void main(String[] args) {
		
		// Utilizando o JOpntionPane com o construtor para exibição de mensagem de erro
		JOptionPane.showMessageDialog(null, Mensagem.erroIncluido, Titulo.cadastroUsuario, 0);//- 0 código de icone de erro.
		// Utilizando o JOpntionPane com o construtor para exibição de mensagem de informação.
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroCliente, 1);//- 1 código de icone de informação.
		// Utilizando o JOpntionPane com o construtor para exibição de mensagem de advertencia.
		JOptionPane.showMessageDialog(null, "Conteúdo", "titulo", 2);//- 2 código de icone de advertencia..
		// Utilizando o JOpntionPane com o construtor para exibição de mensagem de duvida
		JOptionPane.showMessageDialog(null, "Conteúdo", "titulo", 3);//- 3 código de icone de interrogação.
		
	}

}
