package projeler;

import java.util.Scanner;

public class ReculsiveIleFibonacci{
    
    static int fib(int n){
        
        
        if(n == 1 || n == 2){
            return 1;
        }
            return fib(n - 1) + fib( n - 2);
    }
    
    
    
    
    public static void main(String[] args) {
      
      Scanner tara = new Scanner(System.in);

      System.out.print("Fibonacci sayisi giriniz : ");
      int x = tara.nextInt();

      System.out.println(x + ". Fibonacci Sayisi degeri: " + fib(x));
    }
}