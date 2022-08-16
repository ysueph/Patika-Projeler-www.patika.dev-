package projeler;

import java.util.Scanner;

public class CinZodyagı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tara = new Scanner(System.in);
		System.out.println("Dogum yili girin : ");
		int yil = tara.nextInt();
		int burc= yil%12;
		
		switch(burc) {
		
		case 0:
             System.out.println("Burcunuz : Maymun");
             break;
		case 1:
            System.out.println("Burcunuz : Horoz");
            break;
		case 2:
            System.out.println("Burcunuz : Kopek");
            break;
		case 3:
            System.out.println("Burcunuz : Domuz");
            break;
		case 4:
            System.out.println("Burcunuz : Fare");
            break;
		case 5:
            System.out.println("Burcunuz : Okuz");
            break;
		case 6:
            System.out.println("Burcunuz : Kaplan");
            break;
		case 7:
            System.out.println("Burcunuz : Tavsan");
            break;
		case 8:
            System.out.println("Burcunuz : Ejderha");
            break;
		case 9:
            System.out.println("Burcunuz : Yilan");
            break;
		case 10:
            System.out.println("Burcunuz : At");
            break;
		case 11:
            System.out.println("Burcunuz : Koyun");
            break;
		 default:
			 System.out.println("yanlis girildi..");
		
		}
		
	}

}
