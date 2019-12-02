package com.gaoshu.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.io.Serializable;

//用户表
@Data
@Table(name = "User")
public class User implements Serializable {
   @Id
   @GeneratedValue(generator = "JDBC")
    private Integer uId; //用户ID
    private String uName;
    private String uRealname;
    private String uPass;
    private String uEmail;
    private String uPhone;
    private String uQq;
    private Integer tId;//球队id
    private Integer uLeader;//是否队长
}
