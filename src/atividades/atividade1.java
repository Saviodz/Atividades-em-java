package atividades;
import java.util.Scanner;
public class atividade1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("Olá mundo!!!");
		System.out.println("digita um numero: ");
		int numero1 = sc.nextInt(); 
		System.out.println("digita um numero: ");
		int numero2 = sc.nextInt(); 
		System.out.println("digita um numero: ");
		int numero3 = sc.nextInt(); 
		System.out.println("soma é: " + (numero1 + numero2 + numero3));
		System.out.println("digita um numero 0 pra fechar: ");
		int fechar = sc.nextInt();
		if(fechar == 0 ) {
			sc.close();
			break;
		}
		}	
	}
}