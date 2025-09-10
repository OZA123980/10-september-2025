package UHTest;

public class TeacherTest {
    public static void main(String[] args) {
        // Object Teacher
        Teacher t1 = new Teacher("Koding Dan Ai", "Pak Andik", 5000000, 40);
        Teacher t2 = new Teacher("IPAS", "Bu Santi", 4500000, 30);
        Teacher t3 = new Teacher("PJOK", "Pak Doni", 6000000, 29);

        System.out.println("=== Data Guru ===");
        t1.print();
        System.out.println("----------------");
        t2.print();
        System.out.println("----------------");
        t3.print();
    }
}
