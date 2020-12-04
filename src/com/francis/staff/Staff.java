package com.francis.staff;

public class Staff {
    private String idColor;
    private boolean parkingSpace;
    private int salary;

    public Staff(String idColor, boolean parkingSpace){
        this.idColor = idColor;
        this.parkingSpace = parkingSpace;
    }

    public String getIdColor() {
        return idColor;
    }

    public void setIdColor(String idColor) {
        this.idColor = idColor;
    }

    public String role(){
        return "null";
    }

    public boolean canAdmitStudent(){
        return false;
    }
}
