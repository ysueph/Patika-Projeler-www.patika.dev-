package projeler;

import java.util.Scanner;

public class AlanBulma {
	
	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		System.out.println("A kenar : ");
		double A = tara.nextDouble();
		System.out.println("B kenar : ");
		double B = tara.nextDouble();
		System.out.println("C kenar : ");
		double C = tara.nextDouble();
		
		double U = (A+B+C)/2;
		double cevre= U*2;		
		System.out.println("alan: " + U);
		System.out.println("cevre : " + cevre);
	}
}
