package com.ilyas.sid.customerservice.entites;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer", types = {Customer.class})
public interface CustomerProjection {
    public Long getId();
    public String getName();
    public String getEmail();
}
