package com.malli.customerservice.controller;

import com.malli.customerservice.domain.response.ApiResponse;
import com.malli.customerservice.domain.response.CustomerStatusResponse;
import com.malli.customerservice.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer")
@Tag(name = "CustomerController", description = "Customer management APIs")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/status")
    public ApiResponse<CustomerStatusResponse> showStatus() {
        CustomerStatusResponse customerStatusResponse = new CustomerStatusResponse("UP", "customer-service", "Malli");
        return ApiResponse.success("200", ApiResponse.Status.SUCCESS.toString(), customerStatusResponse);
    }

}
