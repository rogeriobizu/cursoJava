package br.com.cursoJava;

import java.util.Scanner;

public class Exercicio04 {
public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite Sua idade");
		int numero1 = Integer.parseInt(teclado.nextLine())*12;
		System.out.println(numero1);
		teclado.close();
}
}
