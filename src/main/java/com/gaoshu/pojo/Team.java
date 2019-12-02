package com.gaoshu.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "Team")
public class Team implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer tId;//球队id
    private String tName;//名称
    private String tAddr;//所在地
    private String tPhone;//联系方式
    private String tSynopsis;//球队简介
    private String tIcon;//球队图标
    private String tSlogan;//比赛口号
    private Integer tCount;//比赛场次
    private Integer tWins;//剩
    private Integer tDraws;//平
    private Integer tLosses;//负
    private Integer tAp;//积分
    private String tStatus;//状态



}
