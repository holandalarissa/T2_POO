package Principal; //Questão 09-T2
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Principal {
	public static void main(String[]args) {

	    double numero = 0, perc;
	    double somaNumeros = 0, quantidade = 0, media = 0, maior = 0, menor = 30000, qtdePar = 0, mediaPar = 0;
	    double numeroPar = 0, numParTotal = 0, qtdeimpar = 0, mediaimpar = 0, numeroimpar = 0,numimparTotal = 0;
	    
	    
	    do {
 
	        double n, num = 0, i;
	        n = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de números que você deseja ler:"));
		    for( i=1; i<=n ; i++ ){
		        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + i + "º número:"));
	   	 
	        somaNumeros += numero;
	        quantidade++;
	        media = somaNumeros / (quantidade);

	        if (maior < numero) {
	        	maior = numero;
	        }

	        if (menor > numero) {
	            menor = numero;
	        }

	        if (numero % 2 == 0) {
	        	qtdePar++;
	            numeroPar = numero;
	            numParTotal += numeroPar;
	            mediaPar = numParTotal / (qtdePar);
	        }
	        
	        if (numero % 2 != 0) {
	        	qtdeimpar++;
	            numeroimpar= numero;
	            numimparTotal += numeroimpar;
	            mediaimpar = numimparTotal / (qtdeimpar);
	        }
	        
		    	}
            perc = qtdeimpar * 100/quantidade;
		    
		    
	    } while (numero > 30000); 

	        JOptionPane.showMessageDialog(null, "A soma dos números digitados é: " + somaNumeros + "\nA quantidade de números digitados foi: " + quantidade + "\nA média dos números digitados é: " + media + "\nO maior número digitado foi: " + maior + "\nO menor número digitado foi: " + menor + "\nA média dos números pares é: " + mediaPar + "\nA média dos números ímpares é: " + mediaimpar +"\nA porcentagem de números ímpares é: " + perc + "%");
	
	}
}

	
		
	


