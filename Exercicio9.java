package lista;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercício 9: Método com Parâmetros e Retorno 

/* Descrição: Crie um método chamado ConcatenarStrings que receba
duas strings como parâmetros e retorne a concatenação dessas duas
strings. 
*/

		String Concatenar = concatenarString("Olá denovo", " falaaaa");
		System.out.println(Concatenar);

	}
	
	public static String concatenarString(String s1, String s2) {
		return s1 + s2;
				
	}

}
