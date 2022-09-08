package projeler;

import java.util.Scanner;

public class ReculsiveIleUsluSayi {

	  static int Us(int a, int b){
	        if(a == 1 | b == 0)
	            return 1;

	        return Us(a,b-1) * a;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Taban Sayi: ");
	        int x = input.nextInt();
	        System.out.print("Ustel Sayi: ");
	        int y = input.nextInt();

	        System.out.println("Sonuc: " + Us(x,y));


	    }
}
