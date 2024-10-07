package com.mayur.test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import com.mayur.service.Employeeservice;

public class test {
    public static void main(String[] args) {
        // Create EntityManagerFactory
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("wani");
        
        // Create EntityManager
        EntityManager emanager = emFactory.createEntityManager();
        
        // Initialize Employeeservice with the EntityManager
        Employeeservice employeeService = new Employeeservice(emanager);
        
        // Call addData method to add a new employee
        employeeService.addData();

        // Close the EntityManager and EntityManagerFactory
        emanager.close();
        emFactory.close();
        
        System.out.println("Operation completed successfully.");
    }
}
