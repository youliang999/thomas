package com.youliang.thomas.service.impl;

import com.youliang.thomas.model.Product;
import com.youliang.thomas.model.ProductImages;
import com.youliang.thomas.model.ProductVO;
import com.youliang.thomas.repository.ProductImagesRepository;
import com.youliang.thomas.repository.ProductRepository;
import com.youliang.thomas.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductImagesRepository productImagesRepository;

    @Override
    public ProductVO save(ProductVO productVO) {
        Product oldProduct = productVO.getProduct();
        Product product = productRepository.save(oldProduct);
        ProductImages oldProductImages = productVO.getProductImages();
        ProductImages productImages = productImagesRepository.save(oldProductImages);
        ProductVO newProductVo = new ProductVO();
        newProductVo.setProduct(product);
        newProductVo.setProductImages(productImages);
        return newProductVo;
    }
}
