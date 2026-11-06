package com.msvc.employee.infraestructure.adapter.out.persistence.user;

import java.time.LocalDateTime;
import com.msvc.employee.infraestructure.adapter.out.persistence.employee.EmployeeJpaEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "users")
public class UserJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;

    @Column(name = "user_email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "user_password", nullable = false, length = 255)
    private String password;

    @Column(name = "user_active", nullable = false)
    private boolean active;

    @Column(name = "user_registration_date", nullable = false)
    private LocalDateTime registrationDate;

    @OneToOne
    @JoinColumn(name = "employee_id", unique = true)
    private EmployeeJpaEntity employee;

}
