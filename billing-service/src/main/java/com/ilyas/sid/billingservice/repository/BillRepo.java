package com.ilyas.sid.billingservice.repository;

import com.ilyas.sid.billingservice.entites.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepo extends JpaRepository<Bill, Long> {
}
