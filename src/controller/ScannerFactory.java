/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ScannerFactory {
    
    private Scanner SCANNER;
    
    public Scanner getScanner(){
        if(SCANNER == null){
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }
}
