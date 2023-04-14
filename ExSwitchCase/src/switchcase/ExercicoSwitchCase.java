package switchcase;
import java.util.Scanner;

public class ExercicoSwitchCase {

public static void main (String [] args) {
	/*Scanner sc = new Scanner(System.in);
	int n;
	String dia;
	System.out.print("Digite um número: ");
	n = sc.nextInt();
	
	if (n == 1) {
		dia = "Domingo";
	} else if (n == 2) {
		dia = "Segunda";
	} else if (n == 3) {
		dia = "Terça";
	} else if (n == 4) {
		dia = "Quarta";
	} else if (n == 5) {
		dia = "Quinta";
	} else if (n == 6) {
		dia = "Sexta";
	} else if (n == 7) {
		dia = "Sabádo";
	} else {
		dia = "Número inválido";
	}
	
	System.out.println("O dia da semana é: " + dia);*/
	Scanner sc = new Scanner (System.in);
	System.out.print("Digite um número: ");
	int x = sc.nextInt();
	String dia;
	
	switch (x) {
	case 1:
		dia = "Domingo";
		break;
	case 2:
		dia = "Segunda";
		break;
	case 3:
		dia = "Terça";
		break;
	case 4:
		dia = "Quarta";
		break;
	case 5:
		dia = "Quinta";
		break;
	case 6:
		dia = "Sexta";
		break;
	case 7:
		dia = "Sabádo";
		break;
		default:
			dia = "Valor inválido";
	}
	System.out.println("Dia da semana: " + dia);
	
	sc.close();
	
}
	
}
