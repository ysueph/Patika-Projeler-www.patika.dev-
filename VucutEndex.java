package projeler;

import java.util.Scanner;

public class VucutEndex {

	public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in);
		System.out.println("Lutfen boyunuzu (metre cinsinde) giriniz :");
		double boy = tara.nextDouble();
		
		System.out.println("Lutfen kilonuzu giriniz :");
		int kilo = tara.nextInt();
		
		double index = kilo/(boy*boy);
		
		System.out.println("Ortalama Index: " + index);

	}

}
