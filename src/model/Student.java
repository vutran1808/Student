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

    private String id;
    private String name;
    private String course;
    private Map<String, Integer> totalCouse = new TreeMap<>();

    ;

    public Student() {
    }

    public Student(String id, String name, String course) {
        this.id = id;
        this.name = name;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void getTotal(String course){
        if(this.totalCouse.containsKey(course)){
            int count = totalCouse.get(course) + 1;
            totalCouse.put(course, count);
        }else {
            totalCouse.put(course, 1);
        }
    }
    
    public String printCourse(String course){
        return ", Course: " + course + ", Total Courses: " + totalCouse.get(course);
    }
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + printCourse(course) + '}';
    }

}
