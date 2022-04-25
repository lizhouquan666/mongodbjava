package com.lpd.mongodb.service;

import com.lpd.mongodb.pojo.Msg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class InsertServiceImpl implements InsertService{

    /**
     * 设置集合名称
     */
    private static final String COLLECTION_NAME = "msg";

    @Resource
    private  MongoTemplate mongoTemplate;

    /**
     * 插入【一条】文档数据，如果文档信息已经【存在就抛出异常】
     *
     * @return 插入的文档信息
     */
    public void insertMsg(Msg msg) {
        // 插入一条用户数据，如果文档信息已经存在就抛出异常
        Msg newMsg = mongoTemplate.insert(msg, COLLECTION_NAME);
//        // 输出存储结果
        log.info("存储的用户信息为：{}", newMsg);

    }


}
