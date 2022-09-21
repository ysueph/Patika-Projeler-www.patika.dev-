package OgrenciNotSistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    
    public void addBulkSozluNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.sozlu = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozlu = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozlu = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note==0 || this.fizik.note == 0 || this.kimya.note == 0 || 
				 this.mat.sozlu==0 || this.fizik.sozlu == 0 || this.kimya.sozlu == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi gecti. ");
            } else {
                System.out.println("Sinifta kaldi.");
            }
        }
    }

    public void calcAvarage() {
    	double matNot=(this.mat.note * this.mat.noteEtki)+(this.mat.sozlu * this.mat.sozluEtki);
        double fizikNot=(this.fizik.note * this.fizik.noteEtki)+(this.fizik.sozlu * this.fizik.sozluEtki);
        double kimyaNot=(this.kimya.note * this.kimya.noteEtki)+(this.kimya.sozlu *  this.kimya.sozluEtki);

	 this.avarage = (matNot+fizikNot+kimyaNot) / 3;
    }

    
    
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Sinav Notu : " + this.mat.note);
        System.out.println("Matematik Sozlu Notu : " + this.mat.sozlu +"\n");
        
      
        System.out.println("Fizik Sinav Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlu Notu : " + this.fizik.sozlu+"\n");
      
        
        System.out.println("Kimya Sinav Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu Notu : " + this.kimya.sozlu+"\n");
    }

}
