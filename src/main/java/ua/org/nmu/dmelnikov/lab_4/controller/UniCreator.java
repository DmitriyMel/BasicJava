package ua.org.nmu.dmelnikov.lab_4.controller;

import ua.org.nmu.dmelnikov.lab_4.model.University;
import ua.org.nmu.dmelnikov.lab_4.model.Human;
public class UniCreator {

    public static University createUniversity(String name ,Human head) {
        return new University(name, head);
    }
}
