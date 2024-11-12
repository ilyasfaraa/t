package com.ilyas.sid.billingservice.web;

import com.ilyas.sid.billingservice.entites.Bill;
import com.ilyas.sid.billingservice.repository.BillRepo;
import com.ilyas.sid.billingservice.repository.ProductItemRepo;
import com.ilyas.sid.billingservice.services.CustomerRestClient;
import com.ilyas.sid.billingservice.services.ProductRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillRestController {
    @Autowired
    private BillRepo billRepository;
    @Autowired
    private ProductItemRepo productItemRepository;
    @Autowired
    private CustomerRestClient customerRestClient;
    @Autowired
    private ProductRestClient productRestClient;

    @GetMapping("/fullBill/{id}")
    public Bill bill(@PathVariable Long id) {
        Bill bill = billRepository.findById(id).get();
        bill.setCustomer(customerRestClient.findCustomerById(bill.getCustomerId()));
        bill.getProductsItems().forEach(productItem -> {
            productItem.setProduct(productRestClient.findProductById(productItem.getProductId()));
        });
        return bill;
    }
}
