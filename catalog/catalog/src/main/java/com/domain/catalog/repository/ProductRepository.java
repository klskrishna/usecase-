package com.domain.catalog.repository;



import java.util.List;



import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.domain.catalog.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

public List<Product> findAllByProductnameContaining(String productname,Pageable pageable);
public Product findByProductid(int productid);



}