package com.sasamoahkb.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SoftwareEngineerService {

    private SoftwareEngineerRepository softwareEngineerRepository;
    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        // This method can be implemented to insert a new Software Engineer
        // For now, it is left empty
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(int id) {
        return softwareEngineerRepository.findById(id)
            .orElseThrow(() -> 
                new IllegalStateException("Software Engineer with id " + id + " not found"));
    }
    
}
