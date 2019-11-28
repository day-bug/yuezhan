package com.gaoshu.pojo;

import lombok.Data;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="detail")
@Data
public class detail implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")

    private Integer dId;

    private Integer rId;

    private Integer t1Id;

    private Integer t2Id;

    private String dResult;

    private String dDesc;//介绍
}
