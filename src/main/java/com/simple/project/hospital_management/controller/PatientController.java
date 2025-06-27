package com.simple.project.hospital_management.controller;


import com.simple.project.hospital_management.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/patient/apis")
@RestController
public class PatientController {
    Map<Integer, Patient> patientMapDb = new HashMap<>();
    //1 -> {1,"Rahul Raj", "rahulraj123@gmail.com", "Eye Surgery", "Male"}
    //1 -> {1,"Saurabh Patel", "saurabhpatel123@gmail.com", "Hand Surgery", "Male"}
    //1 -> {1,"Priya Raj", "priyaraj123@gmail.com", "Teeth Surgery", "Female"}


    @PostMapping("/save2")
    public String savePatient(@RequestBody Patient patientInput){
        patientMapDb.put(patientInput.getId(),patientInput);
        System.out.println("patientMapDb is : "+patientInput);
        return "Patient saved successfully!";
    }

    // @PathVariable - it takes the input in the url path or endpoint
    @GetMapping("/findById2/{id}")
    public Patient findPatientById(@PathVariable int id){
        Patient patient = patientMapDb.get(id);
        return patient;
    }

    @GetMapping("/findAll2")
    public Map<Integer, Patient> findAllPatient() {
        return patientMapDb;
    }

    @DeleteMapping("/delete2/{id}")
    public String deletePatientById(@PathVariable int id){
        patientMapDb.remove(id);
        return "Patient with id : "+id+" has been deleted successfully!";
    }

}
