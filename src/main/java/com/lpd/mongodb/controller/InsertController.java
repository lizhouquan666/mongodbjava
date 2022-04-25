package com.lpd.mongodb.controller;


import com.lpd.mongodb.pojo.Msg;
import com.lpd.mongodb.service.InsertService;
import com.lpd.mongodb.service.InsertServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsertController {

    @Autowired
    private InsertServiceImpl insertService;

    @RequestMapping("insertMsg")
    public void insertMsg(Msg msg){
        insertService.insertMsg(msg);
    }


}
