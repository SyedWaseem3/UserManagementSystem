package com.geekster.UserManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class USMController {

    @Autowired
    List<UMS> umsList;


    //Adding a single user :
    @PostMapping("add")
    public String addUser(@RequestBody UMS newUms){
        umsList.add(newUms);
        return "User Added.";
    }

    //Finding user by ID :
    @GetMapping("find/{id}")
    public UMS getUserById(@PathVariable Integer id){
        for(UMS ums : umsList){
            if(ums.getuId().equals(id)){
                return ums;
            }
        }
        return null;
    }

    //Finding all users in the List :
    @GetMapping("findAll")
    public List<UMS> getAllUsers(){
        return umsList;
    }

    //Updating user phone number by ID :
    @PutMapping("update/{id}")
    public String updateUserPhoneNumber(@PathVariable Integer id,@RequestParam String number){
        for(UMS ums : umsList){
            if(ums.getuId().equals(id)){
                ums.setuPhoneNumber(number);
                return "PhoneNumber of ID: " + id + " Updated to : " +number;
            }
        }
        return "Invalid ID";
    }

    //Deleting user by ID :
    @DeleteMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable Integer id){
        for(UMS ums : umsList){
            if(ums.getuId().equals(id)){
                umsList.remove(ums);
                return "User of ID : " + id + " removed.";
            }
        }
        return "Invalid ID";
    }

    @DeleteMapping("deleteAllUsers")
    public String deleteAllUsers(){
        umsList.clear();
        return "All Users Deleted";
    }
}
