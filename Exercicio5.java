package lista;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = MaiorNumero(50, 300);
		System.out.println("O maior número é: "+resultado);
	}
	
	public static int MaiorNumero(int numero1, int numero2) {
		if(numero1>numero2) {
			return numero1;
		}else {
			return numero2;
		}
	}

}
