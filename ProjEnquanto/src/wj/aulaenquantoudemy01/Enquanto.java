package wj.aulaenquantoudemy01;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			//soma = soma + x;
			soma += x;
			x = sc.nextInt();
		}
		System.out.println("A soma é: " + soma);
		sc.close();

	}

}
