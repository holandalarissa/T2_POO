package Principal; //Questão 05-T2
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
	
	    int n, num, i, j, fatorial;
	    Scanner sc = new Scanner(System.in); 
	    System.out.print("Digite a quantidade de números que você deseja ler:");
	    n = sc.nextInt();
	    
	    for( i=1; i<=n ; i++ ){
	       System.out.println("\nDigite o " + i + "º número:");
	          num = sc.nextInt();
	         
	    fatorial = 1 ;
	    for( j=1; j<=num ; j++ ){
	        fatorial = fatorial * j;
	       System.out.println("O Fatorial de " + num + " é " + fatorial + ".");
	    	
	    	}
	    }     
	}
}
