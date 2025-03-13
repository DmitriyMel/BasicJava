package ua.org.nmu.dmelnikov.lab_3.controller;

import ua.org.nmu.dmelnikov.lab_3.model.University;
import ua.org.nmu.dmelnikov.lab_3.model.Human;
public class UniCreator {

    public static University createUniversity(String name ,Human head) {
        return new University(name, head);
    }
}
