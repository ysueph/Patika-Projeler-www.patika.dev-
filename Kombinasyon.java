package projeler;

import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tara = new Scanner(System.in);
		System.out.println("sayi girin : ");
		int sayi = tara.nextInt();
		
		System.out.print("kacli kobinasyon olacak : ");
	    int sayi2 = tara.nextInt();
		
		int n=1;
		int r=1;
		
		int C;
		
		int fark=sayi-sayi2;
		int a=1;
		
		 if (sayi<sayi2) {
	            System.out.println("degerleri kontrol ediniz.");
	        } 
		 else {
			 
			    for(int i=1;i<=sayi;i++) {
					n *=i;
				}
				
				for(int j=1;j<=sayi2;j++) {
					r *=j;
				}
				
				for(int k=1;k<=fark;k++) {
					a *=k;
				}
				
				C=n/(r*a);
				System.out.println(sayi + " sayisinin " + sayi2 + " sayili kombinasyonu: " + C);
	        }
	
	}

}
