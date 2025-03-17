package ua.org.nmu.dmelnikov.lab_5.model;

import java.sql.Date;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthDate;
    private String studentCard;
    private Sex sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(String studentCard) {
        this.studentCard = studentCard;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Student(int id, String firstName, String lastName, String middleName, Date birthDate, String studentCard,
                   Sex sex) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.studentCard = studentCard;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + "\n" +
                "Name: " + firstName + " " + lastName + " " + middleName + "\n" +
                "Birth Date: " + birthDate.toString() + "\n" +
                "Student Card: " + studentCard + "\n" +
                "Sex: " + sex + "\n";
    }
}
