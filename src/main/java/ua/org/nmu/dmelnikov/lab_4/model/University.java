package ua.org.nmu.dmelnikov.lab_4.model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {
    @Expose
    private String name;
    @Expose
    private Rector head;
    @Expose
    private List<Faculty> facultyList;

    public University(String name, Rector head, List<Faculty> facultyList) {
        this.name = name;
        this.head = head;
        this.facultyList = new ArrayList<>();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Check if both references are the same
        if (obj == null || getClass() != obj.getClass()) return false;

        University that = (University) obj;
        return Objects.equals(name, that.name) && Objects.equals(head, that.head);
    }

    // Override hashCode() to ensure consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, head);
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", head=" + head +
                '}';
    }
}
