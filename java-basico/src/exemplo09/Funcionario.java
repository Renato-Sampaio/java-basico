/**
 * 
 */
package exemplo09;



/**
 * Classe para demonstrar o ceito de herança de métodos e atributos
 * @author Renato Duarte Sampaio
 * @since 23 de fev. de 2021
 */
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	//Método para acessar os atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Método simples para exibir os atributos.
	public void mostrarDados() {
	
	System.out.println("Nome :" + nome);
	System.out.println("CPF :" + cpf);
	System.out.println("Salário :" + salario);
	}
}//fim da classe
