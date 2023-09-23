/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author ASUS
 */
public class Student {
//    ID, Student Name, Semester, Course Name

    private String id;
    private String name;
    private String semester;
    private String course;
    private Map<String, Integer> totalCouse = new TreeMap<>();

    ;

    public Student() {
    }

    public Student(String id, String name, String semester, String course) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
//
//    public void addCourse(String course) {
//        if (totalCouse.containsKey(course)) {
//            int count = totalCouse.get(course) + 1;
//            totalCouse.put(course, count);
//        } else {
//            totalCouse.put(course, 1);
//        }
//    }
//    
//    public int getTotalCourse(){
//        return totalCouse.size();
//    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", semester=" + semester + ", course=" + course + '}';
    }

}
