package com.ms.spring_security_jwt.infrastructure.repository;

import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseSoftDeleteRepository <T,ID extends Serializable> {
//    Optional<T> findOneAvailable(ID id);
//
//    List<T> findAllAvailable();
//
//    Page<T> findAllAvailable(UrlParamService urlParamService);
//
//    void restore(ID id);
//
//    void softDelete(ID id);
//
//    Boolean existByIdAvailable(ID id);
//
//    Boolean existByFieldAvailable(String attributeName, String attributeValue);
}
