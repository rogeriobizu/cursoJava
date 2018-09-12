package br.com.cursoJava;

import java.util.Scanner;

public class ExemploConversaoDados{
	
	public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um Numero");
		int numero1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite um segundo Numero");
		int numero2 = Integer.parseInt(teclado.nextLine());
		System.out.println(numero1+numero2);
		System.out.println("Digite o preço do produto");
		double preco = Double.parseDouble(teclado.nextLine());
		double desconto = 0.1;
		System.out.println("Desconto do produto"+(preco*desconto));
		
		teclado.close();
	}
}