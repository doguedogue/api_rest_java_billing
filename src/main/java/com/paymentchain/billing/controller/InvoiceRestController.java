/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.billing.controller;

import com.paymentchain.billing.entities.Invoice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.paymentchain.billing.respository.InvoiceRepository;

/**
 *
 * @author sotobotero
 */
@RestController
@RequestMapping("/billing")
public class InvoiceRestController {
    
    @Autowired
    InvoiceRepository customerRepository;
    
    @GetMapping()
    public List<Invoice> list() {
        return customerRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Invoice get(@PathVariable String id) {
        return null;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Invoice input) {
        return null;
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Invoice input) {
        Invoice save = customerRepository.save(input);
        return ResponseEntity.ok(save);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    
}
