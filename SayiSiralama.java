package projeler;

import java.util.Scanner;

public class SayiSiralama {
	
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int a, b, c;

	        System.out.print("birinci sayi: ");
	        a = input.nextInt();

	        System.out.print("ikinci sayi: ");
	        b = input.nextInt();

	        System.out.print("ucuncu sayi: ");
	        c = input.nextInt();

	        if (a > c && a > b) {
	            if (b > c) {
	                System.out.println(a + ">" + b + ">" + c);
	            } else {
	                System.out.println(a + ">" + c + ">" + b);
	            }
	        } else if (b > a && b > c) {
	            if (a > c) {
	                System.out.println(b + ">" + a + ">" + c);
	            } else {
	                System.out.println(b + ">" + c + ">" + a);
	            }
	        } else {
	            if (a > b) {
	                System.out.println(c + ">" + a + ">" + b);
	            } else {
	                System.out.println(c + ">" + b + ">" + a);
	            }
	        }
	    }
}
