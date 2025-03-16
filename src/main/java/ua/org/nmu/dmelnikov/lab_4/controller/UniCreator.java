package ua.org.nmu.dmelnikov.lab_4.controller;

import ua.org.nmu.dmelnikov.lab_4.model.Faculty;
import ua.org.nmu.dmelnikov.lab_4.model.Rector;
import ua.org.nmu.dmelnikov.lab_4.model.University;

import java.util.List;

public class UniCreator {

    public static University createUniversity(String name, Rector head, List<Faculty> facultyList) {
        return new University(name, head, facultyList);
    }
}
