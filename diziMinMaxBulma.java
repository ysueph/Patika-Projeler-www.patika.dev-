package projeler;
import java.util.Scanner;
import java.util.Arrays;

public class diziMinMaxBulma {

    public static void main(String[] args) {
        int Min;
        int Max;
        
        Scanner tara = new Scanner(System.in);
        System.out.print("sayi gir :");
        int number = tara.nextInt();
        
        int[] list = {18,12,65,1,-3,-78,2,0, number};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        int index = Arrays.binarySearch(list, number);
        Min = list[index-1];
        Max = list[index+1];

        System.out.println("girilen degere en yakin kucuk sayi :" + Min);
        System.out.println("girilen degere en yakin buyuk sayi :" + Max);
  
    }
}
