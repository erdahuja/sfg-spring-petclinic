package com.springframework.springpetclinic.repositories;

import com.springframework.springpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 8/5/18.
 */
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
