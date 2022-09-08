package projeler;

public class PalidromSayi {


		    static int isPolindrom(int number) {
		        int temp = number;
		        int lastNumber, reverseNumber = 0;
		        while (temp != 0) {
		            System.out.println("=========");
		            System.out.println("sayi :" + temp);
		            lastNumber = temp % 10;
		            System.out.println("Son Basamak :" + lastNumber);
		            reverseNumber = (reverseNumber * 10) + lastNumber;
		            System.out.println("Yeni Sayim :" + reverseNumber);
		            temp /= 10;
		            System.out.println("Yeni Temp :"+temp);

		        }
		        if (number == reverseNumber)
		           
		            System.out.println("Bu bir Polindrom sayisidir.");
		        else

		            System.out.println("Bu bir Polindrom sayisi değildir.");


		        return number;
		    }


		    public static void main(String[] args) {
		        isPolindrom(9889);

		    }
		
	

}
