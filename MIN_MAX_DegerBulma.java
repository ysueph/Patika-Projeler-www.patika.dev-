package projeler;

import java.util.Scanner;

public class MIN_MAX_DegerBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tara = new Scanner(System.in);
		System.out.println("kac sayi giriceksiniz : ");
		int a = tara.nextInt();
		int i=1;
		int min=0,max=0;
		
		while(i<=a) {
			System.out.println(i+". sayiyi girin : ");
			int sayi = tara.nextInt();
			 
			if (i==1) {
	                min = sayi;
	                max = sayi;
	            }
			if (sayi < min) {
	                min = sayi;
	            }
			if (sayi>max) {
	                max=sayi;
	            }
			i++;
		}
		  
		System.out.println("En Buyuk Sayi : " + max);
	    System.out.println("En Kucuk Sayi : " + min);
	   
	}

}
