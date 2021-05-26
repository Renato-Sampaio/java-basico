package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utiliza��o do componente JoptionPane acessando atributos estaticos .
 * 
 * @author Renato Duarte Sampaio
 * @since 23 de fev. de 2021
 */
public class TestaJoptionPane {

	/**
	 * M�todo principal para executar a classe.
	 */
	public static void main(String[] args) {
		
		// Utilizando o JOpntionPane com o construtor para exibi��o de mensagem de erro
		JOptionPane.showMessageDialog(null, Mensagem.erroIncluido, Titulo.cadastroUsuario, 0);//- 0 c�digo de icone de erro.
		// Utilizando o JOpntionPane com o construtor para exibi��o de mensagem de informa��o.
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroCliente, 1);//- 1 c�digo de icone de informa��o.
		// Utilizando o JOpntionPane com o construtor para exibi��o de mensagem de advertencia.
		JOptionPane.showMessageDialog(null, "Conte�do", "titulo", 2);//- 2 c�digo de icone de advertencia..
		// Utilizando o JOpntionPane com o construtor para exibi��o de mensagem de duvida
		JOptionPane.showMessageDialog(null, "Conte�do", "titulo", 3);//- 3 c�digo de icone de interroga��o.
		
	}

}
