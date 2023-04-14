package wj.exercicioswhileudemy;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		//EX.01:
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		int senha;
		
		n = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha incorreta!");
			n = sc.nextInt();
		}
		System.out.println("Acesso permitido!");
		sc.close();*/
		
		//EX.03:
Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		}
	}


