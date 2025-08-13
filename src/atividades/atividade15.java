package atividades;

import java.util.Scanner;

public class atividade15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 10 números:");
		int[] numeros = new int[10];

		for (int i = 0; i < 10; i++) {

			numeros[i] = sc.nextInt();
			for (int x = 0; x < i; x++) {
				if (numeros[i] == numeros[x]) {
					System.out.print("Já foi digitado, digite novamente outro numero: ");
					numeros[i] = sc.nextInt();
					x = -1;
				}
			}
		}
		print(numeros);
		System.out.println("soma: " + soma(numeros));
		media(numeros);
		MenorMaior(numeros);
		sc.close();
	}

	public static void print(int[] numeros) {
		System.out.println("\nSeus números:");
		for (int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}
	}
	
	public static void MenorMaior(int[] numeros) {
		int maior = numeros[0];
		int menor = numeros[0];
		for (int x = 0; x < 10; x++) {
			if (numeros[x] > maior) {
				maior = numeros[x];
			}
			if (numeros[x] < menor) {
				menor = numeros[x];
			}
		}
		System.out.println("maior numero: " + maior);
		System.out.println("menor numero: " + menor);

	}
	public static int soma(int [] numeros) {
		int soma = 0;
		for(int i = 0; i < 10; i++) {
		soma += numeros[i];
		}
		return soma;
	}
	public static void media(int []numeros) {
		double media = (double) soma(numeros) / 10;
		System.out.println("media: "+ media);
	}

}
