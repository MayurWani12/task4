package com.mayur.service;

import com.mayur.entity.Employee;
//import com.mayur.repositor.Repo
import com.mayur.repository.repositor;

// Renamed from 'repositor'
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Employeeservice implements repositor {

    private EntityManager em;

    public Employeeservice(EntityManager em) {
        this.em = em;
    }

    @Override
    public void addData() {
        EntityTransaction transaction = em.getTransaction();
        
        try {
            transaction.begin(); // Start the transaction

            Employee employee = new Employee();
            employee.setName("Ram");
            employee.setDept("CS");
            employee.setSalary(100000); // Use a reasonable salary value

            em.persist(employee); // Persist the employee
            transaction.commit(); // Commit the transaction

            System.out.println("Added: " + employee);
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback(); // Rollback in case of error
            }
            e.printStackTrace();
        }
    }

    // Implement other methods as needed
}
