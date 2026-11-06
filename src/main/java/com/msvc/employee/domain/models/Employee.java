package com.msvc.employee.domain.models;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import com.msvc.employee.domain.DocumentNumber;
import com.msvc.employee.domain.Email;
import com.msvc.employee.domain.NormalizedText;

public class Employee {
    private Long id;
    private NormalizedText name;
    private NormalizedText lastName;
    private DocumentType documentType;
    private DocumentNumber documentNumber;
    private Email email;
    private boolean active;
    private boolean systemAccess;
    private LocalDate registrationDate;
    private AcademicLevel academicLevel;

    private Set<WorkSpace> workSpaces = new LinkedHashSet<>();

    public Employee() {
    }

    public Employee(Long id, NormalizedText name, NormalizedText lastName, DocumentType documentType,
            DocumentNumber documentNumber,
            Email email, AcademicLevel academicLevel, boolean active, boolean systemAccess,
            LocalDate registrationDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.email = email;
        this.academicLevel = academicLevel;
        this.active = active;
        this.systemAccess = systemAccess;
        this.registrationDate = registrationDate;
    }

    public Employee(Long id, NormalizedText name, NormalizedText lastName, DocumentType documentType,
            DocumentNumber documentNumber, Email email, boolean active, boolean systemAccess,
            LocalDate registrationDate, AcademicLevel academicLevel, Set<WorkSpace> workSpaces) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.email = email;
        this.active = active;
        this.systemAccess = systemAccess;
        this.registrationDate = registrationDate;
        this.academicLevel = academicLevel;
        this.workSpaces = workSpaces;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NormalizedText getName() {
        return name;
    }

    public void setName(NormalizedText name) {
        this.name = name;
    }

    public NormalizedText getLastName() {
        return lastName;
    }

    public void setLastName(NormalizedText lastName) {
        this.lastName = lastName;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public DocumentNumber getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(DocumentNumber documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSystemAccess() {
        return systemAccess;
    }

    public void setSystemAccess(boolean systemAccess) {
        this.systemAccess = systemAccess;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public AcademicLevel getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(AcademicLevel academicLevel) {
        this.academicLevel = academicLevel;
    }

    public Set<WorkSpace> getWorkSpaces() {
        return workSpaces;
    }

    public void setWorkSpaces(Set<WorkSpace> workSpaces) {
        this.workSpaces = workSpaces;
    }

}
