package com.eyecare.controller;

import com.eyecare.model.Appointment;
import com.eyecare.service.AppointmentService;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    private final AppointmentService service;
    public AppointmentController(AppointmentService service) { this.service = service; }

    @GetMapping
    public List<Appointment> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Appointment> getById(@PathVariable String id) {
        return service.getById(id).map(ResponseEntity::ok)
                                  .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Appointment> create(@Valid @RequestBody Appointment a) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(a));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        return service.delete(id) ? ResponseEntity.noContent().build()
                                  : ResponseEntity.notFound().build();
    }
}