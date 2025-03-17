package lab_5;

import lab_5.db.StudentDAO;
import lab_5.model.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int JANUARY = 1;
    private static final int DECEMBER = 12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month (" + JANUARY + "-" + DECEMBER + "):");

        int month = sc.nextInt();
        if (month < JANUARY || month > DECEMBER)
            System.out.println("Invalid month");

        List<Student> students = StudentDAO.getStudentsByMonth(month);

        if (students.isEmpty()) {
            System.out.println("No students found");
        } else {
            System.out.println("Students born in month " + month + ":");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}