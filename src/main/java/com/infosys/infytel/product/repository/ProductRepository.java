package com.infosys.infytel.product.repository;


//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}

