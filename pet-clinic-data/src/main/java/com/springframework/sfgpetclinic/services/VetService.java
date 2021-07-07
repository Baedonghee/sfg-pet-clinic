package com.springframework.sfgpetclinic.services;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by donghee on 2021/07/07
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
