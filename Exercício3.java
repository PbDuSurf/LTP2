package Parte1;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int tempodeCasa;
		float sal�riodoEmpregado;
		float novoSal�rio;
		float bonusSal�rio;
		float valeTransporte;
		
		//Introduzir os dados
		System.out.println("Informe seu tempo de empresa: ");
		tempodeCasa = leia.nextInt();
		System.out.println("Informe seu sal�rio na empresa: ");
		sal�riodoEmpregado = leia.nextFloat();
		
		if(tempodeCasa <= 5 && sal�riodoEmpregado <= 300) {
			bonusSal�rio = 50;
			valeTransporte = (sal�riodoEmpregado * 5)/100;
			novoSal�rio = sal�riodoEmpregado + bonusSal�rio - valeTransporte;
			System.out.println("O b�nus no Sal�rio � de: " + " R$ " + bonusSal�rio);
			System.out.println("O valor do vale transporte �: " + " R$ " + valeTransporte);
			System.out.println("O sal�rio novo : " + " R$ " + novoSal�rio);
		}
		else if(tempodeCasa <= 5 && sal�riodoEmpregado > 300) {
			bonusSal�rio = 80;
			valeTransporte = (sal�riodoEmpregado * 6)/100;
			novoSal�rio = sal�riodoEmpregado + bonusSal�rio - valeTransporte;
			System.out.println("O b�nus no Sal�rio � de: " + " R$ " + bonusSal�rio);
			System.out.println("O valor do vale transporte �: " + " R$ " + valeTransporte);
			System.out.println("O sal�rio novo : " + " R$ " + novoSal�rio);
		}
		else if(tempodeCasa >= 6 && tempodeCasa <=10 && sal�riodoEmpregado <= 500) {
			bonusSal�rio = (sal�riodoEmpregado * 15)/100;
			valeTransporte = 70;
			novoSal�rio = sal�riodoEmpregado + bonusSal�rio - valeTransporte;
			System.out.println("O b�nus no Sal�rio � de: " + " R$ " + bonusSal�rio);
			System.out.println("O valor do vale transporte �: " + " R$ " + valeTransporte);
			System.out.println("O sal�rio novo : " + " R$ " + novoSal�rio);
		}
		else if(tempodeCasa >= 6 && tempodeCasa <=10 && sal�riodoEmpregado > 500 && sal�riodoEmpregado <= 2000) {
			bonusSal�rio = (sal�riodoEmpregado * 13)/100;
			valeTransporte = 90;
			novoSal�rio = sal�riodoEmpregado + bonusSal�rio - valeTransporte;
			System.out.println("O b�nus no Sal�rio � de: " + " R$ " + bonusSal�rio);
			System.out.println("O valor do vale transporte �: " + " R$ " + valeTransporte);
			System.out.println("O sal�rio novo : " + " R$ " + novoSal�rio);
		}
		else if(tempodeCasa == 6 && tempodeCasa <=10 && sal�riodoEmpregado > 2000) {
			bonusSal�rio = (sal�riodoEmpregado * 12)/100;
			valeTransporte = (sal�riodoEmpregado * 8)/100;
			novoSal�rio = sal�riodoEmpregado + bonusSal�rio - valeTransporte;
			System.out.println("O b�nus no Sal�rio � de: " + " R$ " + bonusSal�rio);
			System.out.println("O valor do vale transporte �: " + " R$ " + valeTransporte);
			System.out.println("O sal�rio novo : " + " R$ " + novoSal�rio);
		}
		else if(tempodeCasa > 10 && sal�riodoEmpregado > 2000) {
			bonusSal�rio = 300;
			valeTransporte = (sal�riodoEmpregado * 4)/100;
			novoSal�rio = sal�riodoEmpregado + bonusSal�rio - valeTransporte;
			System.out.println("O b�nus no Sal�rio � de: " + " R$ " + bonusSal�rio);
			System.out.println("O valor do vale transporte �: " + " R$ " + valeTransporte);
			System.out.println("O sal�rio novo : " + " R$ " + novoSal�rio);
		}
		leia.close();
	}
}
