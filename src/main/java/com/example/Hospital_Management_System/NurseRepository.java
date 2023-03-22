package com.example.Hospital_Management_System;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class NurseRepository {
    HashMap<Integer, Nurse> nurseDB = new HashMap<>();

    public String addNurse(Nurse nurse)
    {
        int key = nurse.getNurseId();
        nurseDB.put(key, nurse);
        return "Nurse Details has been Successfully added";
    }

    public Nurse get(int id)
    {
        Nurse nurse = nurseDB.get(id);
        return nurse;
    }
    public List<Nurse> getNurses()
    {
        return nurseDB.values().stream().toList();
    }
}
