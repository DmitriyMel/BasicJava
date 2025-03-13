package ua.org.nmu.dmelnikov.lab_3.controller;

import ua.org.nmu.dmelnikov.lab_3.model.Sex;
import ua.org.nmu.dmelnikov.lab_3.model.Student;

public class StudentCreator {
    public static Student createStudent(String firstName, String lastName, String middleName, Sex sex) {
        return new Student(firstName, lastName, middleName, sex);
    }
}
