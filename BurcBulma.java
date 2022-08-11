package projeler;

import java.util.Scanner;

public class BurcBulma {
	public static void main(String[] args) {

        int day,month;

        Scanner input=new Scanner(System.in);

        System.out.println("Dogdugunuz Ay:");
        month=input.nextInt();
        if(month>=1&&month<=12){

        System.out.println("Dogdugunuz Gun: ");
        day=input.nextInt();

        if(month==1){
            if(day>=1&&day<=21){
                System.out.println("Oglak Burcu");
            }else if(day>=22&&day<=31){
                System.out.println("Kova BUrcu");
            }else{
                System.out.println("Hatali Gun Girdiniz ...");
            }
        }
        else if(month==2){
            if(day>=1&&day<=20){
                System.out.println("Kova Burcu");

            }else if (day>=21&&day<=31){
                System.out.println("Balik Burcu");
            }else{
                System.out.println("Hatali Gun Girdiniz ...");
            }

        }
        else if(month==3){
            if (day>=1&&day<=20){
                System.out.println("Balik ");
            }else if(day>=21&&day<=31){
                System.out.println("Koc Burcu");
            }
            else{
                System.out.println("Hatali Gun Girdiniz ...");
            }
        }
        else if(month==4){
           if(day>=1&&day<=20){
               System.out.println("Koc Burcu");
           }else if(day>=21&&day<=31){
               System.out.println("Boga Burcu");
           }else{
               System.out.println("Hatali Gun Girdiniz ...");
           }
        }
        else if(month==5){
            if (day>=1&&day<=21){
                System.out.println("Boga Burcu");
            }else if(day>=22&&day<=31){
                System.out.println("Ikizler Burcu");
            }else{
                System.out.println("Hatali Gun Girdiniz ...");
            }
        }
        else if(month==6){
            if (day>=1&&day<=22){
                System.out.println("Ikizler Burcu");
            }else if(day>=23&&day<=31){
                System.out.println("Yengec Burcu");
            }else{
                System.out.println("Hatali Gun Girdiniz ...");
            }
        }
        else if(month==7){
            if (day>=1&&day<=22){
                System.out.println("Yengec Burcu");
            }else if(day>=23&&day<=31){
                System.out.println("Aslan Burcu");
            }else{
                System.out.println("Hatali Gun Girdiniz ...");
            }
        }
        else if(month==8){
            if(day>=1&&day<=22){
                System.out.println("Aslan Burcu");
            }else if (day>=23&&day<=31){
                System.out.println("Basak Burcu");
            }else{
                System.out.println("Hatali Gun Girdiniz ...");
            }
        }
        else if(month==9){
            if(day>=1&&day<=22){
                System.out.println("Basak Burcu");
            }else if(day>=23&&day<=31){
                System.out.println("Terazi Burcu");
            }else{
                System.out.println("Hatali Gun Girdiniz ...");
            }
        }
        else if(month==10){
            if (day>=1&&day<=22){
                System.out.println("Terazi Burcu");
            }else if (day>=23&&day<=31){
                System.out.println("Akrep Burcu");
            }else{
                System.out.println("Hatali Gun Girdiniz ...");
            }
        }
        else if(month==11){
            if (day>=1&&day<=21){
                System.out.println("Akrep Burcu");
            }else if (day>=22&&day<=31){
                System.out.println("Yay Burcu");
            }else{
                System.out.println("Hatali Gun Girdiniz ...");
            }
        }
        else if(month==12)
            if (day>=1&&day<=21){
                System.out.println("Yay Burcu");
            }else if (day>=22&&day<=31){
                System.out.println("Oglak Burcu");
            }
            else{
                System.out.println("Hatali Gun Girdiniz ...");
            }

        }else{
            System.out.println("Hatali Ay Girdiniz ...");
        }
    }
}
