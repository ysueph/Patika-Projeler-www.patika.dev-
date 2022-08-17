package projeler;

import java.util.Scanner;

public class CiftSayilarToplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tara = new Scanner(System.in);
		int toplam=0;
		int sayi;
		
		do {
			System.out.println("sayi girin : ");
		 sayi = tara.nextInt();
			
		 if(sayi%2==0||sayi%4==0) {
			 toplam+=sayi;
		 }
		 
		}while(!(sayi%2==1));
		System.out.println("dongu bitti...");
		System.out.println("toplam :"+toplam);
	}

}
