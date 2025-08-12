package atividades;

public class atividade10 {
	public static void main(String[] args) {
	        
	        String conteudoInteressante = "A forma como nos dedicamos ao assunto impacta de maneira essencial o tipo de memória na qual o que foi ensinado será armazenado. Alguns conteúdos não ficam armazenados na memória de longa duração porque os alunos julgam que só serão cobrados na prova e não entendem que essa informação será  útil no futuro. Depois da prova,  a impressão é que nunca mais esses conteúdos serão utilizados.";
	        
	     conteudoInteressante = conteudoInteressante
	    		 
	                .replace("á", "a")
	                .replace("â", "a")
	                .replace("ã", "a")
	                .replace("é", "e")
	                .replace("í", "i")
	                .replace("ó", "o")
	                .replace("ú", "u")
	                .replace("ç", "c");
	        
	        
	        System.out.println(conteudoInteressante);
	        
	}
}