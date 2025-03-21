package ua.org.nmu.dmelnikov.lab_4.controller;


import ua.org.nmu.dmelnikov.lab_4.model.*;

import java.util.ArrayList;
import java.util.List;

public class TypicalUni {


    public static void createUniversity() {
        Rector rector = new Rector("Павло", "Зібров", "Миколайович", Sex.Male);
        List<Faculty> faculties = new ArrayList<>();
        University university = UniCreator.createUniversity("NTU DP", rector, faculties);

        Dean dean = new Dean("Ольга", "Полякова", "Юріївна", Sex.Female);
        List<Department> departments = new ArrayList<>();
        Faculty faculty = FacultyCreator.createFaculty("FIT", dean, departments);
        faculties.add(faculty);

        DepartmentHead departmentHead = new DepartmentHead("Софія", "Ротару", "Михайлівна", Sex.Female);
        List<Group> groups = new ArrayList<>();
        Department department = DepartmentCreator.createDepartment("PZKS", departmentHead, groups);
        departments.add(department);

        GroupHead groupHead = new GroupHead("Олег", "Винник", "Анатолійович", Sex.Male);
        List<Student> students = new ArrayList<>();
        Group group = GroupCreator.createGroup("121-21-1", groupHead, students);
        groups.add(group);

        Student student = StudentCreator.createStudent("Віктор", "Павлік", "Франкович", Sex.Male);
        students.add(student);

        System.out.println(university + " successfully created!");
    }
}
