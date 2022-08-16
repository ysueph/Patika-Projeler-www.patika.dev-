package projeler;

import java.util.Scanner;

public class UcakBilet {
	public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in);
		System.out.println("Mesafe girin(km) : ");
		int km = tara.nextInt();
		
		System.out.println("Yas girin : ");
		int yas = tara.nextInt();
		
		System.out.println("Yolculuk tipi girin : \n1-tek yon  2-gidis donus");
		int yolTip = tara.nextInt();
		
		double tutar=km*0.10;
		double indirim;
		double indirimTutar;
		double gidis;
		
		
		 if (yas < 12){
			 indirim = tutar * 0.50;
			 indirimTutar = tutar - indirim;
			 
	        } else if (yas <= 24) {
	        	indirim = tutar * 0.10;
	        	indirimTutar = tutar - indirim;
	        	
	        } else if (yas >= 65) {
	        	indirim = tutar * 0.30;
	        	indirimTutar = tutar - indirim;
	        	
	        }else {
	        	indirimTutar = tutar;
	        }
		
		switch(yolTip) {
		case 1:
			
			 System.out.println("Toplam tutar: " + indirimTutar);
			break;
			
		case 2:
			gidis = indirimTutar - (indirimTutar * 0.20);
            System.out.println("Toplam tutar: " + gidis * 2);
			break;
		
		default:
			System.out.print("yanlis girdiniz");
			break;
			
		}
	}
	

}
