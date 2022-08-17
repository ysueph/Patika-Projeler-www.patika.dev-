package projeler;

import java.util.Scanner;

public class HarmonikSayilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tara = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		int sayi = tara.nextInt();
		double sonuc=0;
		
		for(double i=1;i<=sayi;i++) {
			sonuc +=(1/i);
		}
		
		System.out.print("harmonik sayi :"+sonuc);
	}

}
