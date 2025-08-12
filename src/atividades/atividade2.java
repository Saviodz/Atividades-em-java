package atividades;
import java.util.Scanner;
public class atividade2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int []matriculas = new int[10];
	System.out.print("digitem 10 numeros de matriculas:");
	for(int i = 0; i < 10; i++) {
		matriculas[i] = sc.nextInt();
	}
	for(int y = 0; y < 10;y++) {
		System.out.print(matriculas[y]);
	}
	sc.close();
}
}
