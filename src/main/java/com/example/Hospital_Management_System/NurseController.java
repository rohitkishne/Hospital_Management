package com.example.Hospital_Management_System;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nurse")
public class NurseController {
    NurseService service = new NurseService();
    @PostMapping("/add")
    public String addNurse(@RequestBody Nurse nurse)
    {
        String nurses = service.addNurse(nurse);
        return nurses;
    }

    @GetMapping("/getDetail")
    public Nurse getDetail(@RequestParam("nurseId") Integer nurseId)
    {
        Nurse nurse = service.getNurses(nurseId);
        return nurse;
    }

    @GetMapping("/allDetail")
    public List<Nurse> getAll(){
        List<Nurse> nurses = service.getAll();
        return nurses;
    }

    @GetMapping("/detailByAge")
    public List<Nurse> getDetailByAge(@RequestParam("nurseAge") Integer nurseAge)
    {
        List<Nurse> nurses = service.getDetailsByAge(nurseAge);
        return nurses;
    }

    @GetMapping("/detailByQualification")
    public List<Nurse> getDetailByQualification(@RequestParam("qualification") String qualification)
    {
        List<Nurse> list = service.getByQualification(qualification);
        return list;
    }

}
