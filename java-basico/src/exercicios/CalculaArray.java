package exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * Classe principal para operação do sistema Calcula Array.
 * @author Renato Duarte Sampaio
 * @since 25 de fev. de 2021
 */
public class CalculaArray {

	/**
	 * Metodo principal para rodar a classe
	 */

	public ArrayList<Integer> numeros;

	public CalculaArray() {
		numeros = new ArrayList<Integer>();
		int contador = 1;
		int numero = 0;
		boolean execute = true ;
		while (execute) {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog(null, Mensagem.informeNumero, Rotulo.numero, 1));
				if ( Valida.isIntPositivo(numero) || (Valida.isEmptyOrNull(numero))) {
					JOptionPane.showMessageDialog(null, Mensagem.numeroCadastrado, Rotulo.numero, 1);
					numeros.add(numero);
					execute = true;
					contador++;
				
				} else {
					JOptionPane.showMessageDialog(null, "Informe um numero maior que 0", Rotulo.numero, 0);
					execute = true;
				}

				if (contador > 10) {

					menuPrincipal(); 
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "O sistema só permite números maiores que Zero", Rotulo.numero, 0);
				execute = true;

			}

		}
	}

	public void menuPrincipal() { // Método construtor do Menu de Opções.

		// criando mensagem para apresentação do MENU ao usuário.
		String menu = "============ M E N U ============ \n\n" + "\n1 - MAIOR ELEMENTO" + "\n2 - MENOR ELEMENTO"
				+ "\n3 - ORDENAR LISTA CRESCENTE" + "\n4 - ORDENAR LISTA DECRESCENTE" + "\n5 - MÉDIA DOS ELEMENTOS"
				+ "\n6 - SOMA DO MAIOR E MENOR ELEMENTO" + "\n7 - SOMA DOS ELEMENTOS IGUAS"
				+ "\n8 - MEDIA DOS ELEMENTOS IGUAIS" + "\n9 - SAIR DO SISTEMA" + "\n\n INFORME A OPÇÃO DESEJADA";

		while (true) { // enquanto
			try { // opção escolhida pelo usuario for valida , deixar programa rodando.
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu)); // apresenta em tela as opções e pega a
																					// opção desejada
				processamentoPrincipal(opcao); // com a opção desejada dentro do processamento principal para rodar o
												// menu
												// Método incluso no menu
			} catch (Exception e) {
				// Mensagem de erro: se escolher opção invalida.
				JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida, Rotulo.menu, 0);
			}
		}
	}

	// Método para controlar o processamento do programa
	public void processamentoPrincipal(int opcao) {
		switch (opcao) {
		case 1: { // opção 1 do menu
			maiorElemento(); // chama o Método de cadastro de Matéria para funcionalidade.
			break;// para o processamento
		} // fim da opção 1

		case 2: {// opção 2 do menu
			menorElemento();// chama o Método de cadastro de Professor para funcionalidade.
			break;// para o processamento
		} // fim da opção 2

		case 3: {// opção 3 do menu
			ordenarCrescente(); // chama o Método de cadastro de Aluno para funcionalidade.
			break;// para o processamento
		} // fim da opção 3

		case 4: {// opção 4 do menu
			ordenarDecrescente();// chama o Método de cadastro de Turma para funcionalidade.
			break;// para o processamento
		} // fim da opção 4

		case 5: {// opção 5 do menu
			mediaDosElementos();// chama o Método de Listar Alunos para funcionalidade.
			break;// para o processamento
		} // fim da opção 5

		case 6: {// opção 6 do menu
			somaMaiorMenor();// chama o Método de Listar Professores para funcionalidade.
			break;// para o processamento
		} // fim da opção 6

		case 7: {// opção 7 do menu
			somaIguais();// chama o Método de Listar Turmas para funcionalidade.
			break;// para o processamento
		} // fim da opção 7

		case 8: {// opção 8 do menu
			mediaIguais();// chama o Método de Consultar Turma para funcionalidade.
			break;// para o processamento
		} // fim da opção 8

		case 9: {// opção 9 do menu
			sair();// chama o Método de Sair do programa para funcionalidade.
			break;// para o processamento
		} // fim da opção 9

		default: // se opção não existir apresentar mensagem de ERRO.
			JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida, Rotulo.menu, 0);// mensagem de erro
			break;// para o processamento
		}// fim do swit
	} // fim do Método

	public void maiorElemento() {
		String msg ="Numeros! \n\n";
		int maior = Collections.max(numeros);// ordena a lista de forma decrescente
		
		msg +=  " | " + maior +" | ";
		JOptionPane.showMessageDialog(null, msg, Rotulo.maiorElemento,1);
	}

	public void menorElemento() {
		String msg ="Numeros! \n\n";
		int menor =Collections.min(numeros);// ordena a lista de forma decrescente
		msg += " | " + menor +" | ";
		
		JOptionPane.showMessageDialog(null, msg, Rotulo.menorElemento,1);
	}

	public void ordenarCrescente() {
		String msg ="Numeros! \n\n";
	
		Collections.sort(numeros);// ordena a lista de forma crescente
		for (Integer num : numeros) {
		msg += " | " + num +" | ";
		}
		JOptionPane.showMessageDialog(null, msg, Rotulo.listaCrescente,1);
	}

	public void ordenarDecrescente() {
		String msg ="Numeros! \n\n";
		
		Collections.reverse(numeros);// ordena a lista de forma crescente
		for (Integer num : numeros) {
		msg += " | " + num +" | ";
		}
		JOptionPane.showMessageDialog(null, msg, Rotulo.listaDerescente,1);
	}

	

	public void mediaDosElementos() {
		String msg = "Média Dos Numeros! \n\n";
		double somaElementos = 0;
		for (Integer num : numeros) {
		somaElementos += num;// soma com dos numeros
		}
		JOptionPane.showMessageDialog(null,msg +( somaElementos / 10),Rotulo.mediaElementos,1);//calculo de media e apresentação em tela.
		}
	


	public void somaMaiorMenor() {
		String msg ="Soma do MAIOR e MENOR ! \n\n";
		Collections.sort(numeros);
		msg += numeros.get(numeros.size() - 1) + numeros.get(0);//somando o maior com o menor
		// resultado em tela
		JOptionPane.showMessageDialog(null, msg, Rotulo.somaMaiorMenor,1);
		
	}

	public void somaIguais() {
			String msg = "";
			boolean existe = false;

			for (int i = 0; i < numeros.size(); i++) {
				int quantidade = Collections.frequency(numeros, numeros.get(i));
				if (quantidade > 1) {
					existe = true;
					msg += "O número repetido é: " + numeros.get(i) + "  \n";
					msg += "Com um total de : " + quantidade + " repetições  \n";
					msg += "E a sua soma é de: " + (numeros.get(i) * quantidade) + "   \n\n";
					i += (quantidade - 1);
				}
			}
			if (existe) {
				// resultado em tela
				JOptionPane.showMessageDialog(null, msg, Rotulo.somaIguais, 1);
			} else {
				JOptionPane.showMessageDialog(null, "Não existem elementos repetidos", "OPÇÃO 7: SOMA DOS ELEMENTOS IGUAIS",
						1);
			}
		}
	public void mediaIguais() {
		// Cálculo para obter a média total dos elementos iguais
					boolean existe = false;
					double soma = 0;
					int contador = 0;
					double resultado = 0;
					for (Integer num : numeros) {
						if (Collections.frequency(numeros, num) >= 2) {
							contador++;
							soma += num;
							resultado = soma / contador;
							existe = true;
						}
					}
					if(existe) {
					// resultado em tela
					JOptionPane.showMessageDialog(null, "A média dos elementos repetidos é: " + resultado, Rotulo.mediaIguais, 1);
					} else {
						JOptionPane.showMessageDialog(null, "Não existem elementos repetidos", "OPÇÃO 8: MÉDIA DOS ELEMENTOS IGUAIS", 1);
					} 
	}

	public void sair() {
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Atenção", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		} // fim do if.
	}// fim do método

	public static void main(String[] args) {
		new CalculaArray();
	}

}
