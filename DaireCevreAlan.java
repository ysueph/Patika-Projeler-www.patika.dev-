package projeler;

import java.util.Scanner;

public class DaireCevreAlan {
	
	public static void main(String[] args) {
		
		double pi=3.14;
		
		Scanner tara = new Scanner(System.in);
		
		System.out.println("yaricap : ");
		int r = tara.nextInt();
		
		System.out.println("Merkez aci : ");
		int a = tara.nextInt();
		
		double DaireAlan = (pi*(r*r)*a)/360;
		double cevre= 2*pi*r;	
		double alan= pi*r*r;
		System.out.println("alan: " + alan);
		System.out.println("cevre : " + cevre);
		
		System.out.println("AciliAlan : " + DaireAlan);
	}
}
