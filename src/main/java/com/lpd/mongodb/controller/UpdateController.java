package com.lpd.mongodb.controller;


import com.lpd.mongodb.service.UpdateService;
import com.lpd.mongodb.service.UpdateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateController {

    @Autowired
    private UpdateServiceImpl updateService;


    @PutMapping("updateMany")
    public void updateMany(String toUserId,String state)
    {
        updateService.updateMany(toUserId,state);
    }


}
