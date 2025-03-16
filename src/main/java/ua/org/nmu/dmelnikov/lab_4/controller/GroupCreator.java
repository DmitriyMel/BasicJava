package ua.org.nmu.dmelnikov.lab_4.controller;

import ua.org.nmu.dmelnikov.lab_4.model.Group;
import ua.org.nmu.dmelnikov.lab_4.model.GroupHead;
import ua.org.nmu.dmelnikov.lab_4.model.Student;

import java.util.List;

public class GroupCreator {
    public static Group createGroup(String name, GroupHead head, List<Student> studentList) {
        return new Group(name, head, studentList);
    }
}
