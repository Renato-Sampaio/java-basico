/**
 * 
 */
package exemplo09;

/**
 * Classe para armazenar os atributos de professor herdando os dados funcionario (heran�a)
 * @author Renato Duarte Sampaio
 *
 * 23 de fev. de 2021
 */
public class Professor extends Funcionario implements InterfaceFuncionario {

	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	//m�todo para exibir os dados.
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Mat�ria: "+ materia);
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		
	}
	
}
