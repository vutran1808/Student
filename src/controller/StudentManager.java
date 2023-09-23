/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.School;
import model.Student;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class StudentManager extends Menu {

    School school = new School();
    ScannerFactory sc = new ScannerFactory();

    public StudentManager() {
        super("Student Manager", new String[]{"Create Student", "Find and Sort", "Update/Delete", "Report", "Exit"});
        Student student1 = new Student("1", "Vu", "Java");
        Student student2 = new Student("2", "Long", ".Net");
        Student student3 = new Student("2", "Long", ".Net");                       
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

    }

    public void CreateStudent() {
        System.out.println("Enter Student ID:");
        String id = sc.getScanner().nextLine();
        System.out.println("Enter Student Name");
        String name = sc.getScanner().nextLine();
        System.out.println("Enter courses");
        System.out.println("(Java - .Net - C/C++)");
        String course = sc.getScanner().nextLine();
        Student student = new Student(id, name, course);
        if (school.showAll().size() > 10) {
            System.out.println("Do you want to continute(Y/N) ?");
            String input = sc.getScanner().nextLine();
            switch (input) {
                case "Y" -> {
                    school.addStudent(student);
                    System.out.println("Succesfull");
                }
                case "N" -> {
                }
            }
        } else {
            school.checkStudent(student);
        }
    }

    public void Find() {
        System.out.println("Enter student Name");
        String name = sc.getScanner().nextLine();
        school.filterStudent(school.sameName(name)).forEach(student -> {
            System.out.println(student.toString());
        });
    }

    public void Sort() {
        System.out.println("After sorted");
        school.sortByName();
        school.showAll();
    }

    public void deleteStudent() {
        System.out.println("Enter student ID");
        String id = sc.getScanner().nextLine();
        school.filterStudent(school.sameID(id)).forEach(student -> {
            System.out.println(student.toString());
        });
        System.out.println("Do you want to update(U) or delete(D) student");
        String input = sc.getScanner().nextLine();
        switch (input) {
            case "U" -> {
                System.out.println("Enter the new course");
                String course = sc.getScanner().nextLine();
                school.updateInfo(id, course);
                System.out.println("Updated");
            }
            case "D" -> {
                school.deleteByID(school.sameID(id));
                System.out.println("Deleted");
            }
        }
    }

    public void report() {
        school.showAll().forEach(student -> {
            System.out.println(student.toString());
        });
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 ->
                CreateStudent();
            case 2 -> {
                Find();
                Sort();
            }
            case 3 ->
                deleteStudent();
            case 4 ->
                report();
        }
    }
}
