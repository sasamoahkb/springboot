package com.sasamoahkb.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    
    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
            new SoftwareEngineer(
                1, 
                "Alice", 
                "Java, Spring Boot"
                ),
            new SoftwareEngineer(
                2, 
                "Bob", 
                "JavaScript, React"
                ),
            new SoftwareEngineer(
                3, 
                "Charlie", 
                "Python, Django"
                )
        );
    }
}
