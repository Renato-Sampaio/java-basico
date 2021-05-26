package exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * Classe principal para operação do sistema Array List String.
 * @author Renato Duarte Sampaio
 * @since 26 de fev. de 2021
 */
public class ArrayListDeString {

	/**
	 * Metodo principal para rodar a classe
	 */
	private ArrayList<String> nomes;
	

	public ArrayListDeString() {
		nomes = new ArrayList<String>();
		
		menuPrincipal();
	}

	public void menuPrincipal() {
		// criando mensagem para apresentação do MENU ao usuário.
		String menu = "============ M E N U ============ \n\n" + "\n1 - CADASTRAR NOME" + "\n2 - EXCLUIR NOME"
				+ "\n3 - LISTAR NOMES CADASTRADOS" + "\n4 - LISTAR NOMES EM ORDEM ALFABETICA"
				+ "\n5 - LISTAR NOME IGUAIS" + "\n6 - LISTAR NOMES POR LETRA INICIAL" + "\n7 - PESQUISAR NOME"
				+ "\n8 - SAIR DO SISTEMA" + "\n\n INFORME A OPÇÃO DESEJADA";

		while (true) { // enquanto
			try { // opção escolhida pelo usuario for valida , deixar programa rodando.
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu)); // apresenta em tela as opções e pega a opção desejada
				processamentoPrincipal(opcao); // com a opção desejada dentro do processamento principal para rodar o menu Método incluso no menu
			} catch (Exception e) {
				// Mensagem de erro: se escolher opção invalida.
				JOptionPane.showMessageDialog(null, MensagemString.opcaoInvalida, RotuloString.menu, 0);
			}
		}
	}

