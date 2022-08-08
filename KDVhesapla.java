package projeler;

import java.util.Scanner;

public class KDVhesapla {
	
	public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in);
		System.out.println("Fiyat : ");	
		double fiyat = tara.nextDouble();
		
		if (fiyat>1000) {
			
		    double kdvOran1= 0.08;
		    
		    double KDV1 = fiyat*kdvOran1;
		    double Toplam1= KDV1+fiyat;
		    
		    System.out.println("KDV :" + KDV1);
			System.out.println("KDV'li fiyat :" + Toplam1 );
			}
		
		else {
			  double kdvOran= 0.18;
				
				double KDV = fiyat*kdvOran;
				double Toplam= KDV+fiyat;
			
			System.out.println("KDV :" + KDV);
			System.out.println("KDV'li fiyat :" + Toplam );
		}
			
	}
}
