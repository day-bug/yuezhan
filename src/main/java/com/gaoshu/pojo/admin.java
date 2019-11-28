package com.gaoshu.pojo;

import lombok.Data;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="admin")
@Data
public class admin implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer adId;

    private String adName;

    private String adPass;
}
