package exemplo03;

/**
 * Programa para demonstrar calculos aritmeticos simplificados
 * @author Renato Sampaio
 * @since 10/02/2021
 */

	public class OperacoesSimplificadas {

		/*
		 * M�todo principal para executar a classe
		 */
		public static void main(String[] args) {
			
			// declarando as vari�veis
			int i;
			
			// inicializando a variavel com valor 10
			i = 10;
			
			// opera��o de adi��o
			i = i + 1;
			System.out.println(i);// exibindo o valor 20
			
			// opera��o de adi��o simplificada - incremento
			i++;
			System.out.println(i);
			
			// opera��o de subtra��o
			i = i - 1;
			System.out.println(i);// exibindo o valor 11
			
			// opera��o de subtra��o simplificada - decremento
			i--;
			System.out.println(i);// exibindo o valor 10
			
			// opera��o de adi��o
			i = i + 2;
			System.out.println(i);
			
			// opera��o de adi��o simplificada
			i += 2;
			System.out.println(i);
			
			// opera��o de subtra��o
			i = i - 2;
			System.out.println(i);
			
			// opera��o de subtra��o simplificada
			i -= 2;
			System.out.println(i);
			
			// opera��o de multiplica��o
			i = i * 3;
			System.out.println(i);
			
			// opera��o de multiplica��o simplificada
			i *= 3;
			System.out.println(i);
			
			// opera��o de divis�o
			i = i / 3;
			System.out.println(i);
			
			// opera��o de divis�o simplificada
			i /= 3;
			System.out.println(i);
			
			// opera��o de m�dulo
			i = i % 5;
			System.out.println(i);
			
			// opera��o de m�dulo simplificada
			i %= 5;
			System.out.println(i);

		}

	}
