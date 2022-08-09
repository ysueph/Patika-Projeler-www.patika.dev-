package projeler;

import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		System.out.println("Armut Kac Kilo ? : ");
		int Armut = tara.nextInt();
		
		System.out.println("Elma Kac Kilo ? : ");
		int Elma = tara.nextInt();
		
		System.out.println("Domates Kac Kilo ? : ");
		int Domates = tara.nextInt();
		
		System.out.println("Muz  Kac Kilo ? : ");
		int Muz = tara.nextInt();
		
		System.out.println("Patlican Kac Kilo ? : ");
		int Patlican = tara.nextInt();
		
		double ArmutKG=2.14;
		double ElmaKG=3.67;
		double DomatesKG=1.11;
		double MuzKG=0.95;
		double PatlicanKG=5.00;
		
		
		double Toplam = (ArmutKG*Armut)+(ElmaKG*Elma)+(DomatesKG*Domates)+(MuzKG*Muz)+(PatlicanKG*Patlican);
		
		System.out.println("Toplam Tutar: " + Toplam);

	}

}
