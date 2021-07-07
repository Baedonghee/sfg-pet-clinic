package com.springframework.sfgpetclinic.services;

import com.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by donghee on 2021/07/07
 */
public interface OwserService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
