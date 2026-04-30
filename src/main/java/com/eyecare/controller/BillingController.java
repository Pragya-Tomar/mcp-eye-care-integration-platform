package com.eyecare.controller;

import com.eyecare.model.Bill;
import com.eyecare.service.BillingService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/billing")
public class BillingController {
    private final BillingService service;
    public BillingController(BillingService service) { this.service = service; }

    @GetMapping
    public List<Bill> getAll() { return service.getAll(); }

    @PostMapping
    public ResponseEntity<Bill> create(@RequestBody Bill b) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(b));
    }
}