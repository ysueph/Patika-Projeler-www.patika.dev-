package projeler;

import java.util.Scanner;

public class HesapMakinesi {
	
public static void main(String[] args) {
		
		Scanner tara = new Scanner(System.in);
		
		System.out.println("ilk sayi : ");
		int a = tara.nextInt();
		
		System.out.println("ikinci sayi : ");
		int b = tara.nextInt();
		
		System.out.println("1)toplama \n2)cikarma");
		System.out.println("3)carpma \n4)bolme");
		System.out.println("\n\n");
		System.out.println("seciminiz :");
		int secim = tara.nextInt();

		switch(secim) {
		case 1:
		System.out.println("secim 1)toplama:"+(a+b));
		    break;
		
		case 2:
			System.out.println("secim 2)cikarma:"+(a-b));
			break;
		case 3:
			System.out.println("secim 3)carpma:"+(a*b));
			break;
		case 4:
			System.out.println("secim 4)bolme:"+(a/b));
			break;
		default:
			System.out.println("yanlis girdiniz");
			break;
		}
		
	}

}
