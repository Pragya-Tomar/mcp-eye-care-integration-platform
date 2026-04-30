package com.eyecare.service;

import com.eyecare.model.Patient;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PatientService {
    private final Map<String, Patient> store = new LinkedHashMap<>();
    private int counter = 1;

    public PatientService() {
        // Sample data
        save(new Patient("P001", "Ravi Sharma", "ravi@email.com", "9876543210", "Myopia"));
        save(new Patient("P002", "Priya Singh", "priya@email.com", "9845012345", "Cataract"));
        save(new Patient("P003", "Amit Joshi", "amit@email.com", "9012345678", "Glaucoma"));
    }

    public List<Patient> getAll() { return new ArrayList<>(store.values()); }

    public Optional<Patient> getById(String id) { return Optional.ofNullable(store.get(id)); }

    public Patient save(Patient p) {
        if (p.getId() == null || p.getId().isEmpty()) {
            p.setId("P" + String.format("%03d", counter++));
        }
        store.put(p.getId(), p);
        return p;
    }

    public boolean delete(String id) {
        return store.remove(id) != null;
    }
}