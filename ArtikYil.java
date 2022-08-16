package projeler;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in);
		System.out.println("yili girin : ");
		int yil = tara.nextInt();

		if(yil%4==0 || yil%400==0) {
			System.out.println(yil+" artik yildir. ");
			
		}
		else {
			
			System.out.println(yil+" artik yil degildir. ");
		}
	}

}
