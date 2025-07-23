package com.example.springbootfeatures.controller;


import com.example.springbootfeatures.model.Feature;
import com.example.springbootfeatures.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/features")
public class FeatureController {

    @Autowired
    private FeatureService featureService;

    @GetMapping
    public List<Feature> getAllFeatures() {

        return featureService.getFeatures();
    }
}
