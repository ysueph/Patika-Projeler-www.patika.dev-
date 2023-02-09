package projeler;

import java.util.Scanner;

public class MayinTarlasi {

	public static void main(String[] args) {
		run(3,5);
		
	}

    int satırSayısı;



    public static void print(String[][] a, int satırSayısı, int sutunSayısı) {
        for (int i = 0; i < satırSayısı; i++) {
            for (int j = 0; j < sutunSayısı; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static void bombNumber(String[][] a, int satırSayısı, int sutunSayısı) {


        for (int i = 0; i < satırSayısı; i++) {

            for (int j = 0; j < sutunSayısı; j++) {
                int counter = 0;

                if (!(a[i][j].equals("*"))) {
                    if (j < sutunSayısı - 1) {
                        if (a[i][j + 1].equals("*")) {
                            counter++;
                            a[i][j] = String.valueOf(counter);
                        }

                        if (i < satırSayısı - 1) {
                            if (a[i + 1][j + 1].equals("*")) {
                                counter++;
                                a[i][j] = String.valueOf(counter);
                            }
                        }
                    }
                    if (i < satırSayısı - 1) {
                        if (a[i + 1][j].equals("*")) {
                            counter++;
                            a[i][j] = String.valueOf(counter);
                        }
                    }
                    if (j > 0) {
                        if (i < satırSayısı - 1) {
                            if (a[i + 1][j - 1].equals("*")) {
                                counter++;
                                a[i][j] = String.valueOf(counter);
                            }
                        }
                        if (a[i][j - 1].equals("*")) {
                            counter++;
                            a[i][j] = String.valueOf(counter);
                        }
                    }
                    if (i > 0 && j > 0) {
                        if (a[i - 1][j - 1].equals("*")) {
                            counter++;
                            a[i][j] = String.valueOf(counter);
                        }
                    }
                    if (i > 0) {
                        if (a[i - 1][j].equals("*")) {
                            counter++;
                            a[i][j] = String.valueOf(counter);
                        }
                    }
                    if (i > 0 && j < sutunSayısı - 1) {
                        if (a[i - 1][j + 1].equals("*")) {
                            counter++;
                            a[i][j] = String.valueOf(counter);
                        }
                    }
                }
            }

        }
    }

    public static void run(int satırSayısı, int sutunSayısı) {
        /* * - -
           - - *
           - - -    */

        String[][] a = new String[satırSayısı][sutunSayısı];

        int bomba = satırSayısı * sutunSayısı / 4;

        for (int i = 0; i < satırSayısı; i++) {
            for (int j = 0; j < sutunSayısı; j++) {
                a[i][j] = "-";
            }
        }

        for (int i = 0; i < bomba; i++) {

            int d = (int) (Math.random() * satırSayısı);
            int c = (int) (Math.random() * sutunSayısı);

            if (!(a[d][c].equals("*"))) {
                a[d][c] = "*";
            } else i--;
        }

        bombNumber(a, satırSayısı, sutunSayısı);
        print(a, satırSayısı, sutunSayısı);


        String[][] b = new String[satırSayısı][sutunSayısı];


        for (int i = 0; i < satırSayısı; i++) {
            for (int j = 0; j < sutunSayısı; j++) {
                b[i][j] = "-";
            }
        }
        int p=0;
        String[][]choices=new String[satırSayısı*sutunSayısı][2];
        print(b, satırSayısı, sutunSayısı);
        Scanner scanner = new Scanner(System.in);
        int counter3 = 0;
        while (!(counter3 == (satırSayısı * sutunSayısı))) {
            System.out.print("satır sayısı giriniz :");
            int i = scanner.nextInt();
            System.out.print("sutun sayısı giriniz :");
            int j = scanner.nextInt();

            String k= String.valueOf(i);
            String l= String.valueOf(j);
            boolean isRepeat=false;




            for (int m = 0; m <p ; m++) {
                    if (choices[m][0].equals(k)&&choices[m][1].equals(l)) {System.out.println("aynı değeri girdiniz");
                        isRepeat=true;
                        break;}
                        if (m==p-1){p++;
                        break;}
                }
            if (isRepeat)continue;

            if(p>0)p--;
            choices[p][0]=k;
            choices[p][1]=l;
            p++;


            if (i<satırSayısı&& i>-1 &&j<sutunSayısı &&j>-1){
            if (a[i][j].equals("*")) {
                System.out.println("game over");
                print(a,satırSayısı,sutunSayısı);
                break;

            }else {b[i][j]=a[i][j];
                print(b,satırSayısı,sutunSayısı);
                counter3++;

            }

        }else System.out.println("yanlış değer girdiniz");
            if (counter3 == ((satırSayısı * sutunSayısı)-bomba)) {System.out.println("you win");
                print(a,satırSayısı,sutunSayısı);
            break;}
        }
        

}}
