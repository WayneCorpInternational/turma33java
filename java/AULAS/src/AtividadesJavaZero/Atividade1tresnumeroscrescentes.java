package AtividadesJavaZero;

import java.util.Scanner;

public class Atividade1tresnumeroscrescentes {

	
		public static void main(String[] args) {
		
		//variaveis
		
		int a,b,c;
		
		//2 - Fa�a um programa que entre com tr�s 
		//n�meros e coloque em ordem crescente.
		
		
		//entradas
		Scanner mySc = new Scanner(System.in);
		
		System.out.println("Valor de A");
		a = mySc.nextInt();
		System.out.println("Valor de B");
		b = mySc.nextInt();
		System.out.println("Valor de C");
		c = mySc.nextInt();
		
		//saidas - continhas
		
		if(a==b && b==c) {
			System.out.printf("%d, %d, %d",a,b,c);
		}
		
		else if(a<=b && b<=c) {
			System.out.printf("%d, %d, %d",a,b,c);
		}
		
		else if(a<=c && c<=b) {
			System.out.printf("%d, %d, %d",a,c,b);
		}
		
		else if(b<=a && b<=c && a<=c) {
			System.out.printf("%d, %d, %d",b,a,c);
		}
		
		else if(c<=a && c<=b && b<=a){
			System.out.printf("%d, %d, %d",c,b,a);
		}
		
		else {
			System.out.printf("%d, %d, %d",c,a,b);
		}
	}
}
