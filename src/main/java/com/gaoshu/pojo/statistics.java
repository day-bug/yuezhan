package com.gaoshu.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "statistics")
public class statistics {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer sId;//统计id
    private Integer rId;//约战id
    private Integer uId;//用户id
}
