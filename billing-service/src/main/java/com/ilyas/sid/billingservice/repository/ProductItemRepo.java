package com.ilyas.sid.billingservice.repository;

import com.ilyas.sid.billingservice.entites.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepo extends JpaRepository<ProductItem, Long> {
}
