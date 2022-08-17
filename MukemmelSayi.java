package projeler;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tara = new Scanner(System.in);
		int toplam=0;
		int i=2;
		
		while(1<i) {
			System.out.println("sayiyi girin : ");
			int sayi = tara.nextInt();
			
	        for(int a = 1; a < sayi; a++)
	        {
	            if(sayi % a == 0) {
	                toplam += a;
	            }
	        }
	        if(sayi == toplam) {
	            System.out.println(sayi + " Mukemmel bir sayidir");
	            
	        }
	        else {
	            System.out.println(sayi + " Mukemmel bir sayi degildir.");
	            
	        }
	        toplam=0;
			i++;
		}
		 
	}

}
