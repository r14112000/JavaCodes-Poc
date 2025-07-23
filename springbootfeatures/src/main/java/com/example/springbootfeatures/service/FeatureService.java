package com.example.springbootfeatures.service;
import com.example.springbootfeatures.model.Feature;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeatureService {
    public List<Feature> getFeatures() {
        List<Feature> features = new ArrayList<>();
        features.add(new Feature("Auto-Configuration", "Automatically configures Spring components"));
        features.add(new Feature("Spring Boot Starters", "Simplified dependency management"));
        features.add(new Feature("Embedded Server", "No need for external Tomcat or Jetty"));
        features.add(new Feature("Actuator", "Monitoring and metrics support"));
        features.add(new Feature("DevTools", "For hot reload and faster development"));
        return features;
    }
}
