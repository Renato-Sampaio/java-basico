package exemplo03;

/**
 * Programa para demonstrar calculos aritmeticos simplificados
 * @author Renato Sampaio
 * @since 10/02/2021
 */

	public class OperacoesSimplificadas {

		/*
		 * Método principal para executar a classe
		 */
		public static void main(String[] args) {
			
			// declarando as variáveis
			int i;
			
			// inicializando a variavel com valor 10
			i = 10;
			
			// operação de adição
			i = i + 1;
			System.out.println(i);// exibindo o valor 20
			
			// operação de adição simplificada - incremento
			i++;
			System.out.println(i);
			
			// operação de subtração
			i = i - 1;
			System.out.println(i);// exibindo o valor 11
			
			// operação de subtração simplificada - decremento
			i--;
			System.out.println(i);// exibindo o valor 10
			
			// operação de adição
			i = i + 2;
			System.out.println(i);
			
			// operação de adição simplificada
			i += 2;
			System.out.println(i);
			
			// operação de subtração
			i = i - 2;
			System.out.println(i);
			
			// operação de subtração simplificada
			i -= 2;
			System.out.println(i);
			
			// operação de multiplicação
			i = i * 3;
			System.out.println(i);
			
			// operação de multiplicação simplificada
			i *= 3;
			System.out.println(i);
			
			// operação de divisão
			i = i / 3;
			System.out.println(i);
			
			// operação de divisão simplificada
			i /= 3;
			System.out.println(i);
			
			// operação de módulo
			i = i % 5;
			System.out.println(i);
			
			// operação de módulo simplificada
			i %= 5;
			System.out.println(i);

		}

	}
