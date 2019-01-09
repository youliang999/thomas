package com.youliang.thomas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "my_product")
public class Product implements Serializable  {
    private static final long serialVersionUID = 1259988490212589049L;
    @Id
    @GeneratedValue
    private Long id;

    //名称
    private String name;

    //描述
    private String desc;

    //类型
    private int productType;

    //属性
    private int attribute;

    //展示title
    private String  showTitle;

    //原价
    private BigDecimal oldPrice;

    //折扣价
    private BigDecimal scoutPrice;

}
