package Parte1;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		 
		 int lado1, lado2, lado3;
		 
	        System.out.println("lado 1:");
	        lado1 = leia.nextInt();
	        System.out.println("lado 2:");
	        lado2 = leia.nextInt();
	        System.out.println(" lado 3:");
	        lado3 = leia.nextInt();
	        

	        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
	            if (lado1 == lado2 && lado1 == lado3) {
	                System.out.println("Triangulo Equilatero");
	            } else if ((lado1 == lado2) || (lado1 == lado3)) {
	                System.out.println("Triangulo Isosceles");
	            } else
	                System.out.println("Triângulo Escaleno");
	        } else {
	            System.out.println("Não é um triangulo!");
	        }
	}
}