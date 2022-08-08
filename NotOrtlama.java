package projeler;

import java.util.Scanner;

public class NotOrtlama {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		System.out.println("Matematik sinav puani : ");
		int mat = tara.nextInt();
		System.out.println("Fizik sinav puani : ");
		int fzk = tara.nextInt();
		System.out.println("Kimya sinav puani : ");
		int kim = tara.nextInt();
		System.out.println("Tukrce sinav puani : ");
		int turk = tara.nextInt();
		System.out.println("Tarih sinav puani : ");
		int tarih = tara.nextInt();
		
		int ort = (mat+fzk+kim+turk+tarih)/5;
		
		System.out.println("Ortalama: " + ort);
        System.out.println(ort > 60 ? "Sinifi Geçti" : "Sinifta Kaldi");

	}

}
