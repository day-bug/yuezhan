package com.gaoshu.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@Table(name = "news")

public class news implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")

    private Integer nId;

    private String nTitle;

    private String nCon;//n内容

    private String nAutor;

    private String nTime;

}
