package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);		
	
		System.out.println("Digite as notas");
		int[] notas = new int [10];
		
		for (int i = 0; i < 10;i++) {
			
			notas[i] = leitura.nextInt();
						
		}
		
		implementaLogica(notas);
		
		
		

	}
	
	public static int[] implementaLogica(int[] notas) {
		int[] novasNotas = new int [20];
		
	int cont = 1;
		
		for (int i = 0; i < 20 ; i++) {
	
			if (i ==0 ) {
			if (notas[i] < 60) {
				novasNotas[i] = notas[i];
				novasNotas[i+1] = 0;
			
			}
			
			else if (notas[i] >=60) {
				novasNotas[i] = notas[i];
				novasNotas[i+1] = 1;
			}
			
			else {
				novasNotas[i] = notas[i-cont];
				cont++;
			}
			}
		
		
			
		}
		
		
	return novasNotas;
	
		
		
	}

}
