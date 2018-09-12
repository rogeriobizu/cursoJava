package br.com.cursoJava;

import java.util.Scanner;

public class Exercicio02 {	
	public static void main(String[]args){
	
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite um Numero");
	double numero1 = Double.parseDouble(teclado.nextLine());
	System.out.println("Digite um segundo Numero");
	double numero2 = Double.parseDouble(teclado.nextLine());
	System.out.println("Digite um segundo Numero");
	double numero3 = Double.parseDouble(teclado.nextLine());
	double media = ((numero1+numero2+numero3)/3);
	System.out.println(media);
	teclado.close();
	}

}
