package com.example.Hospital_Management_System;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NurseService {
    NurseRepository nurseDB = new NurseRepository();

    public String addNurse(Nurse nurse)
    {
        //write logic and validation here;
        if(nurse.getNurseId()<0)
        {
            return "Enter Valid Nurse Id";
        }
        if(nurse.getNurseName().equals(null))
        {
            return "Enter Nurse Name";
        }
        //save it to database;
        String added = nurseDB.addNurse(nurse);
        return added;
    }

    public Nurse getNurses(int nurseId){
        Nurse nurse = nurseDB.get(nurseId);
        return nurse;
    }

    public List<Nurse> getAll()
    {
        List<Nurse> list = nurseDB.getNurses();
        return list;
    }

    public List<Nurse> getDetailsByAge(int age)
    {
        //first get all nurses detail
        //check which nurses are greater than age
        //then add to the list and return
        List<Nurse> list = nurseDB.getNurses();
        List<Nurse> nurses = new ArrayList<>();
        for(Nurse nurse : list)
        {
            if(nurse.getNurseAge()>age)
            {
                nurses.add(nurse);
            }
        }
        return nurses;
    }

    public List<Nurse> getByQualification(String qualification)
    {
        List<Nurse> list = nurseDB.getNurses();
        List<Nurse> nurses = new ArrayList<>();
        for(Nurse nurse : list)
        {
            if(nurse.getQualification().equals(qualification))
            {
                nurses.add(nurse);
            }
        }
        return nurses;
    }

}
