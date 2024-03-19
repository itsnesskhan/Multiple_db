package com.multi.db.mysql.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.db.mysql.entity.Product;
import com.multi.db.mysql.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

	@Autowired
	private final ProductRepository productRepository;
	
	@PostMapping
	public ResponseEntity<?> createProduct(@RequestBody Product product){
		Product saveProduct = productRepository.save(product);
		return ResponseEntity.created(null).body(saveProduct);
	}
	
	@GetMapping
	public ResponseEntity<?> getAllProduct(){
		List<Product> findAll = productRepository.findAll();
		return ResponseEntity.ok(findAll);
	}
}
