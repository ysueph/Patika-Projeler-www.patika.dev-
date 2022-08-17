package projeler;

import java.util.Scanner;

public class EBOB_EKOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tara = new Scanner(System.in);
		System.out.println("n1 sayisini girin : ");
		int n1 = tara.nextInt();
		
		System.out.println("n2 sayisini girin : ");
		int n2 = tara.nextInt();
		
		int i=1;
		int a;
		int j=n1;
		
		while(j>=1) {
			j--;
			if(n1%j==0 && n2%j==0) {
				a=j;
				System.out.println("ebob :"+a);
				break;
			}
		}
		
		while(i<=n1/n2) {
			i++;
			if(i%n1==0 &&i%n2==0) {
				System.out.println("ekok :"+i);
				break;
			}
		}
	
	}

}
