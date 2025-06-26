package com.ms.spring_security_jwt.infrastructure.service.implementation;

import com.ms.spring_security_jwt.infrastructure.model.request.BaseRequest;
import com.ms.spring_security_jwt.infrastructure.repository.BaseRepository;
import com.ms.spring_security_jwt.infrastructure.service.BaseCrudService;
import com.ms.spring_security_jwt.infrastructure.service.BaseService;

import java.io.Serializable;

public class BaseCrudServiceImpl<T, ID extends Serializable> implements BaseCrudService<T ,ID>, BaseService<T, ID> {
    @Override
    public T create(BaseRequest<T> req) {
        return getRepository().save(req.toEntity());
    }

    @Override
    public BaseRepository<T, ID> getRepository() {
        return null;
    }
}
