package AtividadeVetioresMatrix;

import java.util.Random;

public class ExemploRamdom {


		  public static void main(String[] args) {

			  
		    //inst�ncia um objeto da classe Random usando o construtor padr�o
		    Random gerador = new Random();

		     //imprime sequ�ncia de 10 n�meros inteiros aleat�rios
		     for (int i = 0; i < 10; i++) {
		     System.out.println(gerador.nextInt());
		       
		     }
		  }
	}