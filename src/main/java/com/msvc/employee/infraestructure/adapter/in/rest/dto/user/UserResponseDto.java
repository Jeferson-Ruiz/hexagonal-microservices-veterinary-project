package com.msvc.employee.infraestructure.adapter.in.rest.dto.user;

import java.time.LocalDateTime;

public record UserResponseDto(
        Long id,
        String email,
        boolean active,
        LocalDateTime registrationDate,
        Long employeeId) {
}
