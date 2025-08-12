package atividades;

public class atividade5 {

	  float imc;
	  
	    
	    void calcularImc(float altura, float peso) {
	        imc = peso / (altura * altura);
	    }

	    public static void main(String[] args) {
	        atividade5 pessoa = new atividade5();
	        pessoa.calcularImc(1.76f, 100);     
	        System.out.println("IMC: " + pessoa.imc);
	    }
}