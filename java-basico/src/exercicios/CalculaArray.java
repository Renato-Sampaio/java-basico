package exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * Classe principal para opera��o do sistema Calcula Array.
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
				JOptionPane.showMessageDialog(null, "O sistema s� permite n�meros maiores que Zero", Rotulo.numero, 0);
				execute = true;

			}

		}
	}

	public void menuPrincipal() { // M�todo construtor do Menu de Op��es.

		// criando mensagem para apresenta��o do MENU ao usu�rio.
		String menu = "============ M E N U ============ \n\n" + "\n1 - MAIOR ELEMENTO" + "\n2 - MENOR ELEMENTO"
				+ "\n3 - ORDENAR LISTA CRESCENTE" + "\n4 - ORDENAR LISTA DECRESCENTE" + "\n5 - M�DIA DOS ELEMENTOS"
				+ "\n6 - SOMA DO MAIOR E MENOR ELEMENTO" + "\n7 - SOMA DOS ELEMENTOS IGUAS"
				+ "\n8 - MEDIA DOS ELEMENTOS IGUAIS" + "\n9 - SAIR DO SISTEMA" + "\n\n INFORME A OP��O DESEJADA";

		while (true) { // enquanto
			try { // op��o escolhida pelo usuario for valida , deixar programa rodando.
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu)); // apresenta em tela as op��es e pega a
																					// op��o desejada
				processamentoPrincipal(opcao); // com a op��o desejada dentro do processamento principal para rodar o
												// menu
												// M�todo incluso no menu
			} catch (Exception e) {
				// Mensagem de erro: se escolher op��o invalida.
				JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida, Rotulo.menu, 0);
			}
		}
	}

	// M�todo para controlar o processamento do programa
	public void processamentoPrincipal(int opcao) {
		switch (opcao) {
		case 1: { // op��o 1 do menu
			maiorElemento(); // chama o M�todo de cadastro de Mat�ria para funcionalidade.
			break;// para o processamento
		} // fim da op��o 1

		case 2: {// op��o 2 do menu
			menorElemento();// chama o M�todo de cadastro de Professor para funcionalidade.
			break;// para o processamento
		} // fim da op��o 2

		case 3: {// op��o 3 do menu
			ordenarCrescente(); // chama o M�todo de cadastro de Aluno para funcionalidade.
			break;// para o processamento
		} // fim da op��o 3

		case 4: {// op��o 4 do menu
			ordenarDecrescente();// chama o M�todo de cadastro de Turma para funcionalidade.
			break;// para o processamento
		} // fim da op��o 4

		case 5: {// op��o 5 do menu
			mediaDosElementos();// chama o M�todo de Listar Alunos para funcionalidade.
			break;// para o processamento
		} // fim da op��o 5

		case 6: {// op��o 6 do menu
			somaMaiorMenor();// chama o M�todo de Listar Professores para funcionalidade.
			break;// para o processamento
		} // fim da op��o 6

		case 7: {// op��o 7 do menu
			somaIguais();// chama o M�todo de Listar Turmas para funcionalidade.
			break;// para o processamento
		} // fim da op��o 7

		case 8: {// op��o 8 do menu
			mediaIguais();// chama o M�todo de Consultar Turma para funcionalidade.
			break;// para o processamento
		} // fim da op��o 8

		case 9: {// op��o 9 do menu
			sair();// chama o M�todo de Sair do programa para funcionalidade.
			break;// para o processamento
		} // fim da op��o 9

		default: // se op��o n�o existir apresentar mensagem de ERRO.
			JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida, Rotulo.menu, 0);// mensagem de erro
			break;// para o processamento
		}// fim do swit
	} // fim do M�todo

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
		String msg = "M�dia Dos Numeros! \n\n";
		double somaElementos = 0;
		for (Integer num : numeros) {
		somaElementos += num;// soma com dos numeros
		}
		JOptionPane.showMessageDialog(null,msg +( somaElementos / 10),Rotulo.mediaElementos,1);//calculo de media e apresenta��o em tela.
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
					msg += "O n�mero repetido �: " + numeros.get(i) + "  \n";
					msg += "Com um total de : " + quantidade + " repeti��es  \n";
					msg += "E a sua soma � de: " + (numeros.get(i) * quantidade) + "   \n\n";
					i += (quantidade - 1);
				}
			}
			if (existe) {
				// resultado em tela
				JOptionPane.showMessageDialog(null, msg, Rotulo.somaIguais, 1);
			} else {
				JOptionPane.showMessageDialog(null, "N�o existem elementos repetidos", "OP��O 7: SOMA DOS ELEMENTOS IGUAIS",
						1);
			}
		}
	public void mediaIguais() {
		// C�lculo para obter a m�dia total dos elementos iguais
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
					JOptionPane.showMessageDialog(null, "A m�dia dos elementos repetidos �: " + resultado, Rotulo.mediaIguais, 1);
					} else {
						JOptionPane.showMessageDialog(null, "N�o existem elementos repetidos", "OP��O 8: M�DIA DOS ELEMENTOS IGUAIS", 1);
					} 
	}

	public void sair() {
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Aten��o", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		} // fim do if.
	}// fim do m�todo

	public static void main(String[] args) {
		new CalculaArray();
	}

}
