package com.dongyang.BackendProject.repository;

import com.dongyang.BackendProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
