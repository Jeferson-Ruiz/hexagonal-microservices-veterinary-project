package com.msvc.employee.infraestructure.adapter.in.rest.dto.employee;

import java.time.LocalDate;
import java.util.Set;
import com.msvc.employee.domain.DocumentNumber;
import com.msvc.employee.domain.Email;
import com.msvc.employee.domain.NormalizedText;
import com.msvc.employee.domain.models.AcademicLevel;
import com.msvc.employee.domain.models.DocumentType;
import com.msvc.employee.domain.models.WorkSpace;

public record EmployeeResponseDto(
        Long id,
        NormalizedText name,
        NormalizedText lastName,
        DocumentType documentType,
        DocumentNumber documentNumber,
        Email email,
        boolean active,
        boolean systemAccess,
        LocalDate registrationDate,
        AcademicLevel academicLevel,
        Set<WorkSpace> workSpaces) {
}