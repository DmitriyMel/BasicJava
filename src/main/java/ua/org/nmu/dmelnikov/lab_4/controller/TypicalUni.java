package ua.org.nmu.dmelnikov.lab_4.controller;


import ua.org.nmu.dmelnikov.lab_4.model.*;

public class TypicalUni {


    public static void createUniversity() {
        Rector rector = new Rector("Павло", "Зібров", "Миколайович", Sex.Male);
        University university = UniCreator.createUniversity("NTU DP", rector);

        Dean dean = new Dean("Ольга", "Полякова", "Юріївна", Sex.Female);
        Faculty faculty = FacultyCreator.createFaculty("FIT", dean);

        DepartmentHead departmentHead =
                new DepartmentHead("Софія", "Ротару", "Михайлівна", Sex.Female);
        Department department = DepartmentCreator.createDepartment("PZKS", departmentHead);

        GroupHead groupHead =
                new GroupHead("Олег", "Винник", "Анатолійович", Sex.Male);
        Group group = GroupCreator.createGroup("121-21-1",groupHead);

        Student student = StudentCreator.
                createStudent("Віктор", "Павлік", "Франкович", Sex.Male);

        System.out.println("University successfully created!");
    }
}
