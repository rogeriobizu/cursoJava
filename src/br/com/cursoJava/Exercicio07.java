package br.com.cursoJava;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma Nota");
		double numero1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite um segunda Nota");
		double numero2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite um terceira Nota");
		double numero3 = Double.parseDouble(teclado.nextLine());
		
		double media = ((numero1+numero2+numero3)/3);
		double maiorNota = Math.max(numero3,Math.max(numero1,numero2));
		double menorNota = Math.min(numero3,Math.max(numero1,numero2));
		
		System.out.println("a média é: "+media);
		System.out.println("a maior nota é: "+maiorNota);
		System.out.println("a menor nota é: "+menorNota);
		teclado.close();
		
	}

}
