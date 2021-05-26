/**
 * 
 */
package exemplo07;

/**
 * Classe para armazenar os atributos e Métodos do objeto Pessoa.
 * @author Renato Duarte Sampaio
 *
 * 17 de fev. de 2021
 */
public class Pessoa {

	// atributos ou caracteristicas do objeto
	private String nome;
	private Data dataNascimento;
	private double salario;


	
// método para acessar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// método para testar se o salário é acima ou abaixo do salário minimo
	public String salarioMinimo() {
		if(salario >= 1163.55) {
			return "Acima do salário mínimo";
		} else {
			return "Abaixo do salário mínimo";
		}
	}

}
