package com.itc.main.service;

import java.util.List;

import com.itc.main.model.Product;

public interface ProductService {
	 
	 public Product saveProduct(Product product);
     public List<Product> getAllProducts();
     public Product getProductById(int id);
     public Product getProductByName(String productName);
     public Product updateProduct(Product product);
     public boolean deleteProductById(int id);
     public boolean deleteProductByName(String pname);
     
}
