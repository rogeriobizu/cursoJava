package br.com.cursoJava;

import java.util.Scanner;

public class Exercicio08 {
	
     public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tamanho da base do triangulo");
		double numero1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o tamanho da altura do triangulo ");
		double numero2 = Double.parseDouble(teclado.nextLine());
		
		double area = (numero1*numero2)/2;
		
		System.out.println("a area total do triangulo é: "+area);
		teclado.close();
		
    }

}
