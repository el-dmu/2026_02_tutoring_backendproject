package com.dongyang.BackendProject.Repository;

import com.dongyang.BackendProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
