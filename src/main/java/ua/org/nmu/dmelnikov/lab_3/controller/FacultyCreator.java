package ua.org.nmu.dmelnikov.lab_3.controller;

import ua.org.nmu.dmelnikov.lab_3.model.Faculty;
import ua.org.nmu.dmelnikov.lab_3.model.Human;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
