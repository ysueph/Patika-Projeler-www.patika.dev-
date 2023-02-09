package projeler;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
       // int number = (int)(Math.random()*100);

        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong= false;

        while (right < 5){
            System.out.print("sayi gir : ");
            selected = input.nextInt();

            if(selected <0 || selected> 99){
                System.out.println("hata.. duzgun deger girin. ");
                continue;
            }
            if(selected == number){
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı : "+ number);
                isWin = true;
                break;
            }else{
                wrong[right]=selected;
                right++;
                System.out.println("yanlis tahmin!");
                if(selected > number){
                    System.out.println(selected+" sayisi, buyuk. ");
                }else{
                    System.out.println(selected+" sayisi, kucuk.");
                }
                System.out.println("Kalan hak : "+ (5-right));
                if((5-right)==0){
                    System.out.println("hakkiniz bitti, asil sayi : "+number);
                }
            }
        }
        if (!isWin){
            System.out.println("Tahminleriniz : "+Arrays.toString(wrong));
        }
        input.close();
    }
}
