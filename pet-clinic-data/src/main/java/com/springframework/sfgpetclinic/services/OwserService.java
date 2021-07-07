package com.springframework.sfgpetclinic.services;

import com.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by donghee on 2021/07/07
 */
public interface OwserService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
