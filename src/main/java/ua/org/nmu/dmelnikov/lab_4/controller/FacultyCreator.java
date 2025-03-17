package ua.org.nmu.dmelnikov.lab_4.controller;

import ua.org.nmu.dmelnikov.lab_4.model.Dean;
import ua.org.nmu.dmelnikov.lab_4.model.Department;
import ua.org.nmu.dmelnikov.lab_4.model.Faculty;

import java.util.List;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Dean head, List<Department> departmentList) {
        return new Faculty(name, head, departmentList);
    }
}
