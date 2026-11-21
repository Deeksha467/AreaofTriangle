package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Double areaoftriangle(int b,int h){
        Double area;
        area=0.5*b*h;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner();
        int b,h;
        System.out.println("Enter base:");
        b=sc.nextInt();
        System.out.println("Enter height: ");
        h=sc.nextInt();
        Double area;
        area=areaoftriangle(b,h);
        System.out.println("Area of triangle: "+area);
    }
}