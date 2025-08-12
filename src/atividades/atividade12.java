package atividades;
import java.util.Scanner;
public class atividade12 {
	public  static int divisao (int numero1,int numero2) {
		int divisão = numero1 / numero2;
		return divisão;
	}
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int numero1;
	int numero2;
	
	System.out.printf("primeiro numero:");
	numero1 = sc.nextInt();
	System.out.printf("segundo numero:");
	numero2 = sc.nextInt();
	
	if(numero2 != 0) {
		int resposta = divisao(numero1, numero2);
		System.out.printf("Resposta:" + resposta);
	}else {
		System.out.printf("segundo numero é zero!");
	}
	sc.close();
}
}



//Faça um programa para ler dois números reais, faça a divisão do primeiro número pelo segundo (se o segundo for diferente de zero).