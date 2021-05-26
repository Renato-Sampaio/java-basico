/**
 * 
 */
package exemplo11;

import java.util.ArrayList;

/**
 * Classe para demonstrar a utilização de ArrayList do tipo String
 * @author Renato Duarte Sampaio
 * @since 23 de fev. de 2021
 */
public class ArrayListString {

	/**
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		// declarar e Instalar uma Lista de String.
		
		ArrayList<String> listaString = new ArrayList <String>();
		
		//adicionar registros na lista String.
		listaString.add("Elemento 1");
		listaString.add("Elemento 2");
		listaString.add("Elemento 3");
	
		//Exibindo o conteudo da lista.
		System.out.println(listaString.get(0));
		System.out.println(listaString.get(1));
		System.out.println(listaString.get(2));	

		
		// adicionando em uma posição especifica.
		listaString.add(1, "Elemento 1.5");
		
		// Varrendo a Lista para usuario.
		for (String elemento : listaString) {
			System.out.println(elemento);
		}
	
		// OBTENDO O TAMANHO DA LISTA
		System.out.println(" O tamanho da list é: " + listaString.size());

				
		// pesquisando um valor especifico da lista.
		if (listaString.contains("Elemento1")) {
			System.out.println("Elemento Encontrado!");
		}else {
			System.out.println("Elemento não Encontrado!");
		}
		// Descobrindo o indice do elemento pesquisado.
		int indice = listaString.indexOf("Elemento 4");
		System.out.println("Indice" + indice);
				
		// adicionando em uma posição especifica.
		listaString.add("Elemento 4");

		// OBTENDO O TAMANHO DA LISTA
		System.out.println(" O tamanho da list é: " + listaString.size());
		
		//removendo um elemento da lista
		listaString.remove("Elemento 1.5");
		for ( String string : listaString) {
			System.out.println(string);
		}	
		//Obtendo o tamanho da lista da String
		System.out.println("O tamanho da lista é: " + listaString.size());
			
	}
}
