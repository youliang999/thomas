package com.youliang.thomas.repository;

import com.youliang.thomas.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
