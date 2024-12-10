package lista;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 5;
		int resultado = CalcularFatorial(numero);
		System.out.println("O faotorial de "+numero+" é: "+resultado);

	}
	
	public static int CalcularFatorial(int n) {
		int fatorial= 1;
				for (int i = 1; i <= n; i++) {
					fatorial *= i;
				}
				return fatorial;
		
	}

}
