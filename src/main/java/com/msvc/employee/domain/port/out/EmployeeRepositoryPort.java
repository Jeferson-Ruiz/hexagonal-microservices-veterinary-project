package com.msvc.employee.domain.port.out;

import java.util.List;
import java.util.Optional;
import com.msvc.employee.domain.models.Employee;
import com.msvc.employee.domain.models.WorkSpace;

public interface EmployeeRepositoryPort {
    Employee save(Employee employee);

    Optional<Employee> findById(Long id);

    Optional<Employee> findByIdentificationNumber(String number);

    List<Employee> findAll();

    List<Employee> findAllByWorkSpace(WorkSpace workSpace);

    boolean existsByEmail(String email);

    boolean existsByDocumentNumber(String documentNumber);

}
