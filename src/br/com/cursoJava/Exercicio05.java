package br.com.cursoJava;

import java.util.Scanner;

public class Exercicio05 {
public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite Sua idade");
		int idade = Integer.parseInt(teclado.nextLine());
        int meses = (idade/30);
        int mes = meses%12;
        int anos = (meses/12);
        int dias = idade%30;
        System.out.println(anos+" anos "+mes+" meses e "+dias +" dias");
        teclado.close();
        
}
}
