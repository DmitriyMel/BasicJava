package ua.org.nmu.dmelnikov.lab_4.controller;

import ua.org.nmu.dmelnikov.lab_4.model.Group;
import ua.org.nmu.dmelnikov.lab_4.model.Human;

public class GroupCreator {
    public static Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
}
