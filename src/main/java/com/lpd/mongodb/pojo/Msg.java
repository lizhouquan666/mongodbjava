package com.lpd.mongodb.pojo;


import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("msg")
@Data
@ToString
@Accessors(chain = true)
public class Msg {
    @Id
    private String id;
    private String fromUserId;
    private String toUserId;
    private String data;
    private String filePath;
    private String sendTime;
    private String accepttime;
    private String state;


}
