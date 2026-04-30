package com.eyecare.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

public class Patient {
    private String id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Valid email required")
    private String email;

    private String phone;
    private String condition; // e.g. "Myopia", "Cataract"

    public Patient() {}
    public Patient(String id, String name, String email, String phone, String condition) {
        this.id = id; this.name = name; this.email = email;
        this.phone = phone; this.condition = condition;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }
}