package Principal; // Questão 10 T2

public class Principal {

	public static void main(String[] args) {
	
		System.out.println("Tabuada de multiplicação");
		System.out.print("  ");
		for (int i = 1; i <= 10; i++){ 
			System.out.println("\nTabuada do número "+i);  
			
			for (int n = 1; n <= 10; n++){
			System.out.print(i+" x "+n+" = " +i*n);
			System.out.println("                             ");
			
			}
		}
	}
	
	

}
