package lista;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio7 {
	public static void main(String [] args) {
		
		String DataAtual = OnterDataAtual();
		
		System.out.println(DataAtual);
	}
	
	public static String OnterDataAtual() {
		
		LocalDate dataAtual = LocalDate.now();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return dataAtual.format(formato);
	}

}
