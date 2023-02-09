package projeler;

import java.util.Arrays;


public class diziCiftSayiSiralama{
    static boolean isFind(int[]arr ,int deger){
        for(int i: arr){
            if(i==deger){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int []list={8,6,6,2,75,6,3,6,9,84,84,1,1,75,56,2};

        int[]tekrar=new int[list.length];
        int bas  =0;
        for(int i=0;i< list.length;i++) {
            for (int j = 0; j < list.length; j++){
                if(i!=j  &&  (list[i]==list[j])){
                    if(!isFind(tekrar,list[i])){
                    	tekrar[bas++]=list[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(list));
        System.out.print("Tekrar eden cift sayilar : ");
        for(int deger:tekrar){
            if(deger!=0 && deger%2 == 0 ){
                System.out.print(deger+" ");
            }
        }
    }
}
