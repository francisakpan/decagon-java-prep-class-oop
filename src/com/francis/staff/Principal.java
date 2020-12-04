package com.francis.staff;

public class Principal extends Staff {

    public Principal(String idColor, boolean parkingSpace) {
        super(idColor, parkingSpace);
    }

    @Override
    public String getIdColor() {
        return "Black";
    }

    @Override
    public String role() {
        return "Principal";
    }

    @Override
    public boolean canAdmitStudent() {
        return true;
    }
}
