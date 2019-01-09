package com.youliang.thomas.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "my_product_images")
public class ProductImages  implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    //物品id
    private Long productId;

    //图片1
    private String image1;

    //图片2
    private String image2;

    //图片3
    private String image3;

    //图片4
    private String image4;

    //图片5
    private String image5;
}
