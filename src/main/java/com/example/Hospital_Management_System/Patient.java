package com.example.Hospital_Management_System;

public class Patient {
    private int PatientId;
    private String patientName;
    private int patientAge;
    private String diseaseName;

    public Patient(int patientId, String patientName, int patientAge, String diseaseName) {
        this.PatientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.diseaseName = diseaseName;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int patientId) {
        PatientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
}
