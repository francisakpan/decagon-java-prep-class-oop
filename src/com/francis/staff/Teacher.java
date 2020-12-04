package com.francis.staff;

public class Teacher extends Staff{
    private boolean teach = true;

    public Teacher(String idColor, boolean parkingSpace) {
        super(idColor, parkingSpace);
    }

    @Override
    public String getIdColor() {
        return "Blue";
    }

    @Override
    public boolean canAdmitStudent() {
        return false;
    }

    @Override
    public String role() {
        return "Teacher";
    }
    public boolean isTeach() {
        return teach;
    }

    public void setTeach(boolean teach) {
        this.teach = teach;
    }
}
