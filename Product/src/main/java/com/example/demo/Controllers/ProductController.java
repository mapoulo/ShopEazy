package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Product;
import com.example.demo.Services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	
	
	@Autowired
	private ProductService service;
	
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	
	
	@GetMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}

}
