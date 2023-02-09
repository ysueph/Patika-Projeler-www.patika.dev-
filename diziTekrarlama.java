package projeler;

public class diziTekrarlama {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] list2 = new int[list.length];
        
        
        System.out.println("Dizi : [10, 20, 20, 10, 10, 20, 5, 20]");
        System.out.println("");
        System.out.println("Tekrar sayilari");
        System.out.println("---------------");
        
        
        int startIndex = 0;
        int sayac = 1;

        for (int i = 0; i < list.length; i++) {
            if (isFind(list2, list[i])) {
                for (int j = 0; j < list.length; j++) {
                    if ((i != j) && list[i] == list[j]) {
                    	sayac++;
                    }
                }
            }
            
            
            if (isFind(list2, list[i])) {
                list2[startIndex++] = list[i];
                    System.out.println(list[i] + " sayi " + sayac + " kere tekrar edildi.");
            }
            sayac = 1;
        }
    }
}