package br.com.cursoJava;

import java.util.Scanner;

public class Exercicio10 {
public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o peso da pessoa");
		double numero1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a altura da pessoa");
		double numero2 = Double.parseDouble(teclado.nextLine());
		
		double imc = numero1/(numero2*numero2);
		System.out.println("o valor do IMC é: "+ imc);
		teclado.close();
}
}
