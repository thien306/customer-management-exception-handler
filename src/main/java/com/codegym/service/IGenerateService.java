package com.codegym.service;

import com.codegym.exception.DuplicateEmailException;

import java.util.Optional;

public interface IGenerateService<T> {

    Iterable<T> findAll();

    Optional<T> findByID(Long id);

    void save(T t) throws DuplicateEmailException;

    void delete(Long id);
}
