package com.msvc.employee.domain.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Object id) {
        super("Entity not found with id: " + id);
    }

}
