package Hashmap;

public class main {
    public static void main(String[] args) {

        GradeBook gb = new GradeBook();

        Student s1 = new Student("101", "Sofia");
        Student s2 = new Student("102", "Ivan");

        s1.addGrade(90);
        s1.addGrade(100);

        s2.addGrade(75);
        s2.addGrade(82);

        gb.addStudent(s1);
        gb.addStudent(s2);

        System.out.println("All students:");
        gb.printAllStudents();

        System.out.println("\nSearch student with ID 101:");
        System.out.println(gb.findStudent("101"));

        gb.removeStudent("102");

        System.out.println("\nAfter removing ID 102:");
        gb.printAllStudents();
    }
}
