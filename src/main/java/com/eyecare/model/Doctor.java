package com.eyecare.model;

public class Doctor {
    private String id;
    private String name;
    private String specialization; // e.g. "Retina Specialist", "Glaucoma"
    private String availability;   // e.g. "Mon-Fri 9AM-5PM"

    public Doctor() {}
    public Doctor(String id, String name, String specialization, String availability) {
        this.id = id; this.name = name;
        this.specialization = specialization; this.availability = availability;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String s) { this.specialization = s; }
    public String getAvailability() { return availability; }
    public void setAvailability(String a) { this.availability = a; }
}