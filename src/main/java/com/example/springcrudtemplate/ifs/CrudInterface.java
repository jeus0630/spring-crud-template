package com.example.springcrudtemplate.ifs;

import com.example.springcrudtemplate.dto.header.Header;

public interface CrudInterface<Req,Res> {

    Header<Res> create(Header<Req> req);

    Header<Res> read(Long id);

    Header<Res> update(Header<Req> req);

    Header<Res> delete(Long id);
}
