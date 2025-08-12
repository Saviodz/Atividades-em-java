package atividades;
import java.util.Scanner;
public class atividade13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("digite o primeiro numero: ");
	int numero1 = sc.nextInt();
	System.out.println("digite o primeiro numero: ");
	int numero2 = sc.nextInt();
	if(numero1 > 0 && numero2 > 0) {
		System.out.println("Valores são válidos");
	}else {
		System.out.println("Valores inválidos");
	}
	sc.close();
}
}










//Faça um programa para ler dois números reais e verificar se ambos são maiores que zero. Caso positivo, informar “Valores são válidos”. Caso contrário, informar “Valores inválidos”.