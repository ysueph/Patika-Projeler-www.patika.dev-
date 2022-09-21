package MaasHesaplama;

public class Calisan {
		String name;
		int maas;
		int CalismaSaat;
		int BaslangicYili;

	    public Calisan(String name, int maas, int CalismaSaat, int BaslangicYili) {
	        this.name = name;
	        this.maas = maas;
	        this.CalismaSaat = CalismaSaat;
	        this.BaslangicYili = BaslangicYili;
	    }
	    
	    public double tax() {
	    	  if (this.maas < 1000){
	              return this.maas;
	          }else {
	              double vergi = this.maas * 0.03;
	              return vergi;
	          }
	    }
	    
	    public int bonus() {
	    	int ek=0;
	    	if(this.CalismaSaat>40) {
	    	 ek = (this.CalismaSaat-40)*30;
	    	}
	    	   return ek;
	    }
	    
	    public double raiseSalary() {
	    	 if (this.BaslangicYili<=0 || this.BaslangicYili>2021){
	             System.out.println("gecersiz yil");

	         }else {
	             int farkYil = 2021 - this.BaslangicYili;
	             double zam;

	             if (farkYil>0 &&farkYil < 10){
	                 zam = this.maas * 0.05;
	                 return zam;
	             }else if (farkYil>9 && farkYil<20){
	                 zam = this.maas * 0.1;
	                 return zam;
	             }else if (farkYil>19){
	                 zam =this.maas * 0.15;
	                 return  zam;
	             }else if (farkYil == 0 ){
	                 return 0;
	             }
	         }

	         return 0;
	     }
	    
	    public void yaz(){ 

	        double total = this.maas - this.tax() + this.raiseSalary()+this.bonus();
	        double tot = this.maas +this.bonus() - this.tax();
	        System.out.println("Adi : "+name);
	        System.out.println("Maasi : "+  this.maas);
	        System.out.println("calisma Saati : "+ this.CalismaSaat);
	        System.out.println("baslangic yili : "+ this.BaslangicYili);
	        System.out.println("Vergi : "+this.tax());
	        System.out.println("Bonus : "+this.bonus());
	        System.out.println("maas artisi : "+this.raiseSalary());
	        System.out.println("Vergi ve Bonuslar ile birlikte maas : "+tot);
	        System.out.println("Toplam Maas : "+total);


	    }
	    

}