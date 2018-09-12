package br.com.cursoJava;

import java.util.Scanner;

public class Exercicio09 {
public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma Nota");
		double numero1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite um segunda Nota");
		double numero2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite um terceira Nota");
		double numero3 = Double.parseDouble(teclado.nextLine());
		
		double media = (((numero1*2)+(numero2*3)+(numero3*5))/10);
		
		System.out.println("a media ponderada é: "+media);
		
		teclado.close();
}

}
