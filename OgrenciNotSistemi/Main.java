package OgrenciNotSistemi;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Inek saban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,45,40);
        s1.addBulkSozluNote(80,70,35);
        s1.isPass();

        Student s2 = new Student("Gudukk Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,20,40);
        s2.addBulkSozluNote(25,90,40);
        s2.isPass();

        Student s3 = new Student("Hayta Ismail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(100,80,40);
        s3.addBulkSozluNote(20,45,100);
        s3.isPass(); 
    }
}