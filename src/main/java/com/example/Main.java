package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService service = context.getBean(EmployeeService.class);

        service.addEmployee(101, "Sathya");
        System.out.println();
        service.displayEmployee(101, "Sathya");
        System.out.println();
        service.calculateSalary(25000.0);
    }
}