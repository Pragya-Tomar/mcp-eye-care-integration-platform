package com.eyecare.controller;

import com.eyecare.model.Doctor;
import com.eyecare.service.DoctorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    private final DoctorService service;
    public DoctorController(DoctorService service) { this.service = service; }

    @GetMapping
    public List<Doctor> getAll() { return service.getAll(); }
}