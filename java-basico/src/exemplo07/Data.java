package exemplo07;

/**
 * Calsse para armazenar os atributos e métodos do objeto DATA.
 * 
 * @author Renato Duarte Sampaio
 *
 *         17 de fev. de 2021
 */
public class Data {
	// declarando os atributos
	private int dia;
	private int mes;
	private int ano;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	// métodos getter e setter para acesso ao atributos.
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

	public String faixaEtaria() {
		if ((2021 - ano ) >= 18) {
			return "Maior de Idade";

		} else {

			return "Menor de Idade";
		}
	}
}