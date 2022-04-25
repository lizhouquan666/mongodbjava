package com.lpd.mongodb.service;

import com.lpd.mongodb.pojo.Msg;

import java.util.List;

public interface QueryService {
    public List<Msg>  findByCondition(String fromUserId);
}
