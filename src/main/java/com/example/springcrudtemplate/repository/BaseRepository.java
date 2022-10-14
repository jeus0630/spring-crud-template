package com.example.springcrudtemplate.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseRepository<Entity> {

    @Autowired(required = false)
    protected JpaRepository<Entity, Long> baseRepository;
}
