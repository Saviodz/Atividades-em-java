package atividades;
import java.util.Scanner;
public class atividades4 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	double raio;
	System.out.printf("digite o raio: ");
	raio = sc.nextDouble();
	double resposta = 3.14 * raio * raio;

    System.out.printf("Área do círculo: %.2f%n", resposta);

    sc.close();
	}
}
