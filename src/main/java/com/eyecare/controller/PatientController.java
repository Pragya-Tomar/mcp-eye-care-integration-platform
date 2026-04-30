package com.eyecare.controller;

import com.eyecare.model.Patient;
import com.eyecare.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    private final PatientService service;
    public PatientController(PatientService service) { this.service = service; }

    @GetMapping
    public List<Patient> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getById(@PathVariable String id) {
        return service.getById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Patient> create(@Valid @RequestBody Patient p) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(p));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        return service.delete(id) ? ResponseEntity.noContent().build()
                                  : ResponseEntity.notFound().build();
    }
}