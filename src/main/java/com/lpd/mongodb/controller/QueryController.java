package com.lpd.mongodb.controller;


import com.lpd.mongodb.pojo.Msg;
import com.lpd.mongodb.service.QueryService;
import com.lpd.mongodb.service.QueryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QueryController {

    @Autowired
    private QueryServiceImpl queryService;

    @GetMapping("findByCondition")
    public List<Msg> findByCondition(String toUserId,String state){

        List<Msg> byCondition = queryService.findByCondition(toUserId,state);

        return byCondition;
    }


}
