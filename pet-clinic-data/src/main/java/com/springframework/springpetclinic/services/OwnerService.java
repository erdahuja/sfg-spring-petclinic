package com.springframework.springpetclinic.services;

import com.springframework.springpetclinic.model.Owner;


/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
