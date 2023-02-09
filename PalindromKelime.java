package projeler;

import java.util.Scanner;
public class PalindromKelime {
	
	
static String isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
            return "palindromik kelime degil!";
            i++;
            j--;
        }
        return "palindromik kelimedir...";
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kelime girin:");
        String word = input.nextLine();
        System.out.println(isPalindrome(word));
    }
    
}