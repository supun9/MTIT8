package com.sliit.mtit.microservice.supplierservice.controller;


import com.sliit.mtit.microservice.supplierservice.dto.SupplierRequest;
import com.sliit.mtit.microservice.supplierservice.dto.SupplierResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @PostMapping(consumes = "application/json",produces = "application/json")
public @ResponseBody SupplierResponse addSupplier(@RequestBody SupplierRequest request){

        System.out.println("Supplier Details : "+request);

    var SupplierResponse = new SupplierResponse();
    SupplierResponse.setSupId(UUID.randomUUID().toString());
    SupplierResponse.setNote("Supplier Add Successfully");

    return SupplierResponse;
    }
}
