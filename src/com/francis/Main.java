package com.francis;

import com.francis.staff.*;

public class Main {

    public static void main(String[] args) {
        Staff staff = new Staff("green", true);
        System.out.println(staff.getIdColor());
        staff.setIdColor("brown");
        System.out.println(staff.getIdColor());

        Principal principal = new Principal("blue", true);
        principal.setIdColor("red");
        System.out.println(principal.getIdColor());
        System.out.println(principal.getClass().getSimpleName());

        Teacher teacher = new Teacher("green", false);
        System.out.println(teacher.getIdColor());

        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff("Orange");
//        System.out.println(nonAcademicStaff.);

        String francis = "Francis";
        System.out.println(francis.getClass().getSimpleName());

        Car car = new Car(new Engine());
    }
}
