package controller;

import model.University;
import model.Human;
public class UniCreator {

    public static University createUniversity(String name ,Human head) {
        return new University(name, head);
    }
}
