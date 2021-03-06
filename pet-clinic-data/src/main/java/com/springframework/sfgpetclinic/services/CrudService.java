package com.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by donghee on 2021/07/07
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
