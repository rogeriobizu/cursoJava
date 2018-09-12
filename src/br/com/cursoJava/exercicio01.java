package br.com.cursoJava;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[]args){
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite um Numero");
	int numero1 = Integer.parseInt(teclado.nextLine());
	System.out.println("Digite um segundo Numero");
	int numero2 = Integer.parseInt(teclado.nextLine());
	int maior = Math.max(numero1, numero2);
	System.out.println(maior);
	/*if(numero1!=numero2 && numero1>numero2){
		System.out.println(numero1);
	}else if(numero1!=numero2 && numero1<numero2){
		System.out.println(numero2);
	}else{
		System.out.println("numeros iguais");
	}*/
teclado.close();
}
}