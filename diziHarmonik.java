package projeler;

import java.util.Scanner;

public class diziHarmonik {

	    public static void main(String[] args) {
	        int[] numbers = {3, 4, 7, 6, 4, 67, 88, 23, 7};
	        double sonuc = 0;
	        
	        for (int i = 0; i < numbers.length; i++) {
	            sonuc += 1.0/numbers[i];
	        }

	       double ort = numbers.length/ sonuc;
	        System.out.println("harmonik sayi :"+ort);
	    }
}


