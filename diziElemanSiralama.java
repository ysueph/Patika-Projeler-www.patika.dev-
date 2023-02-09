package projeler;

import java.util.Arrays;
import java.util.Scanner;

public class diziElemanSiralama {
    public static void main(String[] args) {
        int n;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        n = input.nextInt();
        
        int[] dizi=new int[n];
        System.out.println("eleman sayisi : ");
        for(int i=0;i<n;i++){      
            System.out.print(i+1+". elemani : ");

        dizi[i] = input.nextInt();
        }
        
        Arrays.sort(dizi);
        System.out.println("Siralama: "+Arrays.toString(dizi));

    }
}
