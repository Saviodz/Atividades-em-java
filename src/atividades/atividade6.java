package atividades;

public class atividade6 {
	static boolean aprovado(float nota) {
		return(nota>=60)?true:false;
	}
	public static void main(String[] args) {
		boolean apr  = aprovado(70);
		System.out.println("aprovado!" + apr);
	}
}
