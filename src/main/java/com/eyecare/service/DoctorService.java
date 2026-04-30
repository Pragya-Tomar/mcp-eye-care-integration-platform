package com.eyecare.service;

import com.eyecare.model.Doctor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DoctorService {
    private final Map<String, Doctor> store = new LinkedHashMap<>();

    public DoctorService() {
        store.put("D001", new Doctor("D001", "Dr. Neha Kapoor", "Retina Specialist", "Mon-Fri 9AM-5PM"));
        store.put("D002", new Doctor("D002", "Dr. Suresh Mehta", "Cataract & Lens", "Tue-Sat 10AM-4PM"));
        store.put("D003", new Doctor("D003", "Dr. Ananya Rao", "Glaucoma", "Mon-Thu 8AM-2PM"));
    }

    public List<Doctor> getAll() { return new ArrayList<>(store.values()); }
    public Optional<Doctor> getById(String id) { return Optional.ofNullable(store.get(id)); }
    public Doctor save(Doctor d) { store.put(d.getId(), d); return d; }
}