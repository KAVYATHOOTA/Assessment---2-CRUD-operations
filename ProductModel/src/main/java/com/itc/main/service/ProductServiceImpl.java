package com.itc.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itc.main.model.Product;
import com.itc.main.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productrepository;
	
	public Product saveProduct(Product product) {
		Product add_product= this.productrepository.save(product);
		return  add_product;
	}
	
	
	public List<Product> getAllProducts(){
		return this.productrepository.findAll();
		
	}
	
	
	public Product getProductById(int id) {
		Optional<Product> op=this.productrepository.findById(id);
		if(op!=null) {
			return op.get();
		}else 
		return null;
	}
	
	
	public Product getProductByName(String pname) {
		Product product=this.productrepository.getProductByPname(pname);
		if(product!=null) {
			return product;
		}
		else
			return null;
	}


	public Product updateProduct(Product product) {
		if(this.productrepository.existsById(product.getPid())) {
			return this.productrepository.save(product);			
		}else
			return null;
	}

		
	
	public boolean deleteProductById(int id) {
		this.productrepository.deleteById(id);
		return true;
	}
	
	
	public boolean deleteProductByName(String pname) {
		this.productrepository.deleteProductByName(pname);
		return true;
	}


}
