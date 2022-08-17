package projeler;

import java.util.Scanner;

public class ATMprojesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ad, sifre;
        Scanner tara = new Scanner(System.in);
        int hak = 3;
        int bakiye = 1500;
        int secim;
        int deger;
        
        while (hak > 0) {
            System.out.print("Kullanici Adiniz :");
            ad = tara.nextLine();
            System.out.print("Parolaniz : ");
            sifre = tara.nextLine();

            if (ad.equals("yusuf") && sifre.equals("123")) {
                System.out.println("Merhaba, Bankaya Hosgeldiniz!");
                
                
                do {
                    System.out.println("1-Para yatirma\n" +
                                       "2-Para Cekme\n" +
                                       "3-Bakiye Sorgula\n" +
                                       "4-cikis Yap");
                    System.out.print("yapmak istediginizi secin : ");
                    secim = tara.nextInt();
                    
                    
                    switch(secim) {
                    case 1:
                    	System.out.print("yatirilan Para miktari : ");
                         deger = tara.nextInt();
                        bakiye += deger;
                        break;
                        
                    case 2:
                    	System.out.print("cekilen Para miktari : ");
                         deger = tara.nextInt();
                        
                        
                        if (deger > bakiye) {
                            System.out.println("Bakiye yetersiz....");
                        } 
                        else {
                        	bakiye -= deger;
                               }
                       break;
                        	
                    case 3:
                    	 System.out.println("Bakiyeniz : " + bakiye);
                    	 break;
                    	 
                    default:
                        System.out.println("cikis yapildi...");
                    }
                    
                } while(secim!=4) ;
                  break;
                	
                }
                    
                    
                    else {
                    	hak--;
                        System.out.println("hatali ad veya sifre. Tekrar deneyiniz.");
                        if (hak == 0) {
                            System.out.println("hesabiniz bloke olmustur.");
                        } else {
                            System.out.println("Kalan Hakkiniz : " + hak);
                        }
        }
	}

}
	
}
