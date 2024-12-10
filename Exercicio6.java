package lista;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 43;
		boolean resultado = EhPar(numero);
		
		if(resultado) {
			System.out.println("O número "+numero+" é par");
		}else {
			System.out.println("O número "+numero+" é ímpar");
		}
		

	}
	
	public static boolean EhPar(int numero) {
			return numero %2==0;
		
	}

}
