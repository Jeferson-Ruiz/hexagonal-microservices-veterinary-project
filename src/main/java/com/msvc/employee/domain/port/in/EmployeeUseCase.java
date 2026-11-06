package com.msvc.employee.domain.port.in;

import java.util.List;
import java.util.Set;
import com.msvc.employee.domain.Email;
import com.msvc.employee.domain.NormalizedText;
import com.msvc.employee.domain.models.AcademicLevel;
import com.msvc.employee.domain.models.DocumentType;
import com.msvc.employee.domain.models.Employee;
import com.msvc.employee.domain.models.WorkSpace;

public interface EmployeeUseCase {
    Employee create(Employee employee);

    List<Employee> searchAll();

    Employee searchById(Long id);

    Employee searchByDocumentNumber(String number);

    List<Employee> searchByWorkSpace(WorkSpace workSpace);

    void updateName(Long id, NormalizedText name);

    void updateLastName(Long id, NormalizedText lastName);

    void updateDocumentType(Long id, DocumentType documentType);

    void updateEmail(Long id, Email email);

    void updateActive(Long id, boolean status);

    void updateSystemAccess(Long id, boolean access);

    void updateAcademicLevel(Long id, AcademicLevel academicLevel);

    void updateWorkSpace(Long id, Set<WorkSpace> workSpaces);

    void deleteEmployee(Long id);
}