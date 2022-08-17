package projeler;

import java.util.Scanner;

public class BasamaklariToplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deger;
		int sonuc = 0;
		
		Scanner tara = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		int sayi = tara.nextInt();
		
		int yeniSayi = sayi;
		
		
		while(yeniSayi != 0) {
			
			deger = yeniSayi % 10;
			sonuc += deger;
			yeniSayi /= 10;	
		}
		
		System.out.println(sayi + " sayisinin rakamlari toplami: " +sonuc);
	}
	

}
