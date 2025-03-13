package ua.org.nmu.dmelnikov.lab_3.controller;

import ua.org.nmu.dmelnikov.lab_3.model.Department;
import ua.org.nmu.dmelnikov.lab_3.model.Human;

public class DepartmentCreator {
    public static Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}
