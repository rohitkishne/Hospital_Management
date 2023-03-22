package com.example.Hospital_Management_System;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {
    HashMap<Integer, Patient> patientDB = new HashMap<>();
    @PostMapping("/addPatientViaParameter")
    public String addPatient(@RequestParam("patientId")Integer patientId, @RequestParam("patientName")String patientName,
                           @RequestParam("patientAge")Integer patientAge, @RequestParam("diseaseName")String diseaseName)
    {
        Patient patient = new Patient(patientId,patientName,patientAge,diseaseName);
        int key = patient.getPatientId();
        patientDB.put(key, patient);
        return "Patient added Successfully";
    }


    @PostMapping("/addPatientViaBody")
    public String addPatient(@RequestBody Patient patient)
    {
        int key = patient.getPatientId();
        patientDB.put(key,patient);
        return "Patient added successfully via body";
    }

    @GetMapping("/getPatientInfo")
    public Patient getPatientInfo(@RequestParam("patientId")Integer patientId)
    {
        Patient patient = patientDB.get(patientId);
        return patient;
    }

    @GetMapping("/getAllPatientDetails")
    public List<Patient> getAllPatient()
    {
        List<Patient> detail = new ArrayList<>();
        for(Patient patient : patientDB.values())
        {
            detail.add(patient);
        }
        return detail;

    }
    @GetMapping("/getAllPatientByName")
    public List<Patient> getAllPatientByName(@RequestParam("patientName")String patientName)
    {
        List<Patient> detail = new ArrayList<>();
        for(Patient patient : patientDB.values())
        {
            if(patient.getPatientName().equals(patientName))
            {
                detail.add(patient);
            }
        }
        return detail;

    }
    @GetMapping("/getAllPatientGreaterthanAge")
    public List<Patient> getAllPatientByAge(@RequestParam("patientAge")Integer patientAge)
    {
        List<Patient> detail = new ArrayList<>();
        for(Patient patient : patientDB.values())
        {
            if(patient.getPatientAge()>patientAge)
            {
                detail.add(patient);
            }
        }
        return detail;

    }
    // understanding API's endpoints with Path Variable
    @GetMapping("/getAllPatientGreaterAge/{patientId}")
    public Patient getAllPatientByAges(@PathVariable("patientId") Integer patientId)
    {
        Patient patient = patientDB.get(patientId);
        return patient;
    }

    @GetMapping("/getPatientByAgeAndDisease/{patientAge}/{diseaseName}")
    public List<Patient> getPatientList(@PathVariable("patientAge") Integer patientAge, @PathVariable("diseaseName") String diseaseName)
    {
        List<Patient> patient = new ArrayList<>();
        for(Patient p : patientDB.values())
        {
            if(p.getPatientAge()>patientAge && p.getDiseaseName().equals(diseaseName))
            {
                System.out.println("Hello");
                patient.add(p);
            }
        }
        return patient;
    }

    //updated API
    @PutMapping("/updateDetails")
    public String updateDetails(@RequestBody Patient patient)
    {
        int key = patient.getPatientId();
        if(patientDB.containsKey(key))
        {
            patientDB.put(key, patient);
            return "Successfully Updated";
        }
        return "Patient does not exist";
    }

    @PutMapping("/updateDisease")
    public String updateDisease(@RequestParam("patientId")Integer patientId, @RequestParam("diseaseName")String diseaseName)
    {
        if(patientDB.containsKey(patientId))
        {
            Patient patient = patientDB.get(patientId);
            patient.setDiseaseName(diseaseName);
            patientDB.put(patientId, patient);
            return "Successfully updated";
        }
        return "Patient does not exist";
    }

    //Delete API
    @DeleteMapping("/deleteDetail")
    public String deleteDetails(@RequestParam("patientId") Integer patientId)
    {
        patientDB.remove(patientId);
        return "Patient Detail has been successfully deleted";
    }

}
