package br.com.cursoJava;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o pre�o");
		double numero1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o valor do desconto em %");
		double numero2 = Double.parseDouble(teclado.nextLine())/100;
		
		double desconto = numero1*numero2;
		double preco = numero1-desconto;
		
		System.out.println("O pre�o � "+preco);
		System.out.println("Ovalor do desconto � "+desconto);
		teclado.close();
	
	}

}
