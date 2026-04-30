package com.eyecare.service;

import com.eyecare.model.Appointment;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class AppointmentService {
    private final Map<String, Appointment> store = new LinkedHashMap<>();
    private int counter = 1;

    public AppointmentService() {
        save(new Appointment("A001","P001","D001","2024-06-15","10:00","SCHEDULED","Annual checkup"));
        save(new Appointment("A002","P002","D002","2024-06-16","11:30","SCHEDULED","Pre-surgery assessment"));
    }

    public List<Appointment> getAll() { return new ArrayList<>(store.values()); }
    public Optional<Appointment> getById(String id) { return Optional.ofNullable(store.get(id)); }

    public Appointment save(Appointment a) {
        if (a.getId() == null || a.getId().isEmpty()) {
            a.setId("A" + String.format("%03d", counter++));
        }
        store.put(a.getId(), a);
        return a;
    }

    public boolean delete(String id) { return store.remove(id) != null; }
}