package com.sasamoahkb.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SoftwareEngineer {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    // Using IDENTITY strategy for auto-incrementing primary key
    // This is suitable for PostgreSQL and other databases that support it
    private int id; 
    private String name;
    private String techstack;

    public SoftwareEngineer(int id, String name, String techstack) {
        this.id = id;
        this.name = name;
        this.techstack = techstack;
    }

    public int getId() {
        return id;
    }   
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTechstack() {
        return techstack;
    }
    public void setTechstack(String techstack) {
        this.techstack = techstack;
    }  
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) obj;
        return Objects.equals(id, that.id) &&
               Objects.equals(name, that.name) &&
               Objects.equals(techstack, that.techstack);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, techstack);
    }
}
