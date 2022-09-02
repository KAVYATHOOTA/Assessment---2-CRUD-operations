package com.itc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itc.main.model.Product;

@EnableJpaRepositories
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
	Product getProductByPname(String Pname);

	@Transactional
	@Modifying
	@Query("DELETE FROM Product WHERE pname=:pname")
	     Integer deleteProductByName(String pname);
}
