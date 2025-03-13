package ua.org.nmu.dmelnikov.lab_3.controller;

import ua.org.nmu.dmelnikov.lab_3.model.Group;
import ua.org.nmu.dmelnikov.lab_3.model.Human;

public class GroupCreator {
    public static Group createGroup(String name, Human head) {
        return new Group(name, head);
    }
}
