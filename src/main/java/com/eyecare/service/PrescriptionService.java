package com.eyecare.service;

import com.eyecare.model.Prescription;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PrescriptionService {
    private final Map<String, Prescription> store = new LinkedHashMap<>();
    private int counter = 1;

    public PrescriptionService() {
        save(new Prescription("RX001","P001","D001","Latanoprost 0.005%",
                "1 drop nightly", "-2.50", "-2.25", "2024-06-01"));
        save(new Prescription("RX002","P003","D003","Timolol 0.5% drops",
                "2 drops twice daily", "+1.00", "+1.25", "2024-06-05"));
    }

    public List<Prescription> getAll() { return new ArrayList<>(store.values()); }
    public Optional<Prescription> getById(String id) { return Optional.ofNullable(store.get(id)); }

    public Prescription save(Prescription p) {
        if (p.getId() == null || p.getId().isEmpty()) {
            p.setId("RX" + String.format("%03d", counter++));
        }
        store.put(p.getId(), p);
        return p;
    }

    public boolean delete(String id) { return store.remove(id) != null; }
}