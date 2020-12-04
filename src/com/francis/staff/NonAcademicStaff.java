package com.francis.staff;

public class NonAcademicStaff extends Staff{

    public NonAcademicStaff(String idColor, boolean parkingSpace) {
        super(idColor, parkingSpace);
    }

    public NonAcademicStaff(String idColor){
        this(idColor, false);
    }

    @Override
    public boolean canAdmitStudent() {
        return false;
    }

    @Override
    public String role() {
        return "Non-academic staff";
    }
}
