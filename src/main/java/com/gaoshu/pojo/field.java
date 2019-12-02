package com.gaoshu.pojo;

import lombok.Data;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="field")
@Data
public class field implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer fId;

    private String fName;

    private String fArea;//所在区域

    private String fAddress;

    private String fPhone;

    private String fFee;//费用



}
