/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import model.Student;

/**
 *
 * @author ASUS
 */
public class School {

    private final List<Student> studentlists;

    public School() {
        studentlists = new ArrayList<>();
    }

    public List<Student> showAll() {
        return this.studentlists;
    }

    public void addStudent(Student student) {
        this.studentlists.add(student);
    }

//    public void checkStudent(Student student) {
//        for (Student std : studentlists) {
//            if (std.getId().equals(student.getId()) && std.getName().equals(student.getName())) {
//                std.addCourse(student.getCourse());
//            } else {
//                addStudent(student);
//            }
//        }
//    }

    public Predicate<Student> sameName(String name) {
        return student -> student.getName().equalsIgnoreCase(name);
    }

    public Predicate<Student> sameID(String id) {
        return student -> student.getId().equalsIgnoreCase(id);
    }

    public List<Student> filterStudent(Predicate<Student> predicate) {
        return studentlists.stream().filter(predicate).collect(Collectors.<Student>toList());
    }

    public void sortByName() {
        Collections.sort(studentlists, Comparator.comparing(Student::getName));
    }

    public boolean deleteByID(Predicate<Student> predicate) {
        return studentlists.removeIf(predicate);
    }

    public boolean updateInfo(String id, String content) {
        return studentlists.stream().filter(sameID(id))
                .peek(student -> student.setCourse(content))
                .findFirst()
                .isPresent();
    }

}
