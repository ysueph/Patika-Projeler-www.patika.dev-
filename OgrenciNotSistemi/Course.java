package OgrenciNotSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    double sozluEtki;
	double noteEtki;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu=0;
        this.sozluEtki=sozluEtki;
		notlarEtki();
    }
    
public void notlarEtki() {
		
	noteEtki=(1.0 - sozluEtki);
		
		
		
	}
    

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Islem basarili");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamistir.");
        }
    }
}
