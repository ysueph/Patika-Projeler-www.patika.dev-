package projeler;

import java.util.Scanner;

public class HavayaGoreEtkinlik {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		System.out.println("sicaklik giriniz : ");
		int sicaklik = tara.nextInt();
		
		 String etkinlik = (sicaklik < 5) ? "kayak yapilabilir."
	                                      : ((5 <= sicaklik && sicaklik < 15) ? "sinemaya gidebilirsin."
	                                      : ((15 <= sicaklik && sicaklik <= 25) ? "piknige gidebilirsin."
	                                      : "yuzmeye gidebilirsin."));
		
	
	System.out.println(etkinlik);
	}
}
