package lista;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Exercício 10: Método com Parâmetros e Retorno 

Descrição: Crie um método chamado CalcularMedia que receba
 três números decimais como parâmetros e retorne a média 
 desses números. 

		 */
		
		double resultado = calcularMedia(40.50,60.40,80.10);
		System.out.printf("a média é: %.2f%n ", resultado);
	}
	
	public static double calcularMedia(double numero1, double numero2, double numero3) {
		return (numero1+numero2+numero3)/3;
	}
	

}
