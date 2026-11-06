package com.msvc.employee.infraestructure.adapter.out.persistence.employee;

import java.time.LocalDate;
import java.util.Set;
import com.msvc.employee.domain.models.WorkSpace;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "employees")
public class EmployeeJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Long id;

    @Column(name = "empl_name", nullable = false, length = 50)
    private String name;

    @Column(name = "empl_lastname", nullable = false, length = 50)
    private String lastName;

    @Column(name = "empl_document_type", nullable = false)
    private String documentType;

    @Column(name = "empl_document_number", nullable = false, unique = true, length = 100)
    private String documentNumber;

    @Column(name = "empl_email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "empl_active", nullable = false)
    private boolean active;

    @Column(name = "empl_system_access", nullable = false)
    private boolean systemAccess;

    @Column(name = "empl_registration_date", nullable = false)
    private LocalDate registrationDate;

    @Column(name = "empl_academic_level", nullable = false)
    private String academicLevel;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @Column(name = "work_space")
    private Set<WorkSpace> workSpaces;

}
