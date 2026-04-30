package com.eyecare.model;

import jakarta.validation.constraints.NotBlank;

public class Appointment {
    private String id;

    @NotBlank(message = "Patient ID required")
    private String patientId;

    @NotBlank(message = "Doctor ID required")
    private String doctorId;

    private String date;      // e.g. "2024-06-15"
    private String time;      // e.g. "10:30"
    private String status;    // SCHEDULED, COMPLETED, CANCELLED
    private String notes;

    public Appointment() {}
    public Appointment(String id, String patientId, String doctorId,
                       String date, String time, String status, String notes) {
        this.id = id; this.patientId = patientId; this.doctorId = doctorId;
        this.date = date; this.time = time; this.status = status; this.notes = notes;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public String getDoctorId() { return doctorId; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}