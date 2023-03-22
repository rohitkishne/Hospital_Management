package com.example.Hospital_Management_System;

public class Doctor {
    private int doctorId;
    private String doctorName;
    private int doctorAge;
    private String expertise;
    private String degree;

    public Doctor(int doctorId, String doctorName, int doctorAge, String expertise, String degree) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorAge = doctorAge;
        this.expertise = expertise;
        this.degree = degree;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(int doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
