package com.example.Hospital_Management_System;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    HashMap<Integer, Doctor> doctorDB = new HashMap<>();
    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor)
    {
        int key = doctor.getDoctorId();
        doctorDB.put(key, doctor);
        return "Doctor Data has been Successfully Added";
    }

    @GetMapping("/getInfo/{doctorId}")
    public Doctor getDoctorInfo(@PathVariable("doctorId") Integer doctorId)
    {
        Doctor doctor = doctorDB.get(doctorId);
        return doctor;
    }

    @GetMapping("/getAll")
    public List<Doctor> getAllDoctor()
    {
        List<Doctor> doctors = new ArrayList<>();
        for(Doctor doctor : doctorDB.values())
        {
            doctors.add(doctor);
        }
        return doctors;
    }

    @PutMapping("/updateInfo")
    public String updateDoctorInfo(@RequestBody Doctor doctor)
    {
        int key = doctor.getDoctorId();
        if(doctorDB.containsKey(key))
        {
            doctorDB.put(key,doctor);
            return "Doctor Info Updated Successfully";
        }
        return "Doctor Info does not exist";
    }

    @DeleteMapping("/deleteInfo")
    public String deleteDoctorInfo(@RequestParam("doctorId") Integer doctorId)
    {
        doctorDB.remove(doctorId);
        return "Doctor Info has been Successfully Deleted";
    }




}
