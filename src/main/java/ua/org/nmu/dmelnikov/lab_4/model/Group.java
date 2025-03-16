package ua.org.nmu.dmelnikov.lab_4.model;

import java.util.List;

public class Group {
    private String name;
    private GroupHead head;
    private List<Student> studentList;

    public Group(String name, GroupHead head, List<Student> studentList) {
        this.name = name;
        this.head = head;
        this.studentList = studentList;
    }

}
