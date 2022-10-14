package com.example.springcrudtemplate.controller;

import com.example.springcrudtemplate.dto.header.Header;
import com.example.springcrudtemplate.ifs.CrudInterface;
import com.example.springcrudtemplate.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
public abstract class CrudController<Req, Res, Entity> implements CrudInterface<Req, Res> {

    @Autowired(required = false)
    private BaseService<Req, Res, Entity> baseService;

    @Override
    @PostMapping("")
    public Header<Res> create(@RequestBody Header<Req> req) {
        return baseService.create(req);
    }

    @Override
    @GetMapping("{id}")
    public Header<Res> read(@PathVariable Long id) {
        return baseService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<Res> update(Header<Req> req) {
        return baseService.update(req);
    }

    @Override
    @DeleteMapping("")
    public Header<Res> delete(@PathVariable Long id) {
        return baseService.delete(id);
    }
}
