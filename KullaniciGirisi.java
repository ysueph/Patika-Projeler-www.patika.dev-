package projeler;

import java.util.Scanner;

public class KullaniciGirisi {
	public static void main(String[] args) {
	
	String ad,sifre,sifre2;
	
	int secim;
	
	Scanner tara = new Scanner(System.in);
	
	
	System.out.print("kullanici adi girin: ");
	ad = tara.nextLine();
	
	System.out.print("sifre girin: ");
	sifre = tara.nextLine();
	
if(ad.equals("yusuf")&&sifre.equals("adam")) {
	System.out.print("giris yapildi....");
}

else if(ad.equals("yusuf")&&!sifre.equals("adam")){
	System.out.println("sifre hatali. Sifirlamak ister misiniz? ");
	System.out.println("1)evet \n2)hayir");
	secim=tara.nextInt();
	
	
	switch(secim) {
	case 1:
		
		System.out.println("yeni sifre girin: ");
		sifre2 = tara.nextLine();
		
		if(sifre.equals(sifre2) && sifre2.equals("adam")) {
			System.out.println("sifre olusturulmadi, farkli giriniz: ");
			sifre2 = tara.nextLine();
		}
		
		break;
		
	case 2:
		System.out.print("cikildi");
		break;
	
	default:
		System.out.print("cikildi");
		break;
		
	}
	
}
else {
	System.out.print("Kullanici adi yanlis...");
}
    
	}
}