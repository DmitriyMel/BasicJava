package ua.org.nmu.dmelnikov.lab_4.controller;

import ua.org.nmu.dmelnikov.lab_4.model.Department;
import ua.org.nmu.dmelnikov.lab_4.model.Human;

public class DepartmentCreator {
    public static Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}
