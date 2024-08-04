package org.example;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {

        Student[] students = {
                new Student(110001, "Dave", "11/18/1951"),
                new Student(110002, "Anna", "12/07/1990"),
                new Student(110003, "Erica", "01/31/1974"),
                new Student(110003, "Carlos", "08/22/2009"),
                new Student(110003, "Bob", "08/05/1994")
        };

        printListOfStudents(students);

        List<Student> platinumAlumni = getListOfPlatinumAlumniStudents(students);

        System.out.println("\nPlatinum Alumni Students:");
        for (Student student : platinumAlumni) {
            System.out.println(student);
        }

    }

    public static void printListOfStudents(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Student> platinumAlumni = new ArrayList<>();

        for (Student student : students) {
            if (currentYear - student.getAdmissionYear() >= 30) {
                platinumAlumni.add(student);
            }
        }

        platinumAlumni.sort((s1, s2) -> Integer.compare(s2.getAdmissionYear(), s1.getAdmissionYear()));
        return platinumAlumni;
    }
}