package Hashmap;

import java.util.HashMap;

public class GradeBook {

    private HashMap<String, Student> students;

    public GradeBook() {
        students = new HashMap<>();
    }

    public void addStudent(Student s) {
        students.put(s.getId(), s);
    }

    public void removeStudent(String id) {
        students.remove(id);
    }

    public Student findStudent(String id) {
        return students.get(id);
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("GradeBook is empty.");
            return;
        }
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }
}