// Método para controlar o processamento do programa
	public void processamentoPrincipal(int opcao) {
		switch (opcao) {
		case 1: { // opção 1 do menu
			cadastrarNome(); // chama o Método de cadastro de Matéria para funcionalidade.
			break;// para o processamento
		} // fim da opção 1

		case 2: {// opção 2 do menu
			excluirNome();// chama o Método de cadastro de Professor para funcionalidade.
			break;// para o processamento
		} // fim da opção 2

		case 3: {// opção 3 do menu
			listarNomesCadastrados(); // chama o Método de cadastro de Aluno para funcionalidade.
			break;// para o processamento
		} // fim da opção 3

		case 4: {// opção 4 do menu
			listarNomesEmOrdemAlfabetica();// chama o Método de cadastro de Turma para funcionalidade.
			break;// para o processamento
		} // fim da opção 4

		case 5: {// opção 5 do menu
			listarNomesIguais();// chama o Método de Listar Alunos para funcionalidade.
			break;// para o processamento
		} // fim da opção 5

		case 6: {// opção 6 do menu
			listarNomesPorLetraInicial();// chama o Método de Listar Professores para funcionalidade.
			break;// para o processamento
		} // fim da opção 6

		case 7: {// opção 7 do menu
			pesquisarNome();// chama o Método de Listar Turmas para funcionalidade.
			break;// para o processamento
		} // fim da opção 7

		case 8: {// opção 8 do menu
			sairDoSistema();// chama o Método de Consultar Turma para funcionalidade.
			break;// para o processamento
		} // fim da opção 8

		default: // se opção não existir apresentar mensagem de ERRO.
			JOptionPane.showMessageDialog(null, MensagemString.opcaoInvalida, RotuloString.menu, 0);// mensagem de erro
			break;// para o processamento
		}// fim do swit
	}

	//Metodos para cadastrar nomes
	public void cadastrarNome() {
		boolean cadastro = true;
		
		while (cadastro && nomes.size() < 10) {
			try {
				
				String nome = JOptionPane.showInputDialog(MensagemString.informeNome).trim();//recebendo input do usuario e validando os caracteres
				if (ValidaString.isOnlyText(nome) && nome.length() > 1) { // rejeitando espaços, numeros e caracteres diferentes de letras .
					JOptionPane.showMessageDialog(null, MensagemString.nomeCadastrado, RotuloString.cadastrarNomes, 1);
					nomes.add(nome);
					int opcao = JOptionPane.showConfirmDialog(null, MensagemString.cadastraMais,
							RotuloString.cadastrarNomes, JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);// questionando se ele quer cadastrar um novo usuario.

					if (opcao == JOptionPane.NO_OPTION) {
						cadastro = false; // se não quer cadastrar mais usuario, volta pro menu
					}
				} else {
					JOptionPane.showMessageDialog(null, MensagemString.nomeInvalido, RotuloString.cadastrarNomes, 0); // mensagem de erro
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, MensagemString.nomeInvalido, RotuloString.cadastrarNomes, 0); // mensagem de erro ( para caracteres errados)
				cadastro = false;
			}
			
		}
	}

	// Método para excluir Nomes do cadastro
	public void excluirNome() {
		// declarando as variaveis auxiliares
		String mensagem = "";
		int contador = 1;
		boolean auxiliar = false;
		boolean retirado = false;
		
		//verifica se possui nomes cadastrados
		if(nomes.size() > 0) {
			while(auxiliar == false) {
				//mostrar os nomes da lista
				for (String variavel : nomes) {
					mensagem += "Código: " + contador + " - Nome: " + variavel + "\n";
					contador++;
				}
				//recebendo do usuario o nome para retirar
				int codigoRetirar  = Integer.parseInt(JOptionPane.showInputDialog(mensagem + MensagemString.informeNomeRemover));
				//laco para encontrar o nome desejado ja informado pelo usuario
				for (int i = 1; i <= nomes.size(); i++) {
					if(codigoRetirar == i) {
						nomes.remove(nomes.get(i-1));
						retirado = true;
					}
				}
				//exibe em tela em tela a exclusão com mensagem de sucesso
				if (retirado) {
					auxiliar = true;
					JOptionPane.showMessageDialog(null, MensagemString.nomeExcluido, RotuloString.excluirNome, 1);
				} else {
					JOptionPane.showMessageDialog(null, MensagemString.codigoInvalido, RotuloString.excluirNome, 0);
					//apaga a mensagem em caso de erro
					mensagem = "";
					//reinicia o contador
					contador = 1;
				}
			}
		} else {
			//exibe lista vazia
			JOptionPane.showMessageDialog(null, MensagemString.semCasdastro, RotuloString.excluirNome, 2);
		}//fim do if , else.
	}//fim do Método

	//Método para Listar os Nomes cadastrados.
	public void listarNomesCadastrados() {
		
		// variavel euxiliar para exibir ao usuario
		String mensagem = "";
		// varrendo a lista  para ver se existe usuario cadastrado e ja atribui a mensagem
		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.get(i) != null) {
				
				mensagem += (i + 1) + " - " + nomes.get(i) + "\n";
			}
		} // fim do for
		
		//apresentando em tela
		JOptionPane.showMessageDialog(null, mensagem, RotuloString.listarNomes, 1);
	}// fim do Metodo

	
	//Metodo para listar a lista de cadastro em ordem alfabética.
	public void listarNomesEmOrdemAlfabetica() {
		// criando novo arrayList
			ArrayList<String> novoArray = new ArrayList<String>(nomes);
			// declarando variaveis auxiliares
			String mensagem = "";
			boolean existe = false;
			
			// varrendo a lista do cadastro para ordenar em afabetica
			for (int i = 0; i < novoArray.size(); i++) {
				novoArray.replaceAll(String::toUpperCase); // transformando tudo em maiusculo para caso definir melhor em ordem alfabetica
				Collections.sort(novoArray);
				mensagem += (novoArray.get(i) + "\n");
				existe = true;
			}
			
			if (existe) {// se existe apresentar em tela a lista ja em ordem alfabetica
				JOptionPane.showMessageDialog(null, "==== LISTA EM ORDEM  ALFABÉTICA ====\n" + mensagem, RotuloString.listaNomesalfa, 1);
			} else { //se não mostrar que não existe nomes cadastrados ao usuario
				JOptionPane.showMessageDialog(null, MensagemString.semCasdastro, RotuloString.listaNomesalfa, 0);
			}//fim do if,else
		}//fim do Método.

