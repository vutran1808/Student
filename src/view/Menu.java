/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ScannerFactory;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public abstract class Menu<T> {

    private String title;
    private ArrayList choices;

    public Menu(String td, String[] arr) {
        this.title = td;
        choices = new ArrayList<>();
        for (String s : arr) {
            choices.add((T) s);
        }
    }

    public void display() {
        System.out.println(title);
        System.out.println("------------------");
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + "." + choices.get(i));
        }
        System.out.println("------------------");
    }

    public int getSelect() {
        ScannerFactory sc = new ScannerFactory();
        display();
        return Integer.parseInt(sc.getScanner().nextLine());
    }

    public abstract void execute(int n);

    public void run() {

        while (true) {
            int n = getSelect();
            execute(n);
            if (n > choices.size()) {
                break;
            }
        }
    }
}
