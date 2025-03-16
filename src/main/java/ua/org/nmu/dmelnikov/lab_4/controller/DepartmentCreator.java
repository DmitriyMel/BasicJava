package ua.org.nmu.dmelnikov.lab_4.controller;

import ua.org.nmu.dmelnikov.lab_4.model.Department;
import ua.org.nmu.dmelnikov.lab_4.model.DepartmentHead;
import ua.org.nmu.dmelnikov.lab_4.model.Group;

import java.util.List;

public class DepartmentCreator {
    public static Department createDepartment(String name, DepartmentHead head, List<Group> groupList) {
        return new Department(name, head, groupList);
    }
}
