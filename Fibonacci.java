package projeler;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner tara = new Scanner(System.in);
	        System.out.println("Bir Sayi Giriniz :");
	        int n = tara.nextInt();
	        int i = 1;
	        
	        
	        int a = 0;
	        int sonuc;
	        int b = 1;
	        
	        System.out.println(n+" elemanli fibonacci");
	        while(i<=n) {
	        	System.out.print(a+" ");
	            sonuc = b + a;
	            a = b;
	            b=sonuc;
	            
	            
	            i++;
	        }
	        
	}

}
