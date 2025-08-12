package atividades;

public class atividade11 {
	public static void main(String[] args) {
		String[] palavras = { "_SATOR.R", "AR*EPO", "T_ENET_", "OPERA.", "ROT*ASs" };

		for (int i = 0; i <= palavras.length; i++) {
			palavras[i] = palavras[i].replace("_", "").toUpperCase();
			palavras[i] = palavras[i].replace(".", "");
			palavras[i] = palavras[i].replace("*", "");
			palavras[i] = palavras[i].replace(",", "");

			System.out.println(palavras[i]);

			String palavra_invertida = new StringBuilder(palavras[i]).reverse().toString();

			if (palavra_invertida.equals(palavras[i])) {
				System.out.printf("%s é palindromo\n", palavras[i]);
			}
		}
	}
}
