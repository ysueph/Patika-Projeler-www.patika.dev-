package projeler;

import java.util.Scanner;

public class SayininKuvvetleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tara = new Scanner(System.in);
		System.out.println("sayi girin : ");
		int sayi = tara.nextInt();
		
		for(int i=1; i<= sayi;i*=4) {
			System.out.println("4 ile ustel="+i);
		}
		for(int i=1; i<= sayi;i*=5) {
			System.out.println("5 ile ustel="+i);
		}
	}

}
