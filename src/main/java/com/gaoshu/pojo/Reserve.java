package com.gaoshu.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name="Reserve")
public class Reserve implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer rId;

    private Integer tId;//

    private String rFormat;//赛制

    private String rTime;//比赛时间

    private String rArea;

    private Integer fId;

    private String rBegintime;//预约开始时间

    private String rEndtime;//预约结束时间

    private String rComment;//备注

    private String rColor;




}
