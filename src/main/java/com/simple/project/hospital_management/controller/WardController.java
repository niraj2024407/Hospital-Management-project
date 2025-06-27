package com.simple.project.hospital_management.controller;


import com.simple.project.hospital_management.model.Patient;
import com.simple.project.hospital_management.model.Ward;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/ward/apis")
@RestController
public class WardController {
    Map<Integer, Ward> wardMapDb = new HashMap<>();
    //1 -> {1,"Rahul Raj", "rahulraj123@gmail.com", "Eye Ward", "Male"}
    //1 -> {1,"Saurabh Patel", "saurabhpatel123@gmail.com", "Hand Ward", "Male"}
    //1 -> {1,"Priya Raj", "priyaraj123@gmail.com", "Teeth Ward", "Female"}


    @PostMapping("/save3")
    public String saveWard(@RequestBody Ward wardInput){
        wardMapDb.put(wardInput.getId(),wardInput);
        System.out.println("wardMapDb is : "+wardInput);
        return "Ward saved successfully!";
    }


    // @PathVariable - it takes the input in the url path or endpoint
    @GetMapping("/findById3/{id}")
    public Ward findWardById(@PathVariable int id){
        Ward ward = wardMapDb.get(id);
        return ward;
    }

    @GetMapping("/findAll3")
    public Map<Integer, Ward> findAllWard() {
        return wardMapDb;
    }

    @DeleteMapping("/delete3/{id}")
    public String deleteWardById(@PathVariable int id){
        wardMapDb.remove(id);
        return "Ward with id : "+id+" has been deleted successfully!";
    }

}
