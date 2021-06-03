package com.Nehuen_Elizeche.topic_5_f.repository;

import com.Nehuen_Elizeche.topic_5_f.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
