package ua.org.nmu.dmelnikov.lab_4.model;

import java.util.List;

public class Faculty {
    private String name;
    private Dean head;
    private List<Department> departmentList;

    public Faculty(String name, Dean head, List<Department> departmentList) {
        this.name = name;
        this.head = head;
        this.departmentList = departmentList;
    }

}
