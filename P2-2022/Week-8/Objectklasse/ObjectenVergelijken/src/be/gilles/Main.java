package be.gilles;

public class Main {


    public static void main(String[] args) {

        Student student1 = new Student("Kris", 1234);
        Student student2 = new Student("Kris", 1234);

        int a = student1.hashCode();
        int b = student2.hashCode();

        if (a == b || student1.equals(student2)) {

            System.out.println("De studenten zijn gelijk");

        } else {

            System.out.println("De studenten zijn niet gelijk");

        }

    }

}