// Método para listar os nomes iguais.
	public void listarNomesIguais() {
		//declarando variaveis auxiliares.
		boolean existe = false;
		String msg = "";
		//varrendo a lista de nomes e agrupando os iguais
		for (int i = 0; i < nomes.size(); i++) {
			//contando quantas vezes o nome agrupado se repetiu na lista
		int quantidade = Collections.frequency(nomes, nomes.get(i));
		if (quantidade > 1) {
			existe = true;
			//concatenando mensagem para apresentação
			msg += "O nome repetido é : " + nomes.get(i) + "  \n";
			msg += "Com um total de : " + quantidade + " repetições  \n\n";
			i += (quantidade - 1);
			existe = true;
		}
		
	}
		
	if (existe) {// se existe apresentar em tela a lista de nomes repetidos
		JOptionPane.showMessageDialog(null, msg, Rotulo.somaIguais, 1);
	} else {// se não  existe apresentar em tela a mensagem de erro ( não existe cadastro de nome).
		JOptionPane.showMessageDialog(null, MensagemString.semCasdastro, RotuloString.listaNomesIguais, 0);
			}
		}// fim do método
	
	//Método para pesquisar pela primeira letra do nome .
	public void listarNomesPorLetraInicial() {
		//declarando variaveis auxiliares
	String msg = "";
	msg += "Lista de Nomes com a letra: ";
	
		// verificando a letra solicitada para pesquisa
		String pesquisaLetra = JOptionPane.showInputDialog("Informe a letra inical para a pesquisa");
		msg += pesquisaLetra + "\n"; // criando mensagem final
		boolean existe = false;
		// varrendo a lista de cadastro para localizar os nomes com a letra inicial informada.
		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.get(i) != null && nomes.get(i).substring(0, 1).equals(pesquisaLetra)) {	
				msg += nomes.get(i) + "\n"; // criando mensagem.
				existe = true;
			}
		}
		if (existe) {//se existe apresentar em tela a lista de nomes repetidos
			JOptionPane.showMessageDialog(null, msg, RotuloString.listaNomesLetra, 1);
		}else {// se não  existe apresentar em tela a mensagem de erro ( não existe cadastro de nome).
			JOptionPane.showMessageDialog(null, MensagemString.nomeNaoEncontrado, RotuloString.listaNomesLetra, 0);
		}
	}//fim do Método

		//Méto para pesquisar nome.
	public void pesquisarNome() {
		//declarando variavel auxiliar de mensagem.
		String auxiliar = "";
		auxiliar = JOptionPane.showInputDialog(null, MensagemString.nomePesquisa, RotuloString.pesquisaNome, 1);
		if (nomes.contains(auxiliar)) {//se existe apresentar em tela a lista de nomes repetidos
			JOptionPane.showMessageDialog(null, "Nome : " + auxiliar + " encontrado", RotuloString.pesquisaNome, 1);
		} else {// se não  existe apresentar em tela a mensagem de erro ( não existe cadastro de nome).
			JOptionPane.showMessageDialog(null, MensagemString.nomeNaoEncontrado,RotuloString.pesquisaNome,  0);
		}

	}//fim do método

	//Método para sair do sistema.
	public void sairDoSistema() {
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Atenção", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		} // fim do if.
	}// fim do método
	
	
//Método para testar a classe
	public static void main(String[] args) {
		new ArrayListDeString();

	}//fim do método
}//fim da classe.
