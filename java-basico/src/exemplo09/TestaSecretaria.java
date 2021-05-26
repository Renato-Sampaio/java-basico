package exemplo09;

/**
 * @author Renato Duarte Sampaio
 *
 * 23 de fev. de 2021
 */
public class TestaSecretaria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instanciano o objeto do tipo Secretaria.
		Secretaria maria = new Secretaria();
		maria.setNome("MARIA");
		maria.setCpf("1212113213131");
		maria.setSalario(950.00);
		maria.setRamal(123);
		
		maria.mostrarDados();
	}

}
