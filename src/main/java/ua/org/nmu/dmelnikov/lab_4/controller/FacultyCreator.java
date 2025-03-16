package ua.org.nmu.dmelnikov.lab_4.controller;

import ua.org.nmu.dmelnikov.lab_4.model.Faculty;
import ua.org.nmu.dmelnikov.lab_4.model.Human;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
