package com.sasamoahkb.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    
    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }
    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return softwareEngineerService.getAllSoftwareEngineers(); 
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineerById(
        @PathVariable int id 
    ) {
        return softwareEngineerService.getSoftwareEngineerById(id); 
    }
    
    // Endpoint to add a new Software Engineer
    @PostMapping
    public void adddNewSoftwareEngineer(
        SoftwareEngineer softwareEngineer) 
        {
        // This method can be implemented to add a new Software Engineer
        // For now, it is left empty
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}
