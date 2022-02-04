package com.al.springbootcrudapp.service;

import com.al.springbootcrudapp.model.Product;
import com.al.springbootcrudapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> listAll() {
        return repo.findAll();
    }

    public void save(Product product) {
        repo.save(product);
    }

    public Product getById(Long id) {
        return repo.getById(id);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }


}
