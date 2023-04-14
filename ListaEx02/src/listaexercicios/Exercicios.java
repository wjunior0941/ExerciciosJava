package listaexercicios;
import java.util.Scanner;

public class Exercicios {
	
	public static void main(String[]args) { 

	//EX.01:
	/*Scanner sc = new Scanner(System.in);
	System.out.print("Digite um número inteiro: ");
	int n;
	n = sc.nextInt();
	if (n >= 0) {
		System.out.print("NÃO NEGATIVO");
	} else {
		System.out.println("NEGATIVO");
	}*/
		
	//EX.02:
	/*Scanner sc = new Scanner(System.in);
	System.out.print("Digite um número inteiro: ");
	int n;
	n = sc.nextInt();
	if (n%2==0 ) {
		System.out.println("PAR");
	} else {
		System.out.println("ÍMPAR");
	}*/
		
	//EX.03:
	/*Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.println("Digite um número inteiro: ");
	a = sc.nextInt();
	System.out.println("Digite outro número inteiro: ");
	b = sc.nextInt();
	if (a%b==0 || b%a==0) {
		System.out.print("São múltiplos");
	} else {
		System.out.print("Não são múltiplos");
	}*/
		
	//EX.04:
		/*Scanner sc = new Scanner(System.in);
		int hi,hf;
		
		System.out.println("Digite a hora que começou: ");
		hi = sc.nextInt();
		System.out.println("Digite a hora que terminou: ");
		hf = sc.nextInt();
		int dur;
		if (hi<hf) {
			dur=hf-hi;
		}else {
			dur=24-hi+hf;
		}
			System.out.println("O jogo durou " + dur + " horas.");*/
	
	//EX.05:
		
		/*Scanner sc = new Scanner(System.in);
		
		float cq = (float) 4.00;
		float xs = (float) 4.50;
		float xb = (float) 5.00;
		float ts = (float) 2.00;
		float re = (float) 1.50;
		
		int pe;
		int qt;
		float total;
		
		System.out.println( "1 - cachorro quente: " + cq);
		System.out.println("2 - x-salada: " + xs);
		System.out.println("3 - x-bacon: " + xb);
		System.out.println("4 - Torrada simples: " + ts);
		System.out.println("5 - Refrigerante: " + re);
		
		System.out.print("Qual o seu pedido? ");
		pe = sc.nextInt();
		System.out.print("Quantas unidades? ");
		qt = sc.nextInt();
		
		if (pe == 1) {
			total = qt * cq;
			System.out.print("O valor total do seu pedido: R$" + total);
		} else if(pe == 2){
			total = qt * xs;
			System.out.print("O valor total do seu pedido: R$" + total);
		} else if(pe ==3) {
			total = qt * xb;
			System.out.print("O valor total do seu pedido: R$" + total);
		} else if (pe == 4) {
			total = qt * ts;
			System.out.print("O valor total do seu pedido: R$" + total);
		} else if (pe == 5) {
			total = qt * re;
			System.out.print("O valor total do seu pedido: R$" + total);
		} else {
			System.out.print("Produto não existe!");
		}*/
		
		//EX.06:
		/*Scanner sc = new Scanner (System.in);
		float n;
		System.out.print("Digite um número: ");
		n = sc.nextFloat();
		  if (n < 0|| n > 100) {
			System.out.print("FORA DE INTERVALO!");
		} else if (n <= 25) {
			System.out.print("Intervalo [0 - 25]");
		} else if (n <= 50) {
			System.out.print("Intervalo [25 - 50]");
		} else if (n <= 75) {
			System.out.print("Intervalo [50 - 75]");
		} else {
			System.out.print("Intervalo [75 - 100]");
		}*/
		
		//EX.07:
		
		//Scanner sc = new Scanner(System.in);

		/*double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();*/
		
		//EX.08:
		/*Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();*/
		
		Scanner sc = new Scanner(System.in);
		int min;
		int valor;
		int adicional;
		System.out.println("Quantos minutos você usou? ");
		min = sc.nextInt();
		
		
		if(min >= 0 && min <= 100) {
			System.out.println("Valor a pagar R$50,00");
		} else if (min > 100){
			adicional = (min - 100) * 2 + 50;
			System.out.println("Valor a pagar: R$" + adicional);
		} else {
			System.out.println("Informe um valor válido!");
			
		}
		
		sc.close();
	}
}
