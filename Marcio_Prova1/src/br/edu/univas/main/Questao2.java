package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		
	Scanner leitura = new Scanner (System.in);
	
	String palavra = leitura.nextLine();
	
	int quantidade = palavra.length();
	
	char leituraLetra = ' ';
	
	String novaPalavra = "";
	

	
	
	System.out.println(inverte (quantidade, leituraLetra, novaPalavra, palavra));
	
	leitura.close();
}

public static String inverte (int tamanho, char leituraLetra, String novaPalavra, String palavra) {
	
	for (int i = tamanho; i > 0 ; i--) {
		
		leituraLetra = palavra.charAt(i-1);
		
		novaPalavra = novaPalavra + leituraLetra;
		
	}
	
	return novaPalavra;
}
	
}
