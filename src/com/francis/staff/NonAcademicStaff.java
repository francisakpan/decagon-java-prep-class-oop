package com.francis.staff;

public class NonAcademicStaff extends Staff{

    public NonAcademicStaff(String idColor, boolean parkingSpace) {
        super(idColor, parkingSpace);
    }

    public NonAcademicStaff(String idColor){
        this(idColor, false);
    }
}
