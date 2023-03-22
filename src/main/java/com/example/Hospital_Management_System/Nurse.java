package com.example.Hospital_Management_System;

public class Nurse {
    private int nurseId;
    private String nurseName;
    private int nurseAge;
    private String qualification;
    private String department;

    public Nurse(int nurseId, String nurseName, int nurseAge, String qualification, String department) {
        this.nurseId = nurseId;
        this.nurseName = nurseName;
        this.nurseAge = nurseAge;
        this.qualification = qualification;
        this.department = department;
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public int getNurseAge() {
        return nurseAge;
    }

    public void setNurseAge(int nurseAge) {
        this.nurseAge = nurseAge;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
