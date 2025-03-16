package ua.org.nmu.dmelnikov.lab_4.model;

import java.util.List;

public class Department {
    private String name;
    private DepartmentHead head;
    private List<Group> groupList;

    public Department(String name, DepartmentHead head, List<Group> groupList) {
        this.name = name;
        this.head = head;
        this.groupList = groupList;
    }

}
