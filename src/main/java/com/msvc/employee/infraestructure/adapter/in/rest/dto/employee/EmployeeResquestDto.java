package com.msvc.employee.infraestructure.adapter.in.rest.dto.employee;

import java.util.Set;
import com.msvc.employee.domain.DocumentNumber;
import com.msvc.employee.domain.Email;
import com.msvc.employee.domain.NormalizedText;
import com.msvc.employee.domain.models.AcademicLevel;
import com.msvc.employee.domain.models.DocumentType;
import com.msvc.employee.domain.models.WorkSpace;

public record EmployeeResquestDto(
        NormalizedText name,
        NormalizedText lastName,
        DocumentType documentType,
        DocumentNumber documentNumber,
        Email email,
        boolean systemAccess,
        AcademicLevel academicLevel,
        Set<WorkSpace> workSpaceIds) {
}
