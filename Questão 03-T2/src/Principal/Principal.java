package Principal; //Questão 03-T2
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){

        int delta;
        int x1;
        int x2;
        int raiz;
        System.out.println("Resolvendo uma equação do 2º grau.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do a: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor do b: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor do c: ");
        int c = sc.nextInt();

        if(a != 0){
        delta = b*b * 4 * a * c;

        if(delta >= 0){
            x1 = (int) (( -b + (Math.sqrt (delta))) / ( 2*a ));
            x2 = (int) (( -b + (Math.sqrt (delta))) / ( 2*a ));
            System.out.println("O valor de x1 é: "+x1);
            System.out.println("O valor de x2 é: "+x2);
        
        }else{
        	System.out.println("Não será possível resolver, pois seu delta("+delta+") é menor que 0!");
        	}

        }else {
            System.out.println("Seu A é igual a 0, então isso não é uma equação do 2º grau!");
       }

    }
}