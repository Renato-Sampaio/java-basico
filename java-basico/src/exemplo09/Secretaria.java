/**
 * 
 */
package exemplo09;

/**
 * @author Renato Duarte Sampaio
 *
 * 23 de fev. de 2021
 */
public class Secretaria extends Funcionario{
	//atributos de secretaria.
	private int ramal;
	//métod para acessar o atributo.
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	
	//metodo para mostrar dados.
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Ramal:" + ramal);
	}

}
