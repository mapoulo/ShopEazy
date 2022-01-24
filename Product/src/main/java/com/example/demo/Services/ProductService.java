package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Product;
import com.example.demo.Repositories.ProductRepo;


@Service
public class ProductService {

	
	@Autowired
	private ProductRepo repo;
	
	
	
	public Product saveProduct(Product product) {
		return repo.save(product);
	}
	
	
	
	public List<Product> getAllProducts(){
		List<Product> productsList = new ArrayList<>();
		repo.findAll().forEach(productsList::add);
		return productsList;
	}
}
