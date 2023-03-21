package Parte1;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int tempodeCasa;
		float saláriodoEmpregado;
		float novoSalário;
		float bonusSalário;
		float valeTransporte;
		
		//Introduzir os dados
		System.out.println("Informe seu tempo de empresa: ");
		tempodeCasa = leia.nextInt();
		System.out.println("Informe seu salário na empresa: ");
		saláriodoEmpregado = leia.nextFloat();
		
		if(tempodeCasa <= 5 && saláriodoEmpregado <= 300) {
			bonusSalário = 50;
			valeTransporte = (saláriodoEmpregado * 5)/100;
			novoSalário = saláriodoEmpregado + bonusSalário - valeTransporte;
			System.out.println("O bônus no Salário é de: " + " R$ " + bonusSalário);
			System.out.println("O valor do vale transporte é: " + " R$ " + valeTransporte);
			System.out.println("O salário novo : " + " R$ " + novoSalário);
		}
		else if(tempodeCasa <= 5 && saláriodoEmpregado > 300) {
			bonusSalário = 80;
			valeTransporte = (saláriodoEmpregado * 6)/100;
			novoSalário = saláriodoEmpregado + bonusSalário - valeTransporte;
			System.out.println("O bônus no Salário é de: " + " R$ " + bonusSalário);
			System.out.println("O valor do vale transporte é: " + " R$ " + valeTransporte);
			System.out.println("O salário novo : " + " R$ " + novoSalário);
		}
		else if(tempodeCasa >= 6 && tempodeCasa <=10 && saláriodoEmpregado <= 500) {
			bonusSalário = (saláriodoEmpregado * 15)/100;
			valeTransporte = 70;
			novoSalário = saláriodoEmpregado + bonusSalário - valeTransporte;
			System.out.println("O bônus no Salário é de: " + " R$ " + bonusSalário);
			System.out.println("O valor do vale transporte é: " + " R$ " + valeTransporte);
			System.out.println("O salário novo : " + " R$ " + novoSalário);
		}
		else if(tempodeCasa >= 6 && tempodeCasa <=10 && saláriodoEmpregado > 500 && saláriodoEmpregado <= 2000) {
			bonusSalário = (saláriodoEmpregado * 13)/100;
			valeTransporte = 90;
			novoSalário = saláriodoEmpregado + bonusSalário - valeTransporte;
			System.out.println("O bônus no Salário é de: " + " R$ " + bonusSalário);
			System.out.println("O valor do vale transporte é: " + " R$ " + valeTransporte);
			System.out.println("O salário novo : " + " R$ " + novoSalário);
		}
		else if(tempodeCasa == 6 && tempodeCasa <=10 && saláriodoEmpregado > 2000) {
			bonusSalário = (saláriodoEmpregado * 12)/100;
			valeTransporte = (saláriodoEmpregado * 8)/100;
			novoSalário = saláriodoEmpregado + bonusSalário - valeTransporte;
			System.out.println("O bônus no Salário é de: " + " R$ " + bonusSalário);
			System.out.println("O valor do vale transporte é: " + " R$ " + valeTransporte);
			System.out.println("O salário novo : " + " R$ " + novoSalário);
		}
		else if(tempodeCasa > 10 && saláriodoEmpregado > 2000) {
			bonusSalário = 300;
			valeTransporte = (saláriodoEmpregado * 4)/100;
			novoSalário = saláriodoEmpregado + bonusSalário - valeTransporte;
			System.out.println("O bônus no Salário é de: " + " R$ " + bonusSalário);
			System.out.println("O valor do vale transporte é: " + " R$ " + valeTransporte);
			System.out.println("O salário novo : " + " R$ " + novoSalário);
		}
		leia.close();
	}
}
