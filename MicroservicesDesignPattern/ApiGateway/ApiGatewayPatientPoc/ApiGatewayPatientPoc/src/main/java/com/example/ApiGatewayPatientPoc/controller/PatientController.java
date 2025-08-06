package com.example.ApiGatewayPatientPoc.controller;

import com.example.ApiGatewayPatientPoc.model.Patient;
import com.example.ApiGatewayPatientPoc.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/age-above/{age}")
    public List<Patient> getPatientsAboveAge(@PathVariable int age) {
        return patientService.getPatientsAboveAge(age);
    }
}
