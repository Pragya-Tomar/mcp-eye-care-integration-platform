package com.eyecare.service;

import com.eyecare.model.Bill;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BillingService {
    private final Map<String, Bill> store = new LinkedHashMap<>();
    private int counter = 1;

    public BillingService() {
        save(new Bill("B001","P001",500.0,"Consultation fee","PENDING","2024-06-15"));
        save(new Bill("B002","P002",12000.0,"Cataract surgery","PENDING","2024-06-16"));
        save(new Bill("B003","P003",300.0,"Eye pressure test","PAID","2024-06-10"));
    }

    public List<Bill> getAll() { return new ArrayList<>(store.values()); }
    public Optional<Bill> getById(String id) { return Optional.ofNullable(store.get(id)); }

    public Bill save(Bill b) {
        if (b.getId() == null || b.getId().isEmpty()) {
            b.setId("B" + String.format("%03d", counter++));
        }
        store.put(b.getId(), b);
        return b;
    }
}