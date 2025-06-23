package com.simple.project.hospital_management.controller;

import com.simple.project.hospital_management.model.Doctor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/doctor/apis")
@RestController
public class DoctorController {

    // here we are using hashmap to store the data which is in memory
    Map<Integer, Doctor> doctorMapDb = new HashMap<>();
    // 1 -> {1,"Ajay","ajay123@gmail.com","cardio","male"}
    // 2 -> {2,"Vijay","vijay123@gmail.com","cardio","male"}
    // 3 -> {3,"sanjay","sanjay123@gmail.com","cardio","male"}

    // debugging - tracing the flow of the application(understanding line by line what is happening and all)

    //spring boot application - takes input in the form of JSON(javascript object notation)

    // @RequestBody -it takes the input from the postman or ui and assigns it to the doctor object(used for complete class objects)


    @PostMapping("/save")
    public String saveDoctor(@RequestBody Doctor Input){
        doctorMapDb.put(doctorInput.getId(), doctorInput);
        System.out.println("doctorMapDb is : "+doctorInput);
        return "Doctor saved successfully!";
    }
}