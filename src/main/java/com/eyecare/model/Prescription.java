package com.eyecare.model;

public class Prescription {
    private String id;
    private String patientId;
    private String doctorId;
    private String medication;    // e.g. "Latanoprost eye drops"
    private String dosage;        // e.g. "1 drop daily"
    private String rightEyePower; // e.g. "-2.50"
    private String leftEyePower;
    private String issuedDate;

    public Prescription() {}
    public Prescription(String id, String patientId, String doctorId,
                        String medication, String dosage,
                        String rightEye, String leftEye, String date) {
        this.id = id; this.patientId = patientId; this.doctorId = doctorId;
        this.medication = medication; this.dosage = dosage;
        this.rightEyePower = rightEye; this.leftEyePower = leftEye;
        this.issuedDate = date;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getPatientId() { return patientId; }
    public void setPatientId(String p) { this.patientId = p; }
    public String getDoctorId() { return doctorId; }
    public void setDoctorId(String d) { this.doctorId = d; }
    public String getMedication() { return medication; }
    public void setMedication(String m) { this.medication = m; }
    public String getDosage() { return dosage; }
    public void setDosage(String d) { this.dosage = d; }
    public String getRightEyePower() { return rightEyePower; }
    public void setRightEyePower(String r) { this.rightEyePower = r; }
    public String getLeftEyePower() { return leftEyePower; }
    public void setLeftEyePower(String l) { this.leftEyePower = l; }
    public String getIssuedDate() { return issuedDate; }
    public void setIssuedDate(String d) { this.issuedDate = d; }
}