package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Double areaoftriangle(int b,int h){
        if(b==0 || h==0){
            System.out.println("Base or height can not be zero");
            return 0;
        }
        Double area;
        area=0.5*b*h;
        return area;
    }
    public static void main(String[] args) {
        int b,h;
        b=5;
        h=10;
        Double area;
        area=areaoftriangle(b,h);
        System.out.println("Area of triangle: "+area);
    }
}
