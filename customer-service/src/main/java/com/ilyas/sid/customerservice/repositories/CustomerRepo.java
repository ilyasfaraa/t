package com.ilyas.sid.customerservice.repositories;

import com.ilyas.sid.customerservice.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
