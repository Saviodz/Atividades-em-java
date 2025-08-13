package atividades;

import java.util.Scanner;

public class ativiadade14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] numeros = new double[4];

		int positivos = 0;
		int negativos = 0;

		System.out.println("Digite 4 números reais:");
		for (int i = 0; i < 4; i++) {
			numeros[i] = sc.nextDouble();
		}

		double maior = numeros[0];
		double menor = numeros[0];

		for (int i = 0; i < 4; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			if (numeros[i] > 0) {
				positivos++;
			} else if (numeros[i] < 0) {
				negativos++;
			}
		}

		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		System.out.println("Quantidade de positivos: " + positivos);
		System.out.println("Quantidade de negativos: " + negativos);

		sc.close();
	}
}

//Leia 4 números reais. Escreva o maior, o menor, quantos são positivos e quantos são negativos;