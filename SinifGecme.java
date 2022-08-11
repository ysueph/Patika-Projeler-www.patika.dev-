package projeler;

import java.util.Scanner;

public class SinifGecme {
	
	public static void main(String[] args) {
		int hesap=0;
		double ort=0;
		
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
		
		
if((mat >= 0 && mat <= 100)) {
	ort += mat;
    hesap++;
		}
if((fzk >= 0 && fzk <= 100)) {
	ort += fzk;
    hesap++;
		}
if((kim >= 0 && kim <= 100)) {
	ort += kim;
    hesap++;
		}
if((turk >= 0 && turk <= 100)) {
	ort += turk;
    hesap++;
		}
if((tarih >= 0 && tarih <= 100)) {
	ort += tarih;
    hesap++;
		}
		
		
	    ort /= hesap;
		
		
		System.out.println("Ortalama: " + ort);
        if(ort<55) {
        	System.out.println("kaldiniz..");
        }
        else {
        	System.out.println("gectiniz");
        }

	}
}
