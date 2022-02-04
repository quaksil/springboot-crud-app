package com.al.springbootcrudapp.repository;


import com.al.springbootcrudapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
