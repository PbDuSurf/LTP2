package Parte1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = new String();
		Scanner leia = new Scanner(System.in);
	        int nota1, nota2, nota3;
	        int media;
	   
	            System.out.println("Digite o nome do aluno: ");
	              nome = leia.next();
	            // recebe a 1� nota
	            System.out.println("digite sua 1� nota");
	            nota1 = leia.nextInt();
	            
	            // recebe a 2� nota
	            System.out.println("digite sua 2� nota");
	            nota2 = leia.nextInt();
	            
	            // recebe a 3� nota
	            System.out.println("digite sua 3� nota");
	            nota3 = leia.nextInt();
	            
	            // calcula a m�dia
	            media = (nota1 + nota2 + nota3) / 3;
	            System.out.println("A m�dia do aluno � " + media);
	            
	            // mostra a nota do aluno
	            if (media >= 7){
	                System.out.println("Aluno aprovado");
	            } else if(media <= 4){
	                System.out.println("Aluno reprovado");
	            } else if((media >=4.1)&&(media <=6.9)){
	            	System.out.println("Aluno em recupera��o");
	            	
	           
	            }
	        }       
	   }

	



	


