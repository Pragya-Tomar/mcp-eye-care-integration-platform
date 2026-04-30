package com.eyecare.controller;

import com.eyecare.model.Prescription;
import com.eyecare.service.PrescriptionService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {
    private final PrescriptionService service;
    public PrescriptionController(PrescriptionService service) { this.service = service; }

    @GetMapping
    public List<Prescription> getAll() { return service.getAll(); }

    @PostMapping
    public ResponseEntity<Prescription> create(@RequestBody Prescription p) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(p));
    }
}