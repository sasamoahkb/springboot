package com.sasamoahkb.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareEngineerRepository 
    extends JpaRepository<SoftwareEngineer, Integer> {
    
    // Additional query methods can be defined here if needed
    
}
