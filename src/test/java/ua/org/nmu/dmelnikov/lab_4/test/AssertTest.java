package ua.org.nmu.dmelnikov.lab_4.test;

import org.junit.Test;
import ua.org.nmu.dmelnikov.lab_4.misc.JSONManager;
import ua.org.nmu.dmelnikov.lab_4.controller.*;
import ua.org.nmu.dmelnikov.lab_4.model.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AssertTest {
    @Test
    public void testUniversityJsonConvertion() {
        Rector rector = new Rector("Павло", "Зібров", "Миколайович", Sex.Male);
        List<Faculty> facultyList = new ArrayList<>();

        University oldUniversity = UniCreator.createUniversity("NTU DP", rector, facultyList);

        Dean deanOfFIT = new Dean("Ольга", "Полякова", "Юріївна", Sex.Female);
        Dean deanOfMath = new Dean("Дмитро", "Коляденко", "Валерійович", Sex.Male);
        List<Department> departments = new ArrayList<>();

        Faculty facultyFIT = FacultyCreator.createFaculty("FIT", deanOfFIT, departments);
        Faculty facultyMath = FacultyCreator.createFaculty("Math", deanOfMath, departments);
        facultyList.add(facultyFIT);
        facultyList.add(facultyMath);

        DepartmentHead headOfPZKSDepartment = new DepartmentHead("Софія", "Ротару",
                "Михайлівна", Sex.Female);
        DepartmentHead headOfSAUDepartment = new DepartmentHead("Святослав", "Вакарчук",
                "Іванович", Sex.Male);
        List<Group> groups = new ArrayList<>();

        Department departmentPZKS = DepartmentCreator.createDepartment("PZKS", headOfPZKSDepartment, groups);
        Department departmentSAU = DepartmentCreator.createDepartment("SAU", headOfSAUDepartment, groups);
        departments.add(departmentPZKS);
        departments.add(departmentSAU);

        GroupHead headOfGroup1 = new GroupHead("Олег", "Винник", "Анатолійович", Sex.Male);
        GroupHead headOfGroup2 = new GroupHead("Наталія", "Могилевська",
                "Олексіївна", Sex.Female);
        List<Student> students = new ArrayList<>();

        Group group1 = GroupCreator.createGroup("121-21-1", headOfGroup1, students);
        Group group2 = GroupCreator.createGroup("122-21-2", headOfGroup2, students);
        groups.add(group1);
        groups.add(group2);

        Student firstStudent = StudentCreator.createStudent("Віктор", "Павлік",
                "Франкович", Sex.Male);
        Student secondStudent = StudentCreator.createStudent("Ірина", "Білик",
                "Миколайївна", Sex.Female);
        students.add(firstStudent);
        students.add(secondStudent);

        JSONManager.writeUniversityToFile(oldUniversity, "university.json");
        University newUniversity = JSONManager.readUniversityFromFile("university.json");

        System.out.println("Old University: " + oldUniversity);
        System.out.println("New University: " + newUniversity);

        assertEquals(oldUniversity, newUniversity);
    }
}
