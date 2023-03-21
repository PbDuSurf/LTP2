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
	            // recebe a 1º nota
	            System.out.println("digite sua 1ª nota");
	            nota1 = leia.nextInt();
	            
	            // recebe a 2º nota
	            System.out.println("digite sua 2ª nota");
	            nota2 = leia.nextInt();
	            
	            // recebe a 3º nota
	            System.out.println("digite sua 3ª nota");
	            nota3 = leia.nextInt();
	            
	            // calcula a média
	            media = (nota1 + nota2 + nota3) / 3;
	            System.out.println("A média do aluno é " + media);
	            
	            // mostra a nota do aluno
	            if (media >= 7){
	                System.out.println("Aluno aprovado");
	            } else if(media <= 4){
	                System.out.println("Aluno reprovado");
	            } else if((media >=4.1)&&(media <=6.9)){
	            	System.out.println("Aluno em recuperação");
	            	
	           
	            }
	        }       
	   }

	



	


