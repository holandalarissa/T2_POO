package Principal;//Questão 01 T2 
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
	
	System.out.println("Vamos descobrir se um número é par ou ímpar!");
	Scanner n1 = new Scanner(System.in);
	System.out.print("Digite um número:");
	int num1 = n1.nextInt(); 
	
	if (num1 % 2 == 0) {
	System.out.println("O número " + num1 + " é par.");
		}
	else { 
	System.out.println("O número " + num1 + " é ímpar.");
	}
	
	}
	}

