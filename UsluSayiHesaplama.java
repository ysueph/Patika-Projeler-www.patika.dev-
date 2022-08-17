package projeler;

import java.util.Scanner;

public class UsluSayiHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tara = new Scanner(System.in);
		System.out.println("sayi girin : ");
		int sayi = tara.nextInt();
		
		System.out.println("us olacak sayi girin : ");
		int us = tara.nextInt();
		
		int toplam=1;
		
		for(int i=1;i<=us;i++) {
			toplam *= sayi;
		}
		
		System.out.println("sonuc :"+toplam);
	}

}
