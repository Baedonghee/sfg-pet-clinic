package com.springframework.sfgpetclinic.services;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by donghee on 2021/07/07
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
