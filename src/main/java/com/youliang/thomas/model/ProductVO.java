package com.youliang.thomas.model;

import com.youliang.thomas.model.dto.BaseDTO;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class ProductVO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 5763819069444560194L;

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

    public Product getProduct() {
        Product product = new Product();
        product.setId(this.getId());
        product.setName(this.getName());
        product.setDesc(this.getDesc());
        product.setAttribute(this.getAttribute());
        product.setProductType(this.getProductType());
        product.setShowTitle(this.getShowTitle());
        product.setOldPrice(this.getOldPrice());
        product.setScoutPrice(this.getScoutPrice());
        return product;
    }

    public ProductImages getProductImages() {
        ProductImages productImages = new ProductImages();
        productImages.setProductId(this.getId());
        productImages.setImage1(this.getImage1());
        productImages.setImage2(this.getImage2());
        productImages.setImage3(this.getImage3());
        productImages.setImage4(this.getImage4());
        productImages.setImage5(this.getImage5());
        return productImages;
    }

    public void setProduct(Product product) {
        this.setId(product.getId());
        this.setName(product.getName());
        this.setDesc(product.getDesc());
        this.setAttribute(product.getAttribute());
        this.setProductType(product.getProductType());
        this.setShowTitle(product.getShowTitle());
        this.setOldPrice(product.getOldPrice());
        this.setScoutPrice(product.getScoutPrice());
    }

    public void setProductImages(ProductImages productImages ) {
        this.setImage1(this.getImage1());
        this.setImage2(this.getImage2());
        this.setImage3(this.getImage3());
        this.setImage4(this.getImage4());
        this.setImage5(this.getImage5());
    }
}
