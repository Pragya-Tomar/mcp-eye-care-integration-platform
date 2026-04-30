package com.eyecare.model;

public class Bill {
    private String id;
    private String patientId;
    private double amount;
    private String description;
    private String status; // PENDING, PAID
    private String date;

    public Bill() {}
    public Bill(String id, String patientId, double amount,
                String description, String status, String date) {
        this.id = id; this.patientId = patientId; this.amount = amount;
        this.description = description; this.status = status; this.date = date;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getPatientId() { return patientId; }
    public void setPatientId(String p) { this.patientId = p; }
    public double getAmount() { return amount; }
    public void setAmount(double a) { this.amount = a; }
    public String getDescription() { return description; }
    public void setDescription(String d) { this.description = d; }
    public String getStatus() { return status; }
    public void setStatus(String s) { this.status = s; }
    public String getDate() { return date; }
    public void setDate(String d) { this.date = d; }
}