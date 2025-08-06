package com.example.ApiGatewayPatientPoc.service;



import com.example.ApiGatewayPatientPoc.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {

    private final List<Patient> patients = new ArrayList<>();

    public PatientService() {
        patients.add(new Patient(1L, "Rahul", 25));
        patients.add(new Patient(2L, "Meena", 42));
        patients.add(new Patient(3L, "Arjun", 60));
    }

    public List<Patient> getAllPatients() {
        return patients;
    }

    public List<Patient> getPatientsAboveAge(int age) {
        return patients.stream()
                .filter(p -> p.getAge() > age)
                .collect(Collectors.toList());
    }
}
