package com.tp.tp5.model;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepository extends CrudRepository< Address , Long > {


}