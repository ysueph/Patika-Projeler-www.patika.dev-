package projeler;

import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner tara = new Scanner(System.in);
	        System.out.println("Bir Sayi Giriniz :");
	        int n = tara.nextInt();
	        
	        for (int i = n ; i > 0  ; i--) {
	        	
	        	for (int j = 0; j <=(n - i); j++) {
		            System.out.print(" ");
		        }
	        	
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
            
            
            System.out.println(" ");
	        }
	}

}
