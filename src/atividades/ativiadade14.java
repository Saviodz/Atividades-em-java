package atividades;

import java.util.Scanner;

public class ativiadade14 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] numeros = new double[4];

	        for (int i = 0; i < 4; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            numeros[i] = sc.nextDouble();
	        }

	        double maior = numeros[0];
	        double menor = numeros[0];
	        int positivos = 0;
	        int negativos = 0;

	        for (double num : numeros) {
	            maior = num > maior ? num : maior;
	            menor = num < menor ? num : menor;
	            positivos += num > 0 ? 1 : 0;
	            negativos += num < 0 ? 1 : 0;
	        }

	        System.out.println("Maior número: " + maior);
	        System.out.println("Menor número: " + menor);
	        System.out.println("Quantidade de positivos: " + positivos);
	        System.out.println("Quantidade de negativos: " + negativos);

	        sc.close();
	    }
	}
//Leia 4 números reais. Escreva o maior, o menor, quantos são positivos e quantos são negativos.