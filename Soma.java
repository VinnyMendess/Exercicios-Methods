package lista;

public class Soma {

    public static void main(String[] args) {
        // Chamada do método Somar
        int resultado = Somar(1, 1);
        System.out.println("A soma é: " + resultado);
    }

    // Método com parâmetros que retorna a soma
    public static int Somar(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
