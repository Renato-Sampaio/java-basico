package exemplo10;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização de exceções em Java.
 * @author Renato Duarte Sampaio
 * @since 23 de fev. de 2021
 */
public class TestaUsuario {

	public void receberDados() {
		
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome)))  {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio,"Cadastro de Usuario", 0);
			// pode gravar
		} else {
			//exibe mensagem de erro.
			JOptionPane.showMessageDialog(null, "nome válido","Cadastro de Usuario", 1);
		}
		if (Valida.isStringValida(JOptionPane.showInputDialog(Mensagem.informeNome)))  {
			JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido,"Cadastro de Usuario", 0);
			// pode gravar
		} else {
			//exibe mensagem de erro.
			JOptionPane.showMessageDialog(null, "nome válido","Cadastro de Usuario", 1);
		}
		
		if(Valida.isNumber(JOptionPane.showInputDialog(Mensagem.informeIdade))) {
			JOptionPane.showMessageDialog(null, "Idade Valida","Cadastro de Usuario", 1);
		}else {
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalida,"Cadastro de Usuario", 0);
		}
		
	}//fim do método
	
	public static void main(String[] args) {
		new TestaUsuario().receberDados();
	}
	
}
