package projeler;

import java.util.Scanner;

public class BolunenSayilarinToplami {

	public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in);
		System.out.println("sayi girin : ");
		int sayi = tara.nextInt();
		int i;
		int toplam=0;
		
		for(i=0; i<=sayi; i++) {
			if(i%3==0 && i%4==0) {
			toplam=+i;
			}
			else {
				System.out.println("3 ve 4'e bolunen sayi bulunamadi");
				break;
			}
		}
		System.out.println("toplam  :"+toplam);
	}

}
