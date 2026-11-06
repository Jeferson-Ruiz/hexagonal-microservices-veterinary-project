package com.msvc.employee.domain.models;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String email;
    private String password;
    private boolean active;
    private LocalDateTime registrationDate;
    private Employee employee;

    public User(Long id, String email, String password, boolean active, LocalDateTime registrationDate,
            Employee employee) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.active = active;
        this.registrationDate = registrationDate;
        this.employee = employee;
    }

    public User(Long id, String email, String password, boolean active, LocalDateTime registrationDate) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.active = active;
        this.registrationDate = registrationDate;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployeeId(Employee employee) {
        this.employee = employee;
    }

}
