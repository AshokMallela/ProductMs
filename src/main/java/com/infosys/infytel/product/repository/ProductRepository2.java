package com.infosys.infytel.product.repository;


//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.product.entity.SubscribedProduct;

public interface ProductRepository2 extends JpaRepository<SubscribedProduct, String> {

}

