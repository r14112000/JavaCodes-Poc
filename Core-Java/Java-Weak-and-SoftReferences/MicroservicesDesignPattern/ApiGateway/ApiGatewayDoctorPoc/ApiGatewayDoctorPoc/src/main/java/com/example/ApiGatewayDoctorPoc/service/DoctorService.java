package com.example.ApiGatewayDoctorPoc.service;


import com.example.ApiGatewayDoctorPoc.model.Doctor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    private final List<Doctor> doctors = new ArrayList<>();

    public DoctorService() {
        doctors.add(new Doctor(1L, "Dr. Raj", "Cardiology"));
        doctors.add(new Doctor(2L, "Dr. Simran", "Orthopedics"));
        doctors.add(new Doctor(3L, "Dr. Ayesha", "Cardiology"));
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    public List<Doctor> getDoctorsBySpecialty(String specialty) {
        return doctors.stream()
                .filter(doc -> doc.getSpecialty().equalsIgnoreCase(specialty))
                .collect(Collectors.toList());
    }
}